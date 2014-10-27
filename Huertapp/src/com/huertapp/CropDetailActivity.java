package com.huertapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CropDetailActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crop_detail);
		
		ListView actions = (ListView) findViewById(R.id.cropDetailActionList);
		actions.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{"10/10/2014 - Riego","1/10/2014 - Aplicación Insecticida","23/9/2014 - Riego","15/9/2014 - Raleo","10/9/2014 - Riego"}));
	}

	public void openPlagueWiki(View view){
		startActivity(new Intent(this,WikiActivity.class));
	}
	
	public void openWiki(View view){
		startActivity(new Intent(this,WikiActivity.class));
	}
}
