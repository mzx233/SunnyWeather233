package com.sunnyweather.sunnyweather233.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sunnyweather.sunnyweather233.bean.ReserveBean;
import com.sunnyweather.sunnyweather233.bean.WeatherBean;

import java.util.HashMap;
import java.util.Map;

public class WeatherViewModel extends ViewModel {



    private Map<String,String> adress = new HashMap<>();

    public MutableLiveData<Map<String,String>> adressLiveData = new MutableLiveData<>();

    public MutableLiveData<WeatherBean.ResultBean.RealtimeBean> weatherBean = new MutableLiveData<>();

    public WeatherViewModel(WeatherBean.ResultBean.RealtimeBean weather) {
        weatherBean.setValue(weather);
    }

    public MutableLiveData<ReserveBean.ResultBean.DailyBean> reserveBean = new MutableLiveData<>();


    public String getSkycon(){
        return weatherBean.getValue().getSkycon();
    }

    public int getTemp(){
        return (int)weatherBean.getValue().getTemperature();
    }

    public int getAqi(){
        return (int)weatherBean.getValue().getAir_quality().getAqi().getChn();
    }

    public void saveAdress(String name,String lngLat){
        adress.put("name",name);
        adress.put("lngLat",lngLat);
        adressLiveData.setValue(adress);
    }



}
