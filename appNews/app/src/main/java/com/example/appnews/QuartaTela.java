package com.example.appnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuartaTela extends AppCompatActivity {
    Button btnAnterior3, btnProximo4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta_tela);

        btnAnterior3 = findViewById(R.id.btnAnterior3);

        btnAnterior3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent terceiraTela = new Intent(getApplicationContext(),TerceiraTela.class);
                startActivity(terceiraTela);
            }
        });

        btnProximo4 = findViewById(R.id.btnProximo4);

        btnProximo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quintaTela = new Intent(getApplicationContext(),QuintaTela.class);
                startActivity(quintaTela);
            }
        });


    }
}