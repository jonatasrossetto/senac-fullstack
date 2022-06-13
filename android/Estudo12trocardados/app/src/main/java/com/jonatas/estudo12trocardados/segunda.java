package com.jonatas.estudo12trocardados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class segunda extends AppCompatActivity {

    private TextView tvResposta;
    private String texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_segunda);

        tvResposta = findViewById(R.id.tvResposta);
        Bundle info  = getIntent().getExtras();
        tvResposta.setText("usuario: "+info.getString("usuario"));


    }
}