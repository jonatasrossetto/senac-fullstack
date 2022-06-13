package com.jonatas.estudo10calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnN1,btnN2,btnN3;
    private Button btnN4,btnN5,btnN6;
    private Button btnN7,btnN8,btnN9;
    private Button btnN0;
    private TextView tvDisplay;
    private String display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = "";

        btnN1 = findViewById(R.id.btnN1);
        btnN2 = findViewById(R.id.btnN2);
        btnN3 = findViewById(R.id.btnN3);
        btnN4 = findViewById(R.id.btnN4);
        btnN5 = findViewById(R.id.btnN5);
        btnN6 = findViewById(R.id.btnN6);
        btnN7 = findViewById(R.id.btnN7);
        btnN8 = findViewById(R.id.btnN8);
        btnN9 = findViewById(R.id.btnN9);
        btnN0 = findViewById(R.id.btnN0);
        tvDisplay=findViewById(R.id.tvDisplay);

        btnN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = display+"1";
                tvDisplay.setText(display);
            }
        }); // end btnN1

        btnN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = display+"2";
                tvDisplay.setText(display);
            }
        }); // end btnN2

        btnN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = display+"3";
                tvDisplay.setText(display);
            }
        }); // end btnN3

        btnN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = display+"4";
                tvDisplay.setText(display);
            }
        }); // end btnN4

        btnN5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = display+"5";
                tvDisplay.setText(display);
            }
        }); // end btnN5

        btnN6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = display+"6";
                tvDisplay.setText(display);
            }
        }); // end btnN6

        btnN7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = display+"7";
                tvDisplay.setText(display);
            }
        }); // end btnN7

        btnN8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = display+"8";
                tvDisplay.setText(display);
            }
        }); // end btnN8

        btnN9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = display+"9";
                tvDisplay.setText(display);
            }
        }); // end btnN9

        btnN0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display = display+"0";
                tvDisplay.setText(display);
            }
        }); // end btnN0


    }
}