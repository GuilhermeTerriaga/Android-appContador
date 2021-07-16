package com.example.contador.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.contador.R;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;
    static final String CONTAGEM = "contagem";


    public void atualizarTextoBotao() {
        Button meuBotao = findViewById(R.id.botaoContador);
        String textoBotao = getResources().getString(R.string.status_contador);
        meuBotao.setText(textoBotao + " " + contador);
    }


    public void botaoContadorClick(View botao) {
        contador++;
        Log.i(this.getClass().getName(), "Dentro do botaoContadorClick " + contador);
        atualizarTextoBotao();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            contador = savedInstanceState.getInt(CONTAGEM);
            Log.i(this.getClass().getName(), "Dentro do onCreate com savedInstanceState =! null");
        } else {
            contador = 0;
            Log.i(this.getClass().getName(), "Dentro do onCreate com savedInstanceState = null");
        }
        setContentView(R.layout.activity_main);
        atualizarTextoBotao();


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        contador = savedInstanceState.getInt(CONTAGEM);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(this.getClass().getName(), "Dentro do onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(this.getClass().getName(), "Dentro do onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(this.getClass().getName(), "Dentro do onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(this.getClass().getName(), "Dentro do onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(this.getClass().getName(), "Dentro do onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(this.getClass().getName(), "Dentro do onRestart");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        Log.i(this.getClass().getName(), "Dentro do salvamento da instancia");
        savedInstanceState.putInt(CONTAGEM, contador);
        super.onSaveInstanceState(savedInstanceState);
    }
}