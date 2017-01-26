package com.imaginers.tonmo.fineweather.listener;

import com.imaginers.tonmo.fineweather.data.LocationResult;

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}
