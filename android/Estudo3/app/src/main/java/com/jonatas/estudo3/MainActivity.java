package com.jonatas.estudo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvWisdom;
    private Button btnWisdom;

//    private String[] frases = {"As pessoas ficam perturbadas, não pelas coisas, mas pela imagem que formam delas. Epitecto",
//            "É impossível para um homem aprender aquilo que ele acha que já sabe.Epitecto",
//            "Nada de grande se cria de repente.Epitecto",
//            "Não te alongues a contar as tuas façanhas, nem os perigos que terás passado; não podes querer que os outros tenham tanto prazer em escutar-te como tu em contá-los.Epitecto"};

    private String[] frases = {"frase 1", "frase 2", "frase 3", "frase 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWisdom = (TextView) findViewById(R.id.tvWisdom);
        btnWisdom = (Button) findViewById(R.id.btnWisdom);

        btnWisdom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int indice;
//                indice = (int) Math.round(3*Math.random());
//                tvWisdom.setText(frases[indice]);

                // utilizando a classe Random do java.util.random
                // ver https://dicasdejava.com.br/como-gerar-um-numero-aleatorio-em-java/
                // ver https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
                Random indice = new Random();
                tvWisdom.setText(frases[indice.nextInt(frases.length)]);
            }
        });

    }
}