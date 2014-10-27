package com.huertapp.task;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.huertapp.volley.ServerFacade;
import com.huertapp.volley.model.WeatherInfo;

public class GetWeatherTask extends AsyncTask<String, Void, WeatherInfo> {

	private Context context;

	public GetWeatherTask(Context context) {
		this.context = context;
	}

	@Override
	protected WeatherInfo doInBackground(String... params) {
		ServerFacade.getWeatherInfo(context,params[0] ,new Listener<WeatherInfo>() {

			@Override
			public void onResponse(WeatherInfo arg0) {
				Log.e("EEEE", arg0.toString());	
				return;
			}
			
		}, new ErrorListener(){

			@Override
			public void onErrorResponse(VolleyError arg0) {
				Log.e("EEEE", arg0.toString());	
				
			}
			
		});
		return null;
	}


	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();
	}

}
