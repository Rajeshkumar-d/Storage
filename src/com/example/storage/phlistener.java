package com.example.storage;

import android.app.ActivityManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;


public class phlistener extends PhoneStateListener {
	
	// private static final String "ACTIVITY_SERVICE" = null;

	public final void onCallStateChanged(int paramInt, String paramString)
	  {
	    super.onCallStateChanged(paramInt, paramString);
	  
	    switch (paramInt) {
	    case TelephonyManager.CALL_STATE_RINGING:
	    	Log.w("state", "come");
	     break;
	    case TelephonyManager.CALL_STATE_OFFHOOK:
	    {
	    	
	    	Log.w("state", "come1");
	     break;
	    }
	    case TelephonyManager.CALL_STATE_IDLE:
	    {
	    
            CallReceiver.current_state="IDLE";
	    	Log.e("state", "come2");
	    }
	     break;
	    default:
	    	Log.w("state", "come3");
	   
	    }
	  
	    }
	  }


