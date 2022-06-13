package com.jonatas.estudo12trocardados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class principal extends AppCompatActivity {

    private Button btnEnviar;
    private EditText editTextNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);

        btnEnviar = findViewById(R.id.btnEnviar);
        editTextNome = findViewById(R.id.editTextNome);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent screen = new Intent(principal.this, segunda.class);
//                startActivity(screen);

                if (!editTextNome.getText().toString().isEmpty()) {
                    Intent screen = new Intent(principal.this, segunda.class);
                    screen.putExtra("usuario",editTextNome.getText().toString());
                    startActivity(screen);
                } // end if

            }
        });


    } // end OnCreate

    public void SegundaTela(){

    }


}