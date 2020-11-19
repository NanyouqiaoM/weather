package com.xiyu.weather.service;

import com.xiyu.weather.vo.weather.WeatherResponse;

public interface WeatherDataService {
    WeatherResponse getDataByCity(String city);

    WeatherResponse getDataById(String id);
}
