package com.example.storage;

import java.util.List;




import android.app.Activity;
import android.app.ActivityManager;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;



import android.content.pm.PackageManager;

import android.os.Bundle;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {
	
	 protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         
         setContentView(R.layout.activity_main);
	
	 }
	 
	 public void StartServiceBtnClicked(View v){
		
		 Intent serviceIntent = new Intent(this,ServiceForPhoneDialStateChange.class);
		// serviceIntent.setAction("com.example.storage.ServiceForPhoneDialStateChange");
		 startService(serviceIntent);
		 
//		 PhoneStateListener li = new phlistener();
//		 TelephonyManager  tm = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
//		 tm.listen(li, PhoneStateListener.LISTEN_CALL_STATE);
		 
		 
		 PackageManager pk = getPackageManager();
		 pk.setComponentEnabledSetting(new ComponentName(this,CallReceiver.class), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
		 
		 ActivityManager am = (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);



	     // get the info from the currently running task
	     List< ActivityManager.RunningTaskInfo > taskInfo = am.getRunningTasks(1); 

	     Log.w("topActivity", "CURRENT Activity ::"
	             + taskInfo.get(0).topActivity.getClassName());

	     ComponentName componentInfo = taskInfo.get(0).topActivity;
	
	   
	   Log.w("topActivity 2", "CURRENT ac2 ::"
	             + componentInfo.getPackageName());
		 this.finish();
		 
	 }
	 
	 public void cancelServiceBtnClicked(View v){
		 PackageManager pk = getPackageManager();
		 pk.setComponentEnabledSetting(new ComponentName(this,CallReceiver.class), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
			this.finish();
		
		 }
}
