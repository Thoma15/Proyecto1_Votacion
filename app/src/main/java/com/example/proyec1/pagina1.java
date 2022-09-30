package com.example.proyec1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.String;

import java.util.ArrayList;


public class pagina1 extends AppCompatActivity {
    TextView tvres,tvg, tvnombre;
    RadioButton rb1, rb2,rb3;
    Button button2, button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina1);

        tvres = findViewById(R.id.tvres);
        tvg = findViewById(R.id.tvg);
        tvnombre = findViewById(R.id.tvnombre);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Votaciones");

        //Conseguir valores de cedula y nombres del MainActivity.java
        Intent intent = getIntent();
        String getced[] = intent.getStringArrayExtra("cedula");
        String getnom[] = intent.getStringArrayExtra("nombres");
        String cedula = String.valueOf(getced);
        String nombres = String.valueOf(getnom);
        String cedulv = getIntent().getDataString("cedulav");

        tvres.setText("Bienvenido!"+getced);


        ArrayList<Integer> list = new ArrayList();
        list.add(0);
        list.add(0);
        list.add(0);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (rb1.isChecked() == false && rb2.isChecked() == false && rb3.isChecked() == false) {
                    Toast toast2 = Toast.makeText(getApplicationContext(), "Seleccione un candidato", Toast.LENGTH_SHORT);
                    toast2.show();

                } else {
                    if (rb1.isChecked()) {
                        list.add(0, list.get(0) + 1);
                        tvnombre.setText("Gracias por su participación " + nombres);
                    } else if (rb2.isChecked()) {
                        list.add(1, list.get(1) + 1);
                        tvnombre.setText("Gracias por su participación " +nombres);

                    } else if (rb3.isChecked()) {
                        list.add(2, list.get(2) + 1);
                        tvnombre.setText("Gracias por su participación " +nombres);
                    }
                    //else if(rb1.isChecked() == true && rb2.isChecked() == true && rb3.isChecked() == true){
                    //tvnombre.setText("Gracias por su participación"+r);
                }}}

        );



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1, v2, v3;
                int cien;


                cien = list.get(0) + list.get(1) + list.get(2);

                v1 = Double.valueOf(list.get(0)) / Double.valueOf(cien) * 100;
                v2 = Double.valueOf(list.get(1)) / Double.valueOf(cien) * 100;
                v3 = Double.valueOf(list.get(2)) / Double.valueOf(cien) * 100;



                Intent intent = new Intent(pagina1.this, pagina2.class);
               intent.putExtra("v1", v1);
               intent.putExtra("v2", v2);
               intent.putExtra("v3", v3);
               startActivity(intent);



            }
        });

         button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent atras = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(atras);
                }
        });
    }}