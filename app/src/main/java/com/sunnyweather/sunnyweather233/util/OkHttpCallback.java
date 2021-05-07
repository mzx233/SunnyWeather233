package com.sunnyweather.sunnyweather233.util;

import java.io.IOException;

public interface OkHttpCallback {

   void onSuccess(String sucessString) throws IOException;

   void onFailure (String exceptionString);
}
