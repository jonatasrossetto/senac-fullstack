package com.jonatas.estudo9dividircontadobar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtValorConta, edtQuantidadePessoas;
    private RadioButton rdBtnPagarGorjeta, rdBtnNaoPagarGorjeta;
    private TextView tvValorTotal, tvValorPessoa;
    private TextView textViewMensagem;
    private Button btnDividir, btnReset;
    private double valorConta;
    private double quantidadePessoas;
    private boolean pagarGorjeta=true;
    private RadioGroup radioGroupGorjeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValorConta = findViewById(R.id.edtValorConta);
        edtQuantidadePessoas = findViewById(R.id.edtQuantidadePessoas);
        rdBtnPagarGorjeta = findViewById(R.id.rdBtnPagarGorjeta);
        rdBtnNaoPagarGorjeta=findViewById(R.id.rdBtnNaoPagarGorjeta);
        btnDividir = findViewById(R.id.btnDividir);
        btnReset = findViewById(R.id.btnReset);
        tvValorPessoa = findViewById(R.id.tvValorPessoa);
        tvValorTotal = findViewById(R.id.tvValorTotal);
        radioGroupGorjeta = findViewById(R.id.radioGroupGorjeta);
        textViewMensagem = findViewById(R.id.textViewMensagem);
        quantidadePessoas=1f;
        valorConta=0f;

        edtValorConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtValorConta.getText().toString().isEmpty()) {
                    valorConta = 0;
                } else {
                    valorConta = Double.parseDouble(edtValorConta.getText().toString());
                }
                if (edtQuantidadePessoas.getText().toString().isEmpty()) {
                    quantidadePessoas = 1;
                } else {
                    quantidadePessoas = Double.parseDouble(edtQuantidadePessoas.getText().toString());
                };

                if (rdBtnPagarGorjeta.isChecked()) {
//                    textViewMensagem.setText("1");
                    pagarGorjeta=true;
                    tvValorTotal.setText(String.format("%.2f",valorConta*1.1));
                    tvValorPessoa.setText(String.format("%.2f",valorConta*1.1/quantidadePessoas));
                }
                if (rdBtnNaoPagarGorjeta.isChecked()) {
//                    textViewMensagem.setText("2");
                    pagarGorjeta=false;
                    tvValorTotal.setText(String.format("%.2f",valorConta));
                    tvValorPessoa.setText(String.format("%.2f",valorConta/quantidadePessoas));
                }
            }
        });

        edtQuantidadePessoas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtValorConta.getText().toString().isEmpty()) {
                    valorConta = 0;
                } else {
                    valorConta = Double.parseDouble(edtValorConta.getText().toString());
                }
                if (edtQuantidadePessoas.getText().toString().isEmpty()) {
                    quantidadePessoas = 1;
                } else {
                    quantidadePessoas = Double.parseDouble(edtQuantidadePessoas.getText().toString());
                };

                if (rdBtnPagarGorjeta.isChecked()) {
//                    textViewMensagem.setText("1");
                    pagarGorjeta=true;
                    tvValorTotal.setText(String.format("%.2f",valorConta*1.1));
                    tvValorPessoa.setText(String.format("%.2f",valorConta*1.1/quantidadePessoas));
                }
                if (rdBtnNaoPagarGorjeta.isChecked()) {
//                    textViewMensagem.setText("2");
                    pagarGorjeta=false;
                    tvValorTotal.setText(String.format("%.2f",valorConta));
                    tvValorPessoa.setText(String.format("%.2f",valorConta/quantidadePessoas));
                }
            }
        });

        radioGroupGorjeta.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (edtValorConta.getText().toString().isEmpty()) {
                    valorConta = 0;
                } else {
                    valorConta = Double.parseDouble(edtValorConta.getText().toString());
                }
                if (edtQuantidadePessoas.getText().toString().isEmpty()) {
                    quantidadePessoas = 1;
                } else {
                    quantidadePessoas = Double.parseDouble(edtQuantidadePessoas.getText().toString());
                };

                if (rdBtnPagarGorjeta.isChecked()) {
//                    textViewMensagem.setText("1");
                    pagarGorjeta=true;
                    tvValorTotal.setText(String.format("%.2f",valorConta*1.1));
                    tvValorPessoa.setText(String.format("%.2f",valorConta*1.1/quantidadePessoas));
                }
                if (rdBtnNaoPagarGorjeta.isChecked()) {
//                    textViewMensagem.setText("2");
                    pagarGorjeta=false;
                    tvValorTotal.setText(String.format("%.2f",valorConta));
                    tvValorPessoa.setText(String.format("%.2f",valorConta/quantidadePessoas));
                }
            }
        });

//        radioGroupGorjeta.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (edtValorConta.getText().toString().isEmpty()) {
//                    valorConta = 0;
//                } else {
//                    valorConta = Double.parseDouble(edtValorConta.getText().toString());
//                }
//
//                if (rdBtnPagarGorjeta.isChecked()) {
////                    textViewMensagem.setText("1");
//                    pagarGorjeta=true;
//                    tvValorTotal.setText(String.format("%.2f",valorConta*1.1));
//                }
//                if (rdBtnNaoPagarGorjeta.isChecked()) {
////                    textViewMensagem.setText("2");
//                    pagarGorjeta=false;
//                    tvValorTotal.setText(String.format("%.2f",valorConta));
//                }
//            }
//        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtValorConta.getText().toString().isEmpty()) {
                    valorConta = 0;
                } else {
                    valorConta = Double.parseDouble(edtValorConta.getText().toString());
                }
                if (edtQuantidadePessoas.getText().toString().isEmpty()) {
                    quantidadePessoas = 1;
                } else {
                    quantidadePessoas = Double.parseDouble(edtQuantidadePessoas.getText().toString());
                };

                if (quantidadePessoas==0) quantidadePessoas=1;

                if (pagarGorjeta) {
                    textViewMensagem.setText("pagar gorjeta");
                    tvValorTotal.setText(String.format("%.2f",valorConta*1.1));
                    tvValorPessoa.setText(String.format("%.2f",valorConta*1.1/quantidadePessoas));
                } else {
                    textViewMensagem.setText("não pagar gorjeta");
                    tvValorTotal.setText(String.format("%.2f",valorConta));
                    tvValorPessoa.setText(String.format("%.2f",valorConta/quantidadePessoas));
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorConta=0f;
                quantidadePessoas=1f;
                pagarGorjeta=true;
                tvValorTotal.setText("0.00");
                tvValorPessoa.setText("0.00");
                edtValorConta.setText("");
                edtQuantidadePessoas.setText("");
                rdBtnNaoPagarGorjeta.setChecked(false);
                rdBtnPagarGorjeta.setChecked(true);
            }
        });


    }
}