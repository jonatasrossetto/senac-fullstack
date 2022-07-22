package com.jonatas.estudo16jogodecartas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private TextView tvResultado;
    private TextView tvPontos, tvCartaEscondida, tvCartaEscolhida;
    private TextView tvJogadas;
    private TextView tvRecorde;
    private RadioGroup radioGroup;
    private RadioButton rdBtnAsCopas, rdBtnAsPaus;
    private RadioButton rdBtnAsOuros, rdBtnAsEspadas;
    private Button btnJogar;
    private FloatingActionButton fltActBtnNovoJogo, fltActBtnRecorde;
    private int jogadas=5;
    private int pontos=0;
    private int maxPontuacao=0;
    private boolean displayRecord=false;

    // criar uma função para salvar a maior pontuação utilizando a classe shared preferences
    //https://www.alura.com.br/artigos/salvando-informacoes-com-o-shared-preferences?gclid=CjwKCAjwtcCVBhA0EiwAT1fY74PgtLla3azO_uBjleePSnehPu25z7sCC_zwcQM74VHeRrjLYDudHBoC7bUQAvD_BwE
    private void salvarRecorde(SharedPreferences preferences, int pontuacao) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("recorde", pontuacao);
        editor.commit();
    }



    // cirar uma função para carrega a maior pontuação utilizando a classe shared preferences

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences = getSharedPreferences("user_preferences", MODE_PRIVATE);

        tvJogadas = findViewById(R.id.tvJogadas);
        tvResultado = findViewById(R.id.tvResultado);
        tvPontos = findViewById(R.id.tvPontos);
        tvRecorde = findViewById(R.id.tvRecorde);
        tvCartaEscondida = findViewById(R.id.tvCartaEscondida);
        tvCartaEscolhida = findViewById(R.id.tvCartaEscolhida);
        radioGroup = findViewById(R.id.radioGroup);
        rdBtnAsCopas = findViewById(R.id.rdBtnAsCopas);
        rdBtnAsPaus = findViewById(R.id.rdBtnAsPaus);
        rdBtnAsEspadas = findViewById(R.id.rdBtnAsEspadas);
        rdBtnAsOuros = findViewById(R.id.rdBtnAsOuros);
        btnJogar = findViewById(R.id.btnJogar);
        fltActBtnNovoJogo = findViewById(R.id.fltActBtnNovoJogo);
        fltActBtnRecorde = findViewById(R.id.fltActBtnRecorde);

        btnJogar.setEnabled(false);
        tvJogadas.setText("Jogadas: "+jogadas);

        fltActBtnNovoJogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnJogar.setEnabled(true);
                jogadas=5;
                pontos=0;
                tvResultado.setText("Vamos Jogar!!");
                tvPontos.setText("pontos: " + Integer.toString(pontos));
                tvJogadas.setText("Jogadas: "+jogadas);
                tvCartaEscondida.setText("escondida: ");
                tvCartaEscolhida.setText("**********");
            }
        });

        fltActBtnRecorde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRecord=!displayRecord;
                if (displayRecord==true) {
                    radioGroup.setVisibility(View.INVISIBLE);
                    tvRecorde.setVisibility(View.VISIBLE);
                    tvRecorde.setText("Recorde: "+maxPontuacao);
                }
                if (displayRecord==false) {
                    radioGroup.setVisibility(View.VISIBLE );
                    tvRecorde.setVisibility(View.INVISIBLE);
                }

            }
        });

        btnJogar.setOnClickListener(new View.OnClickListener() {
            private long cartaEscondida;
            private long cartaEscolhida;
            @Override
            public void onClick(View v) {
                cartaEscondida = Math.round(1+Math.random()*3);
                tvCartaEscondida.setText("escondida: "+Long.toString(cartaEscondida));
                tvResultado.setText(Long.toString(cartaEscondida));
                jogadas=jogadas-1;
                if (jogadas>0) {
                    if (rdBtnAsCopas.isChecked()) {
                        cartaEscolhida = 1;
                        tvCartaEscolhida.setText("1 - às de Copas");
                    }
                    ;
                    if (rdBtnAsPaus.isChecked()) {
                        cartaEscolhida = 2;
                        tvCartaEscolhida.setText("2 - às de Paus");
                    }
                    ;
                    if (rdBtnAsEspadas.isChecked()) {
                        cartaEscolhida = 3;
                        tvCartaEscolhida.setText("3 - às de Espadas");
                    }
                    ;
                    if (rdBtnAsOuros.isChecked()) {
                        cartaEscolhida = 4;
                        tvCartaEscolhida.setText("4 - às de Ouros");
                    }
                    ;
                    if (cartaEscolhida == cartaEscondida) {
                        pontos = pontos + 1;
                        tvPontos.setText("pontos: " + Integer.toString(pontos));
                    }
                } else {
                    btnJogar.setEnabled(false);
                    if (pontos>maxPontuacao) {
                        maxPontuacao=pontos;
                    }
                    tvResultado.setText("Fim de Jogo!");
                    salvarRecorde(preferences,maxPontuacao);

                }

                tvJogadas.setText("Jogadas: "+jogadas);
            }
        });

    }
}