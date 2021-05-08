package com.sunnyweather.sunnyweather233;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.sunnyweather.sunnyweather233.activity.WeatherDetails;


public class MainActivity extends AppCompatActivity {

    public static SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //输入框不自动弹出|输入框弹出时不会挤压布局
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(R.layout.activity_main);
        sp = getPreferences(Context.MODE_PRIVATE);
        //判断是否第一次进入
        if(sp.getInt("FirstInto",0) == 1){
            startActivity(new Intent(this, WeatherDetails.class));
            finish();
        }

    }
}