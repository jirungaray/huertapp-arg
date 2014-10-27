package com.huertapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class WikiCropDetail extends Activity {

	// inside Activity
	 TextView txt_help_gest;

	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_wiki_crop_detail);

	    txt_help_gest = (TextView) findViewById(R.id.txt_help_gest);
	    // hide until its title is clicked
	    txt_help_gest.setVisibility(View.GONE);
	}

	/**
	* onClick handler
	*/
	 public void toggle_contents(View v){

		  if(txt_help_gest.isShown()){
		    slide_up(this, txt_help_gest);
		    txt_help_gest.setVisibility(View.GONE);
		  }
		  else{
		    txt_help_gest.setVisibility(View.VISIBLE);
		    slide_down(this, txt_help_gest);
		  }
		}
	
	 public static void slide_down(Context ctx, View v){

		  Animation a = AnimationUtils.loadAnimation(ctx, R.anim.slide_down);
		  if(a != null){
		     a.reset();
		     if(v != null){
		      v.clearAnimation();
		      v.startAnimation(a);
		     }
		  }
		}
	 
	 public static void slide_up(Context ctx, View v){

		  Animation a = AnimationUtils.loadAnimation(ctx, R.anim.slide_up);
		  if(a != null){
		     a.reset();
		     if(v != null){
		      v.clearAnimation();
		      v.startAnimation(a);
		     }
		  }
		}
}
