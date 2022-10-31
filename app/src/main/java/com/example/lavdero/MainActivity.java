package com.example.lavdero;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText jettaxis,jetbuses,jetmotos,jetparticulares;
    TextView jtvtaxis,jtvbuses,jtvmotos,jtvparticulares,jtvtotaldia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ocultar la barra de titulo por defecto
        getSupportActionBar().hide();
        //Asociar los objetos Java con los objetos Xml
        jettaxis=findViewById(R.id.ettaxis);
        jetbuses=findViewById(R.id.etbuses);
        jetmotos=findViewById(R.id.etmotos);
        jetparticulares=findViewById(R.id.etparticulares);
        jtvtaxis=findViewById(R.id.tvtaxis);
        jtvbuses=findViewById(R.id.tvbuses);
        jtvmotos=findViewById(R.id.tvmotos);
        jtvparticulares=findViewById(R.id.tvparticulares);
        jtvtotaldia=findViewById(R.id.tvtotaldia);
    }

    public void Calcular_dinero(View view){
        String taxis,buses,motos,particulares;
        taxis=jettaxis.getText().toString();
        buses=jetbuses.getText().toString();
        motos=jetmotos.getText().toString();
        particulares=jetparticulares.getText().toString();
        if (taxis.isEmpty() || buses.isEmpty() || motos.isEmpty() || particulares.isEmpty()){
            Toast.makeText(this, "Todos los datos son requeridos", Toast.LENGTH_SHORT).show();
            jettaxis.requestFocus();
        }
        else{
            //Definicion de variables y conversion de tipos de datos
            int cant_taxis,cant_buses,cant_motos,cant_particulares,total_taxis,total_buses,total_motos,total_particualares,totaldia;
            cant_taxis=Integer.parseInt(taxis);
            cant_buses=Integer.parseInt(buses);
            cant_motos=Integer.parseInt(motos);
            cant_particulares=Integer.parseInt(particulares);
            total_taxis=cant_taxis * 3000;
            total_buses=cant_buses * 10000;
            total_motos=cant_motos * 2000;
            total_particualares=cant_particulares * 5000;
            totaldia=total_taxis + total_buses + total_motos + total_particualares;

            //Imprimir resultados
            jtvtaxis.setText(String.valueOf(total_taxis));
            jtvbuses.setText(String.valueOf(total_buses));
            jtvmotos.setText(String.valueOf(total_motos));
            jtvparticulares.setText(String.valueOf(total_particualares));
            jtvtotaldia.setText(String.valueOf(totaldia));
        }
    }

    public void Limpiar_campos(View view){
        jettaxis.setText("");
        jetbuses.setText("");
        jetmotos.setText("");
        jetparticulares.setText("");
        jtvtaxis.setText("");
        jtvbuses.setText("");
        jtvmotos.setText("");
        jtvparticulares.setText("");
        jtvtotaldia.setText("");
        jettaxis.requestFocus();
    }


}