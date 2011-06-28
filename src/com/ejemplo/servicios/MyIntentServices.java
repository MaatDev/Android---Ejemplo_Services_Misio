package com.ejemplo.servicios;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentServices extends IntentService{

	public MyIntentServices(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub
		Log.v("Droidnova","Estoy en l handler del IntentService");
	}

}
