package com.sunnyweather.sunnyweather233.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.gson.Gson;
import com.sunnyweather.sunnyweather233.MainActivity;
import com.sunnyweather.sunnyweather233.R;
import com.sunnyweather.sunnyweather233.adapter.ReserveAdapter;
import com.sunnyweather.sunnyweather233.bean.ReserveBean;
import com.sunnyweather.sunnyweather233.bean.WeatherBean;
import com.sunnyweather.sunnyweather233.util.HttpUtils;
import com.sunnyweather.sunnyweather233.util.OkHttpCallback;
import com.sunnyweather.sunnyweather233.viewmodel.WeatherViewModel;
import com.sunnyweather.sunnyweather233.viewmodel.WeatherViewModelFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherDetails extends AppCompatActivity  {

    private CollapsingToolbarLayout collBar;
    private Toolbar detailTb;
    private TextView toolTitle;
    private WeatherViewModel viewModel;
    public static DrawerLayout drawLayout;
    private WeatherBean.ResultBean.RealtimeBean real = new WeatherBean.ResultBean.RealtimeBean();
    private Gson gson = new Gson();
    private ImageView detailIm;
    private RecyclerView preRe;
    private TextView temp;
    private TextView wea;
    private TextView air;
    public static SwipeRefreshLayout swip;
    private ReserveBean.ResultBean.DailyBean dailyBean = new ReserveBean.ResultBean.DailyBean();
    private TextView cold;
    private TextView dress;
    private TextView zwx;
    private TextView washCar;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private String lngLat;
    public static int flag = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_weather_details);
        initView();

        Intent intent = getIntent();

        if (MainActivity.sp.getString("name", "").equals("")||flag==1) {
            MainActivity.sp.edit().putString("name", intent.getStringExtra("name")).apply();
            MainActivity.sp.edit().putString("lngLat", intent.getStringExtra("lng,lat")).apply();
        }
        String name = MainActivity.sp.getString("name", "");
        lngLat = MainActivity.sp.getString("lngLat", "");
        viewModel.saveAdress(name, lngLat);
        doHttpRequest(lngLat);
        doReserveHttp(lngLat);
        swip.setColorSchemeResources(R.color.colorPrimary);
        swip.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                doFresh();
            }
        });


        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }


        setSupportActionBar(detailTb);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_home);
        }
        collBar.setTitle(" ");
        toolTitle.setText(viewModel.adressLiveData.getValue().get("name"));



    }

    public void doFresh(){
        doHttpRequest(lngLat);
        doReserveHttp(lngLat);
    }

    private void doLifeIndex(){
        Date date = new Date(System.currentTimeMillis());
        for(int i=0;i<viewModel.reserveBean.getValue().getTemperature().size();i++){
            if(viewModel.reserveBean.getValue().getTemperature().get(i).getDate().substring(0,10).equals(simpleDateFormat.format(date))){
                ReserveBean.ResultBean.DailyBean.LifeIndexBean life = viewModel.reserveBean.getValue().getLife_index();
                cold.setText(life.getColdRisk().get(i).getDesc());
                dress.setText(life.getDressing().get(i).getDesc());
                zwx.setText(life.getUltraviolet().get(i).getDesc());
                washCar.setText(life.getCarWashing().get(i).getDesc());
                break;
            }
        }
        swip.setRefreshing(false);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawLayout.openDrawer(GravityCompat.START);
                break;
        }
        return true;
    }

    private void doReserveHttp(final String lngLat) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpUtils.doGet("https://api.caiyunapp.com/v2.5/" + HttpUtils.TOKEN + "/" + lngLat + "/daily.json", new OkHttpCallback() {
                    @Override
                    public void onSuccess(String sucessString) throws IOException {
                        viewModel.reserveBean.postValue(gson.fromJson(sucessString, ReserveBean.class).getResult().getDaily());
                        handler.sendEmptyMessage(2);
                    }

                    @Override
                    public void onFailure(String exceptionString) {

                    }
                });
            }
        }).start();
    }

    private void doHttpRequest(final String lngLat) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpUtils.doGet("https://api.caiyunapp.com/v2.5/" + HttpUtils.TOKEN + "/" + lngLat + "/realtime.json", new OkHttpCallback() {
                    @Override
                    public void onSuccess(String sucessString) throws IOException {
                        viewModel.weatherBean.postValue(gson.fromJson(sucessString, WeatherBean.class).getResult().getRealtime());
                        handler.sendEmptyMessage(1);
                    }

                    @Override
                    public void onFailure(String exceptionString) {

                    }
                });
            }
        }).start();

    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            switch (msg.what) {
                case 1:
                    doUI();
                    break;
                case 2:
                    doReserveUI();
                    break;
            }
        }
    };

    private void doReserveUI() {
        ReserveAdapter adapter = new ReserveAdapter(viewModel.reserveBean.getValue());
        LinearLayoutManager manager = new LinearLayoutManager(this);
        preRe.setLayoutManager(manager);
        preRe.setAdapter(adapter);
        doLifeIndex();
    }

    private void doUI() {
        switch (viewModel.getSkycon()) {
            case "CLEAR_DAY":
                Glide.with(this).load(R.drawable.bg_clear_day).into(detailIm);
                wea.setText("晴");
                break;
            case "CLEAR_NIGHT":
                Glide.with(this).load(R.drawable.bg_clear_night).into(detailIm);
                wea.setText("晴");
                break;
            case "PARTLY_CLOUDY_DAY":
                Glide.with(this).load(R.drawable.bg_partly_cloudy_day).into(detailIm);
                wea.setText("多云");
                break;
            case "PARTLY_CLOUDY_NIGHT":
                Glide.with(this).load(R.drawable.bg_partly_cloudy_night).into(detailIm);
                wea.setText("多云");
                break;
            case "CLOUDY":
                Glide.with(this).load(R.drawable.bg_cloudy).into(detailIm);
                wea.setText("阴");
                break;
            case "LIGHT_HAZE":
                Glide.with(this).load(R.drawable.bg_fog).into(detailIm);
                wea.setText("轻度雾霾");
                break;
            case "MODERATE_HAZE":
                Glide.with(this).load(R.drawable.bg_fog).into(detailIm);
                wea.setText("中度雾霾");
                break;
            case "HEAVY_HAZE":
                Glide.with(this).load(R.drawable.bg_fog).into(detailIm);
                wea.setText("重度雾霾");
                break;
            case "FOG":
                Glide.with(this).load(R.drawable.bg_fog).into(detailIm);
                wea.setText("雾");
                break;
            case "LIGHT_RAIN":
                Glide.with(this).load(R.drawable.bg_rain).into(detailIm);
                wea.setText("小雨");
                break;
            case "MODERATE_RAIN":
                Glide.with(this).load(R.drawable.bg_rain).into(detailIm);
                wea.setText("中雨");
                break;
            case "HEAVY_RAIN":
                Glide.with(this).load(R.drawable.bg_rain).into(detailIm);
                wea.setText("大雨");
                break;
            case "STORM_RAIN":
                Glide.with(this).load(R.drawable.bg_rain).into(detailIm);
                wea.setText("暴雨");
                break;
            case "THUNDER_SHOWER":
                Glide.with(this).load(R.drawable.bg_rain).into(detailIm);
                wea.setText("雷阵雨");
                break;
            case "SLEET":
                Glide.with(this).load(R.drawable.bg_rain).into(detailIm);
                wea.setText("雨夹雪");
                break;
            case "LIGHT_SNOW":
                Glide.with(this).load(R.drawable.bg_snow).into(detailIm);
                wea.setText("小雪");
                break;
            case "MODERATE_SNOW":
                Glide.with(this).load(R.drawable.bg_snow).into(detailIm);
                wea.setText("中雪");
                break;
            case "HEAVY_SNOW":
                Glide.with(this).load(R.drawable.bg_snow).into(detailIm);
                wea.setText("大雪");
                break;
            case "STORM_SNOW":
                Glide.with(this).load(R.drawable.bg_snow).into(detailIm);
                wea.setText("暴雪");
                break;
            case "HAIL":
                Glide.with(this).load(R.drawable.bg_snow).into(detailIm);
                wea.setText("冰雹");
                break;
            case "DUST":
                Glide.with(this).load(R.drawable.bg_fog).into(detailIm);
                wea.setText("浮尘");
                break;
            case "SAND":
                Glide.with(this).load(R.drawable.bg_fog).into(detailIm);
                wea.setText("沙尘");
                break;
            case "WIND":
                Glide.with(this).load(R.drawable.bg_wind).into(detailIm);
                wea.setText("大风");
                break;
        }

        temp.setText(viewModel.getTemp() + " ℃");
        air.setText("空气指数 " + viewModel.getAqi());
    }

    private void initView() {
        collBar = (CollapsingToolbarLayout) findViewById(R.id.coll_bar);
        detailTb = (Toolbar) findViewById(R.id.detail_tb);
        toolTitle = (TextView) findViewById(R.id.tool_title);
        drawLayout = (DrawerLayout) findViewById(R.id.draw_layout);
        detailIm = (ImageView) findViewById(R.id.detail_im);
        preRe = (RecyclerView) findViewById(R.id.pre_re);
        temp = (TextView) findViewById(R.id.temp);
        wea = (TextView) findViewById(R.id.wea);
        air = (TextView) findViewById(R.id.air);
        swip = (SwipeRefreshLayout) findViewById(R.id.swip);
        viewModel = ViewModelProviders.of(this, new WeatherViewModelFactory(real)).get(WeatherViewModel.class);
        cold = (TextView) findViewById(R.id.cold);
        dress = (TextView) findViewById(R.id.dress);
        zwx = (TextView) findViewById(R.id.zwx);
        washCar = (TextView) findViewById(R.id.wash_car);
    }

}