package com.jonatas.estudo8jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn11, btn12, btn13;
    private Button btn21, btn22, btn23;
    private Button btn31, btn32, btn33;
    //private int[][] tabuleiro = new int[3][3];
    private int[][] tabuleiro = {{0,0,0},{0,0,0},{0,0,0}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);

        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);

        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tabuleiro[0][0]==0) {
                    btn11.setText("X");
                    tabuleiro[0][0] = 1;
                } else {
                    btn11.setText("");
                    tabuleiro[0][0] = 0;
                }
            }
        });


    }
}