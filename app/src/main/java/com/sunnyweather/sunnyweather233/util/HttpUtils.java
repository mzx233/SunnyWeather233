package com.sunnyweather.sunnyweather233.util;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtils {

    public static final String TOKEN = "byerLaU2aBe63BQ2";

    private static OkHttpClient client = new OkHttpClient();


    public static void doGet(String url, final OkHttpCallback callback){
        final Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onFailure(e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                String jsonString = response.body().string();
                try {
                    JSONObject jsonObject = new JSONObject(jsonString);
                    if(jsonObject.getString("status").equals("ok")){
                        callback.onSuccess(jsonString);
                    }else {
                        callback.onSuccess("error");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }



            }
        });
    }


}
