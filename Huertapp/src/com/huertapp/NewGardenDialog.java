package com.huertapp;

import com.huertapp.task.SaveGardenTask;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class NewGardenDialog extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_garden_dialog);
		
		 final TextView seekBarValue = (TextView)findViewById(R.id.lightValue); 

	       SeekBar seekbar = (SeekBar) findViewById(R.id.lightSeekBar);
		seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

					@Override
					public void onProgressChanged(SeekBar seekBar,
							int progress, boolean fromUser) {
						seekBarValue.setText(Math.round(progress)+"Horas por Día");
						
					}

					@Override
					public void onStartTrackingTouch(SeekBar seekBar) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onStopTrackingTouch(SeekBar seekBar) {
						// TODO Auto-generated method stub
						
					}});
		
		Spinner gardenTypes =  (Spinner) findViewById(R.id.gardenTypeSpinner);
		gardenTypes.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 ,new String[] {"Cantero","Hidroponica","Tierra Libre","Invernadero"}));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_garden_dialog, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void saveGarden(View view){
		EditText name = (EditText) findViewById(R.id.gardenNameEdit);
		Spinner gardenTypes =  (Spinner) findViewById(R.id.gardenTypeSpinner);
		EditText width = (EditText) findViewById(R.id.gardenWidthEdit);
		EditText height = (EditText) findViewById(R.id.gardenHeightEdit);
		new SaveGardenTask(this).execute(name.getText().toString(),gardenTypes.getSelectedItem().toString()+" - "+ width.getText().toString()+"m x "+height.getText().toString()+"m");
		
	}
}
