package com.example.storage;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;



public class CallReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		//TelephonyManager mgr = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
		 
		
		//Log.w("abcd", Integer.toString(mgr.getCallState()));
		Log.w("abcd", "efgh");
		
	}
    
}
