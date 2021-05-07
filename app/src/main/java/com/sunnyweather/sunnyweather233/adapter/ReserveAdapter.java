package com.sunnyweather.sunnyweather233.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunnyweather.sunnyweather233.R;
import com.sunnyweather.sunnyweather233.bean.ReserveBean;

public class ReserveAdapter extends RecyclerView.Adapter<ReserveAdapter.ViewHolder> {

    private ReserveBean.ResultBean.DailyBean dailyBean;

    private Context mContext;


    public ReserveAdapter(ReserveBean.ResultBean.DailyBean dailyBean) {
        this.dailyBean = dailyBean;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.pre_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.preTime.setText(dailyBean.getSkycon().get(position).getDate().substring(0,10));
        switch (dailyBean.getSkycon().get(position).getValue()){
            case "CLEAR_DAY":
                holder.preIcon.setImageResource(R.drawable.ic_clear_day);
                holder.preholder.setText("晴");
                break;
            case "CLEAR_NIGHT":
                holder.preIcon.setImageResource(R.drawable.ic_clear_night);
                holder.preholder.setText("晴");
                break;
            case "PARTLY_CLOUDY_DAY":
                holder.preIcon.setImageResource(R.drawable.ic_partly_cloud_day);
                holder.preholder.setText("多云");
                break;
            case "PARTLY_CLOUDY_NIGHT":
                holder.preIcon.setImageResource(R.drawable.ic_partly_cloud_night);
                holder.preholder.setText("多云");
                break;
            case "CLOUDY":
                holder.preIcon.setImageResource(R.drawable.ic_cloudy);
                holder.preholder.setText("阴");
                break;
            case "LIGHT_HAZE":
                holder.preIcon.setImageResource(R.drawable.ic_light_haze);
                holder.preholder.setText("轻度雾霾");
                break;
            case "MODERATE_HAZE":
                holder.preIcon.setImageResource(R.drawable.ic_moderate_haze);
                holder.preholder.setText("中度雾霾");
                break;
            case "HEAVY_HAZE":
                holder.preIcon.setImageResource(R.drawable.ic_heavy_haze);
                holder.preholder.setText("重度雾霾");
                break;
            case "FOG":
                holder.preIcon.setImageResource(R.drawable.ic_fog);
                holder.preholder.setText("雾");
                break;
            case "LIGHT_RAIN":
                holder.preIcon.setImageResource(R.drawable.ic_light_rain);
                holder.preholder.setText("小雨");
                break;
            case "MODERATE_RAIN":
                holder.preIcon.setImageResource(R.drawable.ic_moderate_rain);
                holder.preholder.setText("中雨");
                break;
            case "HEAVY_RAIN":
                holder.preIcon.setImageResource(R.drawable.ic_heavy_rain);
                holder.preholder.setText("大雨");
                break;
            case "STORM_RAIN":
                holder.preIcon.setImageResource(R.drawable.ic_storm_rain);
                holder.preholder.setText("暴雨");
                break;
            case "THUNDER_SHOWER":
                holder.preIcon.setImageResource(R.drawable.ic_thunder_shower);
                holder.preholder.setText("雷阵雨");
                break;
            case "SLEET":
                holder.preIcon.setImageResource(R.drawable.ic_sleet);
                holder.preholder.setText("雨夹雪");
                break;
            case "LIGHT_SNOW":
                holder.preIcon.setImageResource(R.drawable.ic_light_snow);
                holder.preholder.setText("小雪");
                break;
            case "MODERATE_SNOW":
                holder.preIcon.setImageResource(R.drawable.ic_moderate_snow);
                holder.preholder.setText("中雪");
                break;
            case "HEAVY_SNOW":
                holder.preIcon.setImageResource(R.drawable.ic_heavy_snow);
                holder.preholder.setText("大雪");
                break;
            case "STORM_SNOW":
                holder.preIcon.setImageResource(R.drawable.ic_heavy_snow);
                holder.preholder.setText("暴雪");
                break;
            case "HAIL":
                holder.preIcon.setImageResource(R.drawable.ic_hail);
                holder.preholder.setText("冰雹");
                break;
            case "DUST":
                holder.preIcon.setImageResource(R.drawable.ic_fog);
                holder.preholder.setText("浮尘");
                break;
            case "SAND":
                holder.preIcon.setImageResource(R.drawable.ic_fog);
                holder.preholder.setText("沙尘");
                break;
            case "WIND":
                holder.preIcon.setImageResource(R.drawable.ic_cloudy);
                holder.preholder.setText("大风");
                break;
        }
        holder.preTemperature.setText((int)(dailyBean.getTemperature().get(position).getMin())+"~"
        +(int)(dailyBean.getTemperature().get(position).getMax())+" ℃");
    }

    @Override
    public int getItemCount() {
        return dailyBean.getAstro().size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView preTime;
        private ImageView preIcon;
        private TextView preholder;
        private TextView preTemperature;

        public ViewHolder(@NonNull View view) {
            super(view);
            preTime = (TextView) view.findViewById(R.id.pre_time);
            preIcon = (ImageView) view.findViewById(R.id.pre_icon);
            preholder = (TextView) view.findViewById(R.id.pre_weather);
            preTemperature = (TextView) view.findViewById(R.id.pre_temperature);
        }
    }
}
