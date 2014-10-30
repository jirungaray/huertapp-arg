package com.huertapp.task;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.huertapp.FakeDB;
import com.huertapp.api.ServerFacade;
import com.huertapp.model.gardenAPI.model.Garden;

public class SaveGardenTask extends AsyncTask<String, Void, Void> {

	private Context context;
	private ProgressDialog dialog;
	
	public SaveGardenTask(Context context) {
		super();
		this.context = context;
	}


	@Override
	protected void onPreExecute() {
		dialog = ProgressDialog.show(context, "Guardando Huerta","Aguarde un instante");
	}


	@Override
	protected Void doInBackground(String... params) {
			Garden toSave = new Garden();
			//TODO setear todos los valores
			toSave.setName(params[0]);
			toSave.setType(params[1]);
			toSave.setWidth(Float.parseFloat(params[2]));
			toSave.setLength(Float.parseFloat(params[3]));
			ServerFacade.saveGarden(toSave);
			return null;
	}
	
	@Override
	protected void onPostExecute(Void result) {
		dialog.dismiss();
		((Activity)context).finish();
	}


}
