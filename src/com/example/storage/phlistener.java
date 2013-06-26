package com.example.storage;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;


public class phlistener extends PhoneStateListener {
	
	 public final void onCallStateChanged(int paramInt, String paramString)
	  {
	    super.onCallStateChanged(paramInt, paramString);
	  
	    switch (paramInt) {
	    case TelephonyManager.CALL_STATE_RINGING:
	    	Log.w("state", "come");
	     break;
	    case TelephonyManager.CALL_STATE_OFFHOOK:
	    	Log.w("state", "come1");
	     break;
	    case TelephonyManager.CALL_STATE_IDLE:
	    	Log.w("state", "come2");
	     break;
	    default:
	    	Log.w("state", "come3");
	   
	    }
	  
	    }
	  }


