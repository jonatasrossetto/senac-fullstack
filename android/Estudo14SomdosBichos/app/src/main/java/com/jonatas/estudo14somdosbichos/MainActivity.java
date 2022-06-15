package com.jonatas.estudo14somdosbichos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgBtnChicken, imgBtnDog;
    private ImageButton imgBtnLion, imgBtnHorse;
    private ImageButton imgBtnSheep, imgBtnRooster;
    private MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBtnChicken = findViewById(R.id.imgBtnChicken);
        imgBtnDog = findViewById(R.id.imgBtnDog);
        imgBtnHorse=findViewById(R.id.imgBtnHorse);
        imgBtnLion=findViewById(R.id.imgBtnLion);
        imgBtnRooster=findViewById(R.id.imgBtnRooster);
        imgBtnSheep=findViewById(R.id.imgBtnSheep);

        imgBtnChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.galinha);
                mediaPlayer.start();
            };
        });

        imgBtnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cao);
                mediaPlayer.start();
            }
        });

        imgBtnLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.leao);
                mediaPlayer.start();
            }
        });

        imgBtnHorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cavalo);
                mediaPlayer.start();
            }
        });

        imgBtnRooster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.galo);
                mediaPlayer.start();
            }
        });

        imgBtnSheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ovelha);
                mediaPlayer.start();
            }
        });
    } // end onCreate

    @Override
    protected void onDestroy(){
        super.onDestroy();
        if ((mediaPlayer!=null)&&(mediaPlayer.isPlaying())){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }


} // end class