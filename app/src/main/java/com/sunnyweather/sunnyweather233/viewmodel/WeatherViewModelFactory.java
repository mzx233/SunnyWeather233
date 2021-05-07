package com.sunnyweather.sunnyweather233.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.sunnyweather.sunnyweather233.bean.WeatherBean;

public class WeatherViewModelFactory implements ViewModelProvider.Factory {

    private WeatherBean.ResultBean.RealtimeBean weather;
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new WeatherViewModel(weather);
    }

    public WeatherViewModelFactory (WeatherBean.ResultBean.RealtimeBean weather){
        this.weather = weather;
    }
}
