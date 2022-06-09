package com.jonatas.estudo6megasena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnGerarJogo;
    private TextView tvDezena1, tvDezena2, tvDezena3,tvDezena4, tvDezena5,tvDezena6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGerarJogo = findViewById(R.id.btnGerarJogo);
        tvDezena1 = findViewById(R.id.tvDezena1);
        tvDezena2 = findViewById(R.id.tvDezena2);
        tvDezena3 = findViewById(R.id.tvDezena3);
        tvDezena4 = findViewById(R.id.tvDezena4);
        tvDezena5 = findViewById(R.id.tvDezena5);
        tvDezena6 = findViewById(R.id.tvDezena6);

        btnGerarJogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean jogoOk = false;
                int indice = 0;
                int[] jogo = new int[6];


                while (jogoOk!=true){

                    // gera um número aleatório
                    int numero = (int)Math.round(60*Math.random()+1);

                    //verifica se o número gerado existe no jogo
                    boolean test = false;
                    // faz um laço interável nos elementos da matriz jogo
                    for (int element : jogo) {
                        if (element == numero) {
                            test = true;
                            break;
                        }// end if
                    } // end for

                    // atualiza o jogo com um número não repetido
                    if (test==false) {
                        jogo[indice]=numero;
                        indice=indice+1;
                    } // end if

                    // Apresenta os resultados e verifica se foram gerados as dezenas
                    if (indice==6) {
                        Arrays.sort(jogo); // classifica as dezenas para exibição
                        jogoOk=true;
                        tvDezena1.setText(Integer.toString(jogo[0]));
                        tvDezena2.setText(Integer.toString(jogo[1]));
                        tvDezena3.setText(Integer.toString(jogo[2]));
                        tvDezena4.setText(Integer.toString(jogo[3]));
                        tvDezena5.setText(Integer.toString(jogo[4]));
                        tvDezena6.setText(Integer.toString(jogo[5]));
                    } // end if
                }// end while
            } // end onclick
        }); // end set on click;


//        while (jogoOk!=true){
//            int numero = (int)Math.round(60*Math.random()+1);
//            tvDezena1.setText(Integer.toString(numero));
//            jogoOk=true;
//        }

    } // end oncreate
} //end class