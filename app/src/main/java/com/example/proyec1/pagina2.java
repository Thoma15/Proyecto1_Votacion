package com.example.proyec1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class pagina2 extends AppCompatActivity {
    TextView tv7, tv8,tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);

        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Resultados");
        Intent intent = getIntent();

        double gv1 = intent.getDoubleExtra("v1",0);
        double gv2 = intent.getDoubleExtra("v2",0);
        double gv3 = intent.getDoubleExtra("v3", 0);

        tv7.setText("Porcentaje de votos: "+gv1+"%");
        tv8.setText("Porcentaje de votos: "+gv2+"%");
        tv9.setText("Porcentaje de votos: "+gv3+"%");




    }
}