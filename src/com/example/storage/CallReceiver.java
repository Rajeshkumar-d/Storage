package com.example.storage;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;





public class CallReceiver extends BroadcastReceiver {

	private final static String OFFHOOK = "OFFHOOK";
	private final static String IDLE = "IDLE";
	private static String previous_state = "";
	private final static String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";
	private final static String ACTION_ANSWER = "android.intent.action.ANSWER";
	@Override
	public void onReceive(Context context, Intent intent) {
		
		
		//During an outgoing call the initial state is OFFHOOK followed by IDLE after call attended
		
		String intentAction = intent.getAction();
		
		if (intentAction.equals(ACTION_ANSWER)) {
			//introduce tap button here
			Log.w("state", "incoming call attended");
			
		}
		
		
		
		
		
	else if (intentAction.equals(ACTION_PHONE_STATE_CHANGED))
	{

		String state = intent.getStringExtra("state");
		Log.w("state", state);
		if(previous_state.equals(OFFHOOK) && state.equals(IDLE)){
				//introduce tap button here
			Log.w("state", "Outgoing call attended");
			
			}
		previous_state = state;
	}
		
	
		
		
		
		
		
//		http://stackoverflow.com/questions/4422410/how-to-implement-a-contentobserver-for-call-logs
		
//		Handler dmhandler = new Handler();
//		context.getApplicationContext().getContentResolver().registerContentObserver(android.provider.CallLog.Calls.CONTENT_URI,
//				true, new CallContentObserver(dmhandler));
		
		
//		Log.w("finish", "efgh");
//		 final String oldNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);          // 3
//	        this.setResultData("0123456789");                                                   // 4
//	        final String newNumber = this.getResultData();
//	        String msg = "Intercepted outgoing call. Old number " + oldNumber + ", new number " + newNumber;
//	        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
		
	}
    
}
