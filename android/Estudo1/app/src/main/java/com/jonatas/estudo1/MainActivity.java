package com.jonatas.estudo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // o nome do elemento no design de tela é a classe do objeto
    // que será declarado como variável no código java, nesta etapa o objeto
    // ainda não está ligado ao objeto da tela
    private TextView texto;
    private Button btnVisivel, btnInvisivel, btnGone, btnMudaTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // aqui o código associa o objeto no código ao objeto no display
        // o objeto R faz o link entre o display e o código
        // o display é descrito por um arquivo xml parecido com html/css
        // importante: se o tag DisplayTexto for de um botão teremos um
        // erro em execução, por isso é importante criar o id no display
        // fazendo referência ao tipo do objeto
        texto = (TextView) findViewById(R.id.tvDisplayTexto);
        btnVisivel = (Button) findViewById(R.id.btnVisivel);
        btnInvisivel = (Button) findViewById(R.id.btnInvisivel);
        btnGone = (Button) findViewById(R.id.btnGone);
        btnMudaTexto = (Button) findViewById(R.id.btnMudaTexto);

        // define a visibilidade do texto com visível
        texto.setVisibility(View.VISIBLE);

        // cria um listener para monitorar o click no botão
        btnInvisivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // executa a ação ao clicar no botão
                texto.setVisibility(View.INVISIBLE);
            }
        });

        btnVisivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setVisibility(View.VISIBLE);
            }
        });

        btnGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setVisibility(View.GONE);
            }
        });

        btnMudaTexto.setOnClickListener(new View.OnClickListener() {
            private boolean muda =true;
            @Override
            public void onClick(View v) {
                if (muda==true) {
                    texto.setText("Novo texto");
                    muda = false;
                }
                else {
                    texto.setText("Hello World");
                    muda=true;
                }
            }
        });


    }

}