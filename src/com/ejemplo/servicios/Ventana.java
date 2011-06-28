package com.ejemplo.servicios;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Ventana extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	Button btn_Activar;
	Button btn_Desactivar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn_Activar = (Button) findViewById(R.id.btn_activiar);
        btn_Desactivar = (Button) findViewById(R.id.btn_desactivar);
        
        btn_Activar.setOnClickListener(this);
        btn_Desactivar.setOnClickListener(this);
        
        
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.btn_activiar:
				startService(new Intent(MiServicio.Service_Name));
				
				break;
			case R.id.btn_desactivar:
				stopService(new Intent(MiServicio.Service_Name));
				break;
		
		}
		
	}
}