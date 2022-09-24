package com.example.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Little extends AppCompatActivity {

    MediaPlayer mediaPlayer=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_little);
    }

    public void play(View view) {

        mediaPlayer= MediaPlayer.create(Little.this,R.raw.littlestar);
        mediaPlayer.start();
    }

    public void pause(View view) {

        mediaPlayer.pause();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mediaPlayer.pause();
    }
}