package com.example.storage;

import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;

public class CallContentObserver extends ContentObserver {
   

    public CallContentObserver(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override
    public void onChange(boolean selfChange) {
        Log.w("callChange" , "MyContentObserver.onChange( " + selfChange
                + ")");
        super.onChange(selfChange);
        
       // http://stackoverflow.com/questions/4975443/is-there-a-way-to-use-the-speechrecognizer-api-directly-for-speech-input
  

    }
}
