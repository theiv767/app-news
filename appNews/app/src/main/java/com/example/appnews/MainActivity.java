package com.example.appnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnProximo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProximo1 = findViewById(R.id.btnProximo1);

        btnProximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent segundaTela = new Intent(getApplicationContext(),SegundaTela.class);
            startActivity(segundaTela);
            }
        });
    }
}