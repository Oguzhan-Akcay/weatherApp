package com.definex.weatherAPI.service;

import com.definex.weatherAPI.entity.current.DailyAll;
import com.definex.weatherAPI.entity.weatherApi.ForecastList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@RequiredArgsConstructor
@Service
public class WeatherApiService {

    private final String OpenWeatherUrl =
            "https://api.openweathermap.org/data/2.5/weather?q=";

    private static final String WeatherUrl =
            "http://api.weatherapi.com/v1/forecast.json?key=";
    private final RestTemplate restTemplate;
    private final String openWetherMapKey = "cc6da3bbcd69b5cf84d74608a176a7ca";
    private final String weatherApiKey = "f3079ad502a949bea85111757230402";

    public DailyAll getWeatherDaily(String cityName) throws HttpMessageNotReadableException {
        DailyAll dailyRoot = restTemplate.getForObject(OpenWeatherUrl + cityName + "&appid=" + openWetherMapKey,
                DailyAll.class);
        return dailyRoot;
    }

    public ForecastList getWeatherWeekly(String cityName, Integer day) throws Exception {
        ForecastList forecastRoot = restTemplate.getForObject(WeatherUrl + weatherApiKey +
                        "&q=" + cityName + "&days=" + day + "&aqi=no&alerts=no",
                ForecastList.class);
        if (day == null) {
            throw new Exception();
        }
        if (day < 0 || day > 7) {
            throw new Exception("Enter True Day");
        }
        return forecastRoot;
    }


}
