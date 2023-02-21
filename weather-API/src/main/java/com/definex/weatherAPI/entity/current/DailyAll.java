package com.definex.weatherAPI.entity.current;

import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;


@Getter
@Setter
public class DailyAll {
    private Coord coord;
    private City city;
    private ArrayList<Weather> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private Snow snow;
    private int date;
    private Sys sys;
    private int timezone;
    private int id;

    private String name;

    private int cod;
}
