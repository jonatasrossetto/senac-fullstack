package com.jonatas.estudo4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnToastCurta, btnToastLongo, btnSnackBarCurto, btnSnackBarLongo, btnAlertDialog;
    private ConstraintLayout tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tela = (ConstraintLayout) findViewById(R.id.Tela);
        btnToastCurta = (Button) findViewById(R.id.btnToastCurta);
        btnToastLongo = (Button) findViewById(R.id.btnToastLongo);
        btnSnackBarCurto = (Button) findViewById(R.id.btnSnackBarCurto);
        btnSnackBarLongo = (Button) findViewById(R.id.btnSnackBarLongo);
        btnAlertDialog = (Button) findViewById(R.id.btnDialogAlert);

        // define a variável contexto que se refere a tela utilizada
        Context context = getApplicationContext();

        btnToastCurta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://developer.android.com/guide/topics/ui/notifiers/toasts?hl=pt-br
                CharSequence text = "Esta é uma menssagem de toast curto";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        btnToastLongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "Esta é uma menssagem de toast longo";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        btnSnackBarLongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // snackbar usa o identificador da constraintlayout, tela, que está sendo utilizada
                Snackbar.make(tela, "mensagem snackbar longo", Snackbar.LENGTH_LONG).show();
            }
        });

        btnSnackBarCurto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // snackbar usa o identificador da constraintlayout, tela, que está sendo utilizada
                Snackbar.make(tela, "mensagem snackbar curto", Snackbar.LENGTH_SHORT).show();
            }
        });

        btnAlertDialog.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // alertdialog.builder é uma classe que define o objeto dlg atrelado ao contexto da tela
                AlertDialog.Builder dlg = new AlertDialog.Builder(tela.getContext());
                dlg.setTitle("Título da caixa de Dialogo");
                dlg.setMessage("Mensagem da caixa de dialogo");
                // o botão da caixa de dialogo pode estar associada a um listenner específico
//                dlg.setNeutralButton("OK", null);
                dlg.setPositiveButton("Positive", null);
                dlg.setNegativeButton("Negative", null);
                dlg.setNeutralButton("Neutral",null);
                dlg.show();
            }
        }));

    }
}