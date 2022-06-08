package com.jonatas.estudo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jonatas.estudo2.R;

public class MainActivity extends AppCompatActivity {

    private TextView tvDisplayText;
    private Button btnInvisible, btnVisible, btnGone, btnChangeText;
    private boolean change=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplayText = findViewById(R.id.tvDisplayText);
        btnInvisible = findViewById(R.id.btnInvisible);
        btnVisible = findViewById(R.id.btnVisible);
        btnGone = findViewById(R.id.btnGone);
        btnChangeText = findViewById(R.id.btnChangeText);

        tvDisplayText.setVisibility(View.VISIBLE);

        btnInvisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplayText.setVisibility(View.INVISIBLE);
            }
        });

        btnVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplayText.setVisibility(View.VISIBLE);
            }
        });

        btnGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplayText.setVisibility(View.GONE);
            }
        });


        btnChangeText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (change==true) {
                    tvDisplayText.setText("Texto 1");
                    change = false;
                } else {
                    tvDisplayText.setText("Texto 2");
                    change = true;
                }
            }
        });



    }
}