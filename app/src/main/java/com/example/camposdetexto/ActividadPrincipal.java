package com.example.camposdetexto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

//Tutorial from: https://www.develou.com/edittext-android/

public class ActividadPrincipal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);
    }

    public void verValor(View view) {
        EditText campoTexto = (EditText) findViewById(R.id.campo_texto);
        Log.d("Valor ET", campoTexto.getText().toString());
    }
}
