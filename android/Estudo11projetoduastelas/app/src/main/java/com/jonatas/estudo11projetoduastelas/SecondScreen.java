package com.jonatas.estudo11projetoduastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondScreen extends AppCompatActivity {

    private Button btnToFirstScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToFirstScreen();
    }

    public void ToFirstScreen(){
        setContentView(R.layout.activity_second_screen);
        btnToFirstScreen = findViewById(R.id.btnToFirstScreen);
        btnToFirstScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://developer.android.com/guide/components/intents-filters?hl=pt-br
                // O Intent cria um objeto que faz a transição de uma tela para outra
                Intent firstScreen = new Intent(SecondScreen.this, MainActivity.class);
                startActivity(firstScreen);
            }
        });
    }


}