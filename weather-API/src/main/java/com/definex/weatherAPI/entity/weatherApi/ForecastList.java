package com.definex.weatherAPI.entity.weatherApi;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ForecastList {
    private Location location;
    private Current current;
    private Forecast forecast;
}
