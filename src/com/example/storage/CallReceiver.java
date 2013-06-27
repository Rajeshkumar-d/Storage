package com.example.storage;



import java.util.List;

import android.R.string;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;





public class CallReceiver extends BroadcastReceiver {

	private final static String OFFHOOK = "OFFHOOK";
	private final static String IDLE = "IDLE";
	public static String current_state = "";
	private final static String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";
	private final static String ACTION_ANSWER = "android.intent.action.ANSWER";
	@Override
	public void onReceive(Context context, Intent intent) {
	
		String intentAction = intent.getAction();
		
		if (intentAction.equals(ACTION_ANSWER)) {
			
			//introduce tap button here
			Log.w("state", "incoming call attended");
			
		}
		
		
		
		
		
	else if (intentAction.equals(ACTION_PHONE_STATE_CHANGED))
	{
		
		String state = intent.getStringExtra("state");
		
		if(state.equals(OFFHOOK))
		{
			current_state = OFFHOOK;
		ActivityManager am = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);



	     // get the info from the currently running task
	     List< ActivityManager.RunningTaskInfo > taskInfo = am.getRunningTasks(1); 

	     Log.w("topActivity", "CURRENT Activity ::"
	             + taskInfo.get(0).topActivity.getClassName());
	     ComponentName componentInfo = taskInfo.get(0).topActivity;
	     
	     String activityNameWhenDialInitiated = taskInfo.get(0).topActivity.getClassName();
         String phoneDialAppPackageName = componentInfo.getPackageName();
	  
	     while((taskInfo.get(0).topActivity.getClassName().equals(activityNameWhenDialInitiated)) ||(!phoneDialAppPackageName.equals(componentInfo.getPackageName()))&&(!current_state.equals(IDLE)))
	     {
	    	  taskInfo = am.getRunningTasks(1); 

		     Log.w("topActivity before", "CURRENT Activity ::"
		             + taskInfo.get(0).topActivity.getClassName());
		      componentInfo = taskInfo.get(0).topActivity;
	     }
	     
	     taskInfo = am.getRunningTasks(1); 

	     Log.e("topActivity came here", "CURRENT Activity ::"
	             + taskInfo.get(0).topActivity.getClassName());
	      componentInfo = taskInfo.get(0).topActivity;
	      
	      Log.e("curre", current_state);
	      Log.e("curre 1", componentInfo.getPackageName());
	      Log.e("curre 2", phoneDialAppPackageName);
	     if((!current_state.equals(IDLE)) &&componentInfo.getPackageName().equals(phoneDialAppPackageName))
	     {
	    	 //Tap here
	    	 Log.e("curre 3", "Call connected");
	    	 Toast.makeText(context, "call connected", Toast.LENGTH_LONG).show();
	     }
	     
	   Log.e("topActivity went out", "CURRENT ac2 ::"
	             + componentInfo.getPackageName());
		}
		
		else if(state.equals(IDLE))
		{
		//do nothing
		}
	   
//	   try {
//		Thread.sleep(10000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	    am = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
//
//
//
//	     // get the info from the currently running task
//	  taskInfo = am.getRunningTasks(1); 
//
//	     Log.w("topActivity 2 2", "CURRENT Activity 2::"
//	             + taskInfo.get(0).topActivity.getClassName());
//
//	      componentInfo = taskInfo.get(0).topActivity;
//	Log.w("topActivity 2 2", "CURRENT ac2 2::"
//	             + componentInfo.getPackageName());
//	   
//	   
//		String state = intent.getStringExtra("state");
//		Log.w("state", state);
//		if(previous_state.equals(OFFHOOK) && state.equals(IDLE)){
//				//introduce tap button here
//			Log.w("state", "Outgoing call attended");
//			
//			}
//		previous_state = state;
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
