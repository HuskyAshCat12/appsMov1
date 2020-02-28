package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnXML, btnListener, btnAnon, btnClase;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnXML = findViewById(R.id.btnXML);
        btnListener = findViewById(R.id.btnListener);
        btnAnon = findViewById(R.id.btnAnon);
        btnClase = findViewById(R.id.btnClase);

        btnListener.setOnClickListener(this);

        btnClase.setOnClickListener(new miClicListener(getApplicationContext()));

        btnAnon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "EVENTO CLASE ANÓNIMA", Toast.LENGTH_SHORT).show();


            }
        });

    }
    //Toast
    public void miClick(View v) {
        Toast.makeText(this, "EVENTO XML", Toast.LENGTH_SHORT).show();
    }
    //Listener
    @Override
    public void onClick(View v) {
        Toast.makeText(this, "EVENTO LISTENER", Toast.LENGTH_SHORT).show();
    }
}
