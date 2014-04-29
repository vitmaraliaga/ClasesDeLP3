package com.example.pruevaenclass;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void ingresar(View view){
		EditText usuario= (EditText) findViewById(R.id.editText1);
	Intent intent= new Intent(getApplicationContext(), HomeActivity.class);
	intent.putExtra("nombreUsuario",usuario.getText().toString());
	startActivity(intent);
	
	}
	public void mostrarMensaje(View view ) {
		
		
		Intent i=new Intent(getApplicationContext(), HomeActivity.class); 
		//inten para que exista comunicasion entre las actividades
		
		i.putExtra("nombre", "lucass");
		startActivity(i);
		

}}
