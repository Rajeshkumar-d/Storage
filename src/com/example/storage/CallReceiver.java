package com.example.storage;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;




public class CallReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.w("state", "before");
//		TelephonyManager mgr = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
//		Log.w("state", Integer.toString(mgr.getCallState()));
//		
//		
//		
////		http://stackoverflow.com/questions/4422410/how-to-implement-a-contentobserver-for-call-logs
//		
//		Handler dmhandler = new Handler();
//		context.getApplicationContext().getContentResolver().registerContentObserver(android.provider.CallLog.Calls.CONTENT_URI,
//				true, new CallContentObserver(dmhandler));
		
		
		Log.w("finish", "efgh");
		 final String oldNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);          // 3
	        this.setResultData("0123456789");                                                   // 4
	        final String newNumber = this.getResultData();
	        String msg = "Intercepted outgoing call. Old number " + oldNumber + ", new number " + newNumber;
	        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
		
	}
    
}
