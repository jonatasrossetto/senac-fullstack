package com.jonatas.estudo5gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResultado;
    private Button btnVerificar;
    private EditText edtNbDecGasolina,edtNbDecAlcool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        btnVerificar = findViewById(R.id.btnVerificar);
        edtNbDecGasolina = findViewById(R.id.edtNbDecGasolina);
        edtNbDecAlcool = findViewById(R.id.edtNbDecAlcool);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double precoGasolina = Double.parseDouble(edtNbDecGasolina.getText().toString());
                double precoAlcool = Double.parseDouble(edtNbDecAlcool.getText().toString());
                if (precoAlcool<=precoGasolina*0.7){
                    tvResultado.setText("Abasteça com Alcool");
                } else {
                    tvResultado.setText("Abasteça com Gasolina");
                }

//                tvResultado.setText("Gasolina:"+precoGasolina+"Alcool"+precoAlcool);
            }
        });

    }
}