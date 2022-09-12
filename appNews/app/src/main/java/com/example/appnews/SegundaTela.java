package com.example.appnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaTela extends AppCompatActivity {
    Button btnAnterior1, btnProximo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        btnAnterior1 = findViewById(R.id.btnAnterior1);

        btnAnterior1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent primeiraTela = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(primeiraTela);
            }
        });

        btnProximo2 = findViewById(R.id.btnProximo2);

        btnProximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent terceiraTela = new Intent(getApplicationContext(),TerceiraTela.class);
                startActivity(terceiraTela);
            }
        });


    }
}