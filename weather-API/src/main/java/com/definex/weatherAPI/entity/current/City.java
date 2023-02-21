package com.definex.weatherAPI.entity.current;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City {
    private int cityId;
    private String cityName;
    private Coord coord;
}
