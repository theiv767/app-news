package com.example.appnews;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuintaTela extends AppCompatActivity {
    Button btnProximo;
    Button btnAnterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta_tela);

        btnProximo = findViewById(R.id.btnProximo5);
        btnAnterior = findViewById(R.id.btnAnterior5);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent primeiraTela = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(primeiraTela);
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quartaTela = new Intent(getApplicationContext(),QuartaTela.class);
                startActivity(quartaTela);
            }
        });


    }

}