package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Operacion o;
    int puntuacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         o=new Operacion(1);
        Log.d("mietiqueta", o.getOperando1()+" "+o.getSimbolo()+" "+o.getOperando2()+"="+o.getResultado());

    }
    private void mostrarOperacion()
    {

    }
    private void comprobar()
    {

    }
}
