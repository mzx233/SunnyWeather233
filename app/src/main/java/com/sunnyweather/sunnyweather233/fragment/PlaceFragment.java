package com.sunnyweather.sunnyweather233.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.sunnyweather.sunnyweather233.R;
import com.sunnyweather.sunnyweather233.adapter.RecyclerAdapter;
import com.sunnyweather.sunnyweather233.bean.AdressBean;
import com.sunnyweather.sunnyweather233.util.HttpUtils;
import com.sunnyweather.sunnyweather233.util.OkHttpCallback;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaceFragment extends Fragment {

    private EditText searchEt;
    private RecyclerView recycler;
    private List<AdressBean.PlacesBean> placeList = new ArrayList<>();
    private Gson gson = new Gson();
    private RecyclerAdapter adapter;
    private View view;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_place, container, false);

        initView();

        searchEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                doSearchPlace(s + "");
            }
        });

        return view;
    }

    private void initView() {
        searchEt = (EditText) view.findViewById(R.id.search_et);
        recycler = (RecyclerView) view.findViewById(R.id.recycler);
    }

    private void doSearchPlace(final String place) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpUtils.doGet("https://api.caiyunapp.com/v2/place?query=" + place, new OkHttpCallback() {
                    @Override
                    public void onSuccess(String sucessString) throws IOException {

                        if (sucessString.equals("error")) {
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    if(!TextUtils.isEmpty(place)){
                                        Toast.makeText(getActivity(), "查询不到该地区", Toast.LENGTH_SHORT).show();
                                    }
                                    try {
                                        placeList.clear();
                                        adapter.notifyDataSetChanged();
                                    }catch (Exception e){

                                    }
                                }
                            });
                        } else {
                            placeList = gson.fromJson(sucessString, AdressBean.class).getPlaces();
                            handler.sendEmptyMessage(1);
                        }
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
        public void dispatchMessage(@NonNull Message msg) {
            switch (msg.what) {
                case 1:
                    doUI();
            }
        }
    };

    private void doUI() {
        adapter = new RecyclerAdapter(placeList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }
}
