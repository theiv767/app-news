package com.example.appnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TerceiraTela extends AppCompatActivity {
    Button btnAnterior2, btnProximo3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);

        btnAnterior2 = findViewById(R.id.btnAnterior2);

        btnAnterior2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent segundaTela = new Intent(getApplicationContext(),SegundaTela.class);
                startActivity(segundaTela);
            }
        });

        btnProximo3 = findViewById(R.id.btnProximo3);

        btnProximo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quartaTela = new Intent(getApplicationContext(),QuartaTela.class);
                startActivity(quartaTela);
            }
        });

    }
}