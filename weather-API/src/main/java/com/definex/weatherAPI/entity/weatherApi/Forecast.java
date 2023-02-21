package com.definex.weatherAPI.entity.weatherApi;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Forecast {
    private ArrayList<Forecastday> forecastday;
}
