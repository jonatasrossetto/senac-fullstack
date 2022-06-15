package com.jonatas.estudo15votacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnVotar, btnFinalizar;
    private RadioGroup radioGroupSimpsonsFamily;
    private ImageView imageView,imageView2;
    private RadioButton radioButton, rdBtnHommer, rdBtnMarge, rdBtnBart ;
    private RadioButton rdBtnLisa, rdBtnMaggie;
    private TextView tvMessage, textView, textView3, textView4;
    int votosHommer=0, votosMarge=0, votosBart=0;
    int votosLisa=0, votosMaggie=0;

    private void inicio() {
        btnVotar=findViewById(R.id.btnVotar);
        btnFinalizar=findViewById(R.id.btnFinalizar);
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        radioGroupSimpsonsFamily=findViewById(R.id.radioGroupSimpsonsFamily);
        tvMessage=findViewById(R.id.tvMessage);
        rdBtnHommer=findViewById(R.id.rdBtnHommer);
        rdBtnMarge=findViewById(R.id.rdBtnMarge);
        rdBtnBart=findViewById(R.id.rdBtnBart);
        rdBtnLisa=findViewById(R.id.rdBtnLisa);
        rdBtnMaggie=findViewById(R.id.rdBtnMaggie);
        textView=findViewById(R.id.textView);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);

        imageView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicio();

        radioGroupSimpsonsFamily.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String button;
                int selectedId=radioGroupSimpsonsFamily.getCheckedRadioButtonId();
                radioButton=findViewById(selectedId);
                button = radioButton.getText().toString();
//                tvMessage.setText(Integer.toString(selectedId));
                tvMessage.setText(button);
                if (rdBtnHommer.isChecked()) {
                    imageView.setImageResource(R.drawable.homersimpson);
                }
                if (rdBtnMarge.isChecked()) {
                    imageView.setImageResource(R.drawable.margesimpson);
                }
                if (rdBtnBart.isChecked()) {
                    imageView.setImageResource(R.drawable.bartsimpson);
                }
                if (rdBtnLisa.isChecked()) {
                    imageView.setImageResource(R.drawable.lisasimpson);
                }
                if (rdBtnMaggie.isChecked()) {
                    imageView.setImageResource(R.drawable.maggiesimpson);
                }
//                tvMessage.setText("click");
            }
        }); // end radioGroupSimpsonsFamily.setOnCheckedChangeListener

        btnVotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=radioGroupSimpsonsFamily.getCheckedRadioButtonId();
                radioButton=findViewById(selectedId);

                if (rdBtnHommer.isChecked()) {
                    votosHommer++;
                    tvMessage.setText("voto para Hommer");
                    rdBtnHommer.setChecked(false);
                }
                if (rdBtnMarge.isChecked()) {
                    votosMarge++;
                    tvMessage.setText("voto para Marge");
                    rdBtnMarge.setChecked(false);
                }
                if (rdBtnBart.isChecked()) {
                    votosBart++;
                    tvMessage.setText("voto para Bart");
                    rdBtnBart.setChecked(false);
                }
                if (rdBtnLisa.isChecked()) {
                    votosLisa++;
                    tvMessage.setText("voto para Lisa");
                    rdBtnLisa.setChecked(false);
                }
                if (rdBtnMaggie.isChecked()) {
                    votosMaggie++;
                    tvMessage.setText("voto para Maggie");
                    rdBtnMaggie.setChecked(false);
                }
                imageView.setImageResource(R.drawable.simpsonsfamily);
                tvMessage.setText("xxxxx");




            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resultado;
                radioGroupSimpsonsFamily.setVisibility(View.INVISIBLE);
                btnVotar.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.INVISIBLE);
                textView.setVisibility(View.INVISIBLE);
                tvMessage.setVisibility(View.INVISIBLE);
                btnFinalizar.setVisibility(View.INVISIBLE);

                imageView2.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.VISIBLE);


                resultado = "Hommer: "+votosHommer+" votos \n"
                        +"Marge: "+votosMarge+" votos \n"
                        +"Bart: "+votosBart+" votos \n"
                        +"Lisa: "+votosLisa+" votos \n"
                        +"Maggie: "+votosMaggie+" votos";

                textView4.setText(resultado);

                //tvMessage.setVisibility(View.INVISIBLE);
                if ((votosHommer>votosMarge)&&(votosHommer>votosBart)&&(votosHommer>votosLisa)&&(votosHommer>votosMaggie)){
                    imageView2.setImageResource(R.drawable.homersimpson);
//                    tvMessage.setText("Hommer é o vencedor da eleição, com "+votosHommer+" votos!");
                    textView3.setText("Eleito: Hommer");
                }
                if ((votosMarge>votosHommer)&&(votosMarge>votosBart)&&(votosMarge>votosLisa)&&(votosMarge>votosMaggie)){
                    imageView2.setImageResource(R.drawable.margesimpson);
                    textView3.setText("Eleito: Marge");
//                    tvMessage.setText("Marge é a vencedora da eleição, com "+votosMarge+" votos!");
                }
                if ((votosBart>votosHommer)&&(votosBart>votosMarge)&&(votosBart>votosLisa)&&(votosBart>votosMaggie)){
                    imageView2.setImageResource(R.drawable.bartsimpson);
                    textView3.setText("Eleito: Bart");
//                    tvMessage.setText("Bart é o vencedor da eleição, com "+votosBart+" votos!");
                }
                if ((votosLisa>votosHommer)&&(votosLisa>votosMarge)&&(votosLisa>votosBart)&&(votosLisa>votosMaggie)){
                    imageView2.setImageResource(R.drawable.lisasimpson);
                    textView3.setText("Eleito: Lisa");
//                    tvMessage.setText("Lisa é a vencedora da eleição, com "+votosLisa+" votos!");
                }
                if ((votosMaggie>votosHommer)&&(votosMaggie>votosMarge)&&(votosMaggie>votosBart)&&(votosMaggie>votosLisa)){
                    imageView2.setImageResource(R.drawable.maggiesimpson);
                    textView3.setText("Eleito: Maggie");
//                    tvMessage.setText("Maggie é a vencedora da eleição, com "+votosMaggie+" votos!");
                }
                if ((votosHommer==0)&&(votosMarge==0)&&(votosBart==0)&&(votosLisa==0)&(votosMaggie==0)){
                    imageView2.setImageResource(R.drawable.simpsonsfamily);
                    tvMessage.setText("Não existem votos!!! Nínguem ganhou!!!");
                }
            }
        });


    }
}