package com.jonatas.estudo13ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // cada tela tem seu próprio escopo de variáveis
    // toast funciona como uma pilha de mensagens
    private Button btnExecutar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExecutar = findViewById(R.id.btnExecutar);

        Toast.makeText(getApplicationContext(),"Executou o OnCreate Tela1", Toast.LENGTH_SHORT).show();

        btnExecutar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen = new Intent(MainActivity.this, segundaTela.class);
                startActivity(screen);
            }
        }); // end listenner btnExecutar


    } // end onCreate

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Executou o OnStart Tela1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Executou o OnResume Tela1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Executou o OnPause Tela1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Executou o OnStop Tela1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"Executou o OnReStart Tela1", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Executou o OnDestroy Tela1", Toast.LENGTH_SHORT).show();
    }




} // end class MainActivity

