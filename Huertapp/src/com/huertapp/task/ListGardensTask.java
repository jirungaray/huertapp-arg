package com.huertapp.task;

import java.util.List;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import com.huertapp.FakeDB;
import com.huertapp.adapter.GardenAdapter;
import com.huertapp.api.ServerFacade;
import com.huertapp.model.gardenAPI.model.Garden;

public class ListGardensTask extends AsyncTask<String, Void, List<Garden>> {

	private Context context;
	private ProgressDialog dialog;
	private ListView resultView;
	
	public ListGardensTask(Context context, ListView resultView) {
		super();
		this.context = context;
		this.resultView = resultView;
	}


	@Override
	protected void onPreExecute() {
		dialog = ProgressDialog.show(context, "Listando Huertas","Aguarde un instante");
	}


	@Override
	protected List<Garden> doInBackground(String... params) {		
			return ServerFacade.listAllGardens();
	}
	
	@Override
	protected void onPostExecute(List<Garden> result) {
		if(result!= null){
			resultView.setAdapter(new GardenAdapter(context, result));
		}
		dialog.dismiss();
	}


}
