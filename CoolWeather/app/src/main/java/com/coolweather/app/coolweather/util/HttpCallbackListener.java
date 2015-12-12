package com.coolweather.app.coolweather.util;

/**
 * Created by jack on 2015/12/9.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
