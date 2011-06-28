package com.ejemplo.servicios;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
//http://mindtherobot.com/blog/37/android-architecture-tutorial-developing-an-app-with-a-background-service-using-ipc/
public class MiServicio extends Service {
	public static final String Service_Name = "com.ejemplo.servicios.SERVICIO";
	private int segundos = 5;
	private int contador = 1;
	private Timer timer;
	private TimerTask timerWork = new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Log.v("Droidnova","El timerWork trabajando");
			for(int i =1;i<11;i++)
			Log.v("Doidnova","--------------"+i*contador);
			contador++;
		}
	};
	
	public void onCreate() {
		super.onCreate();	
		Log.v("Droidnova", "Comenzando el servicio");
		timer = new Timer();
		timer.schedule(timerWork, segundos*1000);
			
	};
	
//	@Override
//	public int onStartCommand(Intent intent, int flags, int startId) {
//		// TODO Auto-generated method stub
//		Log.v("Droidnova","Estoy en onStartCommand");
//			timer = new Timer();
//			timer.schedule(timerWork, segundos*1000);
//		return START_STICKY;
//	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		timer.cancel();
		timer = null;
		Log.v("Droidnova", "Termino el servicio");
	}
	
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		super.onLowMemory();
	}

}
