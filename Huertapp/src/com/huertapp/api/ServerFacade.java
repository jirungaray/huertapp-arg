package com.huertapp.api;

import java.io.IOException;
import java.util.List;

import android.content.Context;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.gson.GsonFactory;
import com.huertapp.model.gardenAPI.GardenAPI;
import com.huertapp.model.gardenAPI.model.Garden;

public class ServerFacade {

	static GardenAPI gardenApi = new GardenAPI.Builder( AndroidHttp.newCompatibleTransport(), new GsonFactory(),null).build();
	
	
	public static List<Garden> listAllGardens(){
		try {
			return gardenApi.listGardens().execute().getItems();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static Garden saveGarden(Garden garden){
		try {
			return gardenApi.addGarden(garden).execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
