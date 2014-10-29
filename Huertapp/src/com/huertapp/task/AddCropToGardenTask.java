package com.huertapp.task;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

public class AddCropToGardenTask extends AsyncTask<String, Void, Void> {

	private Context context;
	private ProgressDialog dialog;
	
	
	public AddCropToGardenTask(Context context) {
		super();
		this.context = context;
	}


	@Override
	protected void onPreExecute() {
		dialog = ProgressDialog.show(context, "Guardando Huerta","Aguarde un instante");
	}


	@Override
	protected Void doInBackground(String... params) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	protected void onPostExecute(Void result) {
		dialog.dismiss();
		((Activity)context).finish();
	}


}
