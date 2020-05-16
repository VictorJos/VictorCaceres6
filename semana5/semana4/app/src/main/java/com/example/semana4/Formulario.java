package com.example.semana4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {
TextView recibido;
CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
EditText ed3;
RadioButton rb1,rb2;
Bundle ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        recibido=findViewById(R.id.txtrecibido);
        ed3=findViewById(R.id.txtsangre);
        cb1=findViewById(R.id.cd1);
        cb2=findViewById(R.id.cd2);
        cb3=findViewById(R.id.cd3);
        rb1=findViewById(R.id.rd1);
        rb2=findViewById(R.id.rd2);
        ed1= getIntent().getExtras();
        String recc=  ed1.getString("datos enviados");
        recibido.setText(recc);

    }
    public void Verificar(View v){
        Intent intent= new Intent(Formulario.this, Actividad3.class);
        intent.putExtra("datos enviados1",ed3.getText().toString());
        startActivity(intent);
        if(cb1.isChecked()==true){

            intent.putExtra("datos enviados",cb1.getText().toString());
            startActivity(intent);

        }
        else if(cb2.isChecked()==true){
            intent.putExtra("datos enviados",cb2.getText().toString());
            startActivity(intent);
        }
        else if(cb3.isChecked()==true){
            intent.putExtra("datos enviados",cb3.getText().toString());
            startActivity(intent);
        }

        if(rb1.isChecked()==true){
            intent.putExtra("datos enviados2",rb1.getText().toString());
            startActivity(intent);
        }
        if(rb2.isChecked()==true){
            intent.putExtra("datos enviados2",rb2.getText().toString());
            startActivity(intent);
        }

    }
}
