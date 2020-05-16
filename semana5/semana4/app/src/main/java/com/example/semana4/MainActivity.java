package com.example.semana4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= (EditText)  findViewById(R.id.txtUsuario);
        ed2= (EditText)  findViewById(R.id.txtContraseña);


    }
    public void Ingresar(View v){
        String V_Usuario= ed1.getText().toString();
        String V_Contraseña= ed2.getText().toString();
        if(V_Usuario.equals("VictorCaceres")&& V_Contraseña.equals("est.uisrael.2019")){
            Intent intent= new Intent(MainActivity.this, Formulario.class);
            Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_LONG).show();
            intent.putExtra("datos enviados",ed1.getText().toString());
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Usuario o Contraseña Incorrectas",Toast.LENGTH_LONG).show();
        }

    }
}
