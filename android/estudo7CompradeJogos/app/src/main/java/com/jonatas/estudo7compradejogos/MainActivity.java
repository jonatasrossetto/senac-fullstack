package com.jonatas.estudo7compradejogos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvValortotal;
    private CheckBox checkBoxJogo1,checkBoxJogo2, checkBoxJogo3, checkBoxJogo4;
    private double valorTotal;
    private double precoJogo1,precoJogo2,precoJogo3,precoJogo4;
    private EditText editTextValorTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        valorTotal = 0f;
        precoJogo1 = 265;
        precoJogo2 = 210;
        precoJogo3 = 150;
        precoJogo4 = 205;
        tvValortotal = findViewById(R.id.tvValorTotal);
        checkBoxJogo1=findViewById(R.id.checkBoxJogo1);
        checkBoxJogo2=findViewById(R.id.checkBoxJogo2);
        checkBoxJogo3=findViewById(R.id.checkBoxJogo3);
        checkBoxJogo4=findViewById(R.id.checkBoxJogo4);
        tvValortotal.setText("R$"+String.valueOf(valorTotal));

        checkBoxJogo1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBoxJogo1.isChecked()){
                    valorTotal=valorTotal+precoJogo1;
                } else {
                    valorTotal=valorTotal-precoJogo1;
                }
                //tvValortotal.setText("R$"+String.valueOf(valorTotal));
                tvValortotal.setText("R$"+String.format("%.2f", valorTotal));
            }
        });

        checkBoxJogo2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBoxJogo2.isChecked()){
                    valorTotal=valorTotal+precoJogo2;
                } else {
                    valorTotal=valorTotal-precoJogo2;
                }
//                tvValortotal.setText("R$"+String.valueOf(valorTotal));
                tvValortotal.setText("R$"+String.format("%.2f", valorTotal));
            }
        });

        checkBoxJogo3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBoxJogo3.isChecked()){
                    valorTotal=valorTotal+precoJogo3;
                } else {
                    valorTotal=valorTotal-precoJogo3;
                }
//                tvValortotal.setText("R$"+String.valueOf(valorTotal));
                tvValortotal.setText("R$"+String.format("%.2f", valorTotal));
            }
        });

        checkBoxJogo4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBoxJogo4.isChecked()){
                    valorTotal=valorTotal+precoJogo4;
                } else {
                    valorTotal=valorTotal-precoJogo4;
                }
//                tvValortotal.setText("R$"+String.valueOf(valorTotal));
                tvValortotal.setText("R$"+String.format("%.2f", valorTotal));
            }
        });




    }
}