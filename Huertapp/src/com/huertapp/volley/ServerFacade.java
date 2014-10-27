package com.huertapp.volley;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.Volley;
import com.huertapp.volley.model.WeatherInfo;


public class ServerFacade {
	

	public static void getWeatherInfo(Context context,String location ,Listener<WeatherInfo> listener,ErrorListener errorListener){
		
		VolleyRequest<WeatherInfo> query = new VolleyRequest<WeatherInfo>("http://api.openweathermap.org/data/2.5/find?q="+location+"&units=metric", WeatherInfo.class, listener, errorListener);
		RequestQueue queue = Volley.newRequestQueue(context);
		queue.add(query);
	}
//	
//	public static void obtenerEstadFueraPistas(Context context, Listener<EstadoPistas> listener,ErrorListener errorListener) {
//		LLRequest<EstadoPistas> query = new LLRequest<EstadoPistas>("http://www.laslenas.com/mobile/laslenasapp/get_fuera_pistas.php", EstadoPistas.class, listener, errorListener);
//		RequestQueue queue = Volley.newRequestQueue(context);
//		queue.add(query);
//		
//	}
//	
//	public static void obtenerInfoClima(Context context, Listener<InfoClima> listener,ErrorListener errorListener){
//		
//		LLRequest<InfoClima> query = new LLRequest<InfoClima>("http://www.laslenas.com/mobile/laslenasapp/get_clima.php", InfoClima.class, listener, errorListener);
//		RequestQueue queue = Volley.newRequestQueue(context);
//		queue.add(query);
//	}
//	
//	public static void obtenerMedios(Context context, Listener<Medios> listener,ErrorListener errorListener){
//		
//		LLRequest<Medios> query = new LLRequest<Medios>("http://www.laslenas.com/mobile/laslenasapp/get_medios.php", Medios.class, listener, errorListener);
//		RequestQueue queue = Volley.newRequestQueue(context);
//		queue.add(query);
//	}
//
//	public static void obtenerEventos(Context context, Listener<InfoEventos> listener,ErrorListener errorListener){
//		
//		LLRequest<InfoEventos> query = new LLRequest<InfoEventos>("http://www.laslenas.com/mobile/laslenasapp/get_eventos.php", InfoEventos.class, listener, errorListener);
//		RequestQueue queue = Volley.newRequestQueue(context);
//		queue.add(query);
//	}

	//http://www.laslenas.com/mobile/laslenasapp/post_create_user.php
	
	
	
}
