package com.example.semana4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad3 extends AppCompatActivity {
TextView r1,r2,r3;
Bundle cb1,cb2,cb3,ed3,rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
        r1=findViewById(R.id.txtrespuesta1);
        r2=findViewById(R.id.txtrespuesta2);
        r3=findViewById(R.id.txtrespuesta3);
        ed3=getIntent().getExtras();
        String rec4=ed3.getString("datos enviados1");
        r1.setText(rec4);
        rb1=getIntent().getExtras();
        String radio1=rb1.getString("datos enviados2");
        r2.setText(radio1);
        rb2=getIntent().getExtras();
        String radio2=rb2.getString("datos enviados2");
        r2.setText(radio2);
        cb1=getIntent().getExtras();
        String recc2=cb1.getString("datos enviados");
        r3.setText(recc2);
        cb2=getIntent().getExtras();
        String recc3=cb2.getString("datos enviados");
        r3.setText(recc3);
        cb3=getIntent().getExtras();
        String recc4=cb3.getString("datos enviados");
        r3.setText(recc4);

    }
    public void Regresar(View v){
        Intent intent= new Intent(Actividad3.this, MainActivity.class);
        startActivity(intent);
    }
}
