package com.xiyu.weather.service.impl;

import com.xiyu.weather.service.WeatherDataService;
import com.xiyu.weather.vo.weather.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;

public class WeatherDataServiceImpl implements WeatherDataService {
    @Value("")
    String url;

    @Override
    public WeatherResponse getDataByCity(String city) {

        return null;
    }

    @Override
    public WeatherResponse getDataById(String id) {
        return null;
    }
}
