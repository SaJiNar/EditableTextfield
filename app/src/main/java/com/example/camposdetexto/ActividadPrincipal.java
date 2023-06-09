package com.example.camposdetexto;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//Tutorial from: https://www.develou.com/edittext-android/

public class ActividadPrincipal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);

        if (findViewById(R.id.campo_1).isFocusable()) {
            findViewById(R.id.campo_2).requestFocus();
        }

        EditText campo1 = (EditText) findViewById(R.id.campo_dos_palabras);
        Editable texto = campo1.getText();
        campo1.selectAll();
        Log.d("Posicion cursor:", String.valueOf(campo1.getSelectionEnd()));

        int start = 0;
        int end = 0;

        for (int i = start; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                end = i;
            }
        }

        campo1.setSelection(start, end);
    }

    public void verValor(View view) {
        EditText campoTexto = (EditText) findViewById(R.id.campo_texto);
        Log.d("Valor ET", campoTexto.getText().toString());
    }

    //Ocultar teclado virtual
    private void ocultarTeclado(TextView v) {
        InputMethodManager imm =
                (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
