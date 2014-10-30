package com.huertapp.volley.model;

import java.util.List;

public class WeatherInfo {

	List<WeatherDetail> forecast;

	class WeatherDetail {
		 String code;
		 String  date;
	       String day;
	       String high;
	       String low;
	       String text;
	}
	
}
