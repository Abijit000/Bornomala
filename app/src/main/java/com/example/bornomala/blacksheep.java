package com.example.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class blacksheep extends AppCompatActivity {

    MediaPlayer mediaPlayer=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blacksheep);
    }

    public void play(View view) {

        mediaPlayer= MediaPlayer.create(blacksheep.this,R.raw.blacksheep);
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