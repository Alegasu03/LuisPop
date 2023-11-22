package com.example.luispop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnojo= findViewById(R.id.botonojo);
    boolean ojoAbierto=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnojo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (ojoAbierto) {
                    btnojo.setImageResource(R.drawable.ojocerrado);
                } else {
                    btnojo.setImageResource(R.drawable.ojoabierto);
                }
                ojoAbierto = !ojoAbierto; // Cambia el estado del ojo
            }
        });

    }
}