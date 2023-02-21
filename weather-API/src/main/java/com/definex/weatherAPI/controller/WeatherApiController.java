package com.definex.weatherAPI.controller;

import com.definex.weatherAPI.entity.current.DailyAll;
import com.definex.weatherAPI.entity.weatherApi.ForecastList;
import com.definex.weatherAPI.service.WeatherApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/weather")
public class WeatherApiController {

    private final WeatherApiService weatherApiService;

    //http://localhost:9062/api/weather/daily/{cityName}
    //The request written for daily weather forecast.
    @GetMapping("/daily/{cityName}")
    public ResponseEntity<DailyAll> getWeatherDaily(@PathVariable String cityName) {
        return ResponseEntity.ok(weatherApiService.getWeatherDaily(cityName));
    }

    //http://localhost:9062/api/weather/weekly/{cityName}/{day}
    //The request written for weekly weather forecast.
    @GetMapping("/weekly/{cityName}/{day}")
    public ResponseEntity<ForecastList> getWeatherWeekly(@PathVariable String cityName, @PathVariable Integer day) throws Exception {
        return ResponseEntity.ok(weatherApiService.getWeatherWeekly(cityName, day));
    }

}
