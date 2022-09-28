package com.example.proyec1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    EditText et1;
    Button button,button3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        button = findViewById(R.id.button);

        Intent atras = getIntent();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String cedula[] =  {"3-740-1394", "8-925-1168", "8-944-327", "20-53-4282", "8-943-1867", "8-937-503", "8-952-2444", "8-943-12", "8-986-549", "8-957-1827", "8-940-1311", "8-863-1620", "8-964-691", "8-954-1126", "8-1039-1537", "8-940-1505", "8-938-925", "3-743-2493", "E-8-169755", "8-971-1811", "8-940-408", "8-937-1640", "8-939-1578", "8-942-1406", "6-722-724", "8-941-1215", "8-962-1218", "8-941-924", "8-980-2414", "3-742-2055", "8-942-1192", "8-904-1189", "8-959-857", "8-964-1554", "8-1066-1018", "8-1055-701", "8-970-242", "3-752-1461", "3-745-950"};
                String nombres[] = {"Michelle", "Tommy", "Edwin", "Eddy","Alejandra", "Gabriel", "Kevin", "Luis", "Marc", "Diego", "María", "Donaldo", "Miguel", "Andrew", "Valerie", "Jean", "Felipe", "Lisseth","Jesus", "Diana", "Gerardo", "Juan", "Julio", "Anel", "Janiel", "Antonio", "Carlos","David", "Sergio", "Zulixa", "Luis", "Ary", "Dionisio","Brayan", "Carlos", "Genesis", "Fernando", "Carlos", "Eimy"};
                String cedulav= et1.getText().toString();

                boolean valido = true;

                for (int i=0; i< cedula.length; i++)
                {
                    if(cedulav.equals(cedula[i]))
                    {
                        valido = false;
                        Intent intent = new Intent(getApplicationContext(), pagina1.class);
                        startActivity(intent);
                        break;

                    }
                    else
                    {

                        if(i == cedula.length-1){
                            String mensaje = "Cédula inexistente";
                            Toast.makeText(button.getContext(), mensaje, Toast.LENGTH_LONG).show();
                            break;
                    }
                    }

                }


                }});

    }}

