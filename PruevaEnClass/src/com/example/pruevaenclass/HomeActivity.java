package com.example.pruevaenclass;



import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle extras= getIntent().getExtras();
		String usuario = extras.getString("nombreUsuario");
		
		TextView textView= new TextView(getApplicationContext());
		textView.setText("Bienvenido : "+ usuario);
		
		setContentView(textView);	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	
}
