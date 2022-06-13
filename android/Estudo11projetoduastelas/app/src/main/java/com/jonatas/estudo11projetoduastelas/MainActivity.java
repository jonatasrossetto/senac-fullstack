package com.jonatas.estudo11projetoduastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnToSecondScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ToSecondScreen();

    } // end onCreate

    public void ToSecondScreen() {
        setContentView(R.layout.activity_main);
        btnToSecondScreen = findViewById(R.id.btnToSecondScreen);
        btnToSecondScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://developer.android.com/guide/components/intents-filters?hl=pt-br
                // O Intent cria um objeto que faz a transição de uma tela para outra
                Intent secondScreen = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(secondScreen);
            }
        });


    }



}