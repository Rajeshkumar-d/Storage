package com.example.storage;

import java.util.Random;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public class ServiceForPhoneDialStateChange extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
		public void OnCreate()
		{
		
//			 PhoneStateListener li = new phlistener();
//			 TelephonyManager  tm = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
//			 tm.listen(li, PhoneStateListener.LISTEN_CALL_STATE);
		}
		  public int onStartCommand(Intent intent, int flags, int startId) {

			  PhoneStateListener li = new phlistener();
				 TelephonyManager  tm = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
				 tm.listen(li, PhoneStateListener.LISTEN_CALL_STATE);
			    return Service.START_NOT_STICKY;
			    
			  }

			  

			  public class MyBinder extends Binder {
				  ServiceForPhoneDialStateChange getService() {
			      return ServiceForPhoneDialStateChange.this;
			    }
			  }

			 
	}


