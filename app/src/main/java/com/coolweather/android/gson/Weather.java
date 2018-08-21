package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wyj on 2018/8/16.
 */

public class Weather {
    public String status;
    public Basic basic;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
    public Now now;
    public Suggestion suggestion;
    public AQI aqi;

}
