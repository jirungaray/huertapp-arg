package com.huertapp.volley.model;

import java.util.List;

public class WeatherInfo {

	String list;
	
//	List<WeatherDetail> list;

	class WeatherDetail {
		TemperaturDetail main;
		WeatherDescription weather;
	}
	
	class TemperaturDetail {
		String temp;
        String pressure;
        String humidity;
        String temp_min;
        String temp_max;	
	}
	
	class WeatherDescription {
		
	}
}
