package com.imaginers.tonmo.fineweather.listener;

import com.imaginers.tonmo.fineweather.data.Channel;

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
