package com.example.storage;

import android.app.Activity;

import android.content.ComponentName;



import android.content.pm.PackageManager;

import android.os.Bundle;

import android.view.View;


public class MainActivity extends Activity {
	
	 protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
	
	 }
	 
	 public void StartServiceBtnClicked(View v){
		
		 PackageManager pk = getPackageManager();
		 pk.setComponentEnabledSetting(new ComponentName(this,CallReceiver.class), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
		 
		 this.finish();
		 
	 }
	 
	 public void cancelServiceBtnClicked(View v){
		 PackageManager pk = getPackageManager();
		 pk.setComponentEnabledSetting(new ComponentName(this,CallReceiver.class), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
			this.finish();
			 
		
		
			
		 }
}
