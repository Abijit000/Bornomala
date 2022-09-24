package com.example.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class vwel extends AppCompatActivity {

    MediaPlayer mediaPlayer=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vwel);
    }

    public void অ(View view) {

        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.o);
        mediaPlayer.start();
    }

    public void আ(View view) {

        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.a);
        mediaPlayer.start();
    }


    public void ই(View view) {

        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.i);
        mediaPlayer.start();
    }

    public void ঈ(View view) {

        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.ib);
        mediaPlayer.start();
    }


    public void উ(View view) {

        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.u);
        mediaPlayer.start();
    }

    public void ঊ(View view) {

        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.ub);
        mediaPlayer.start();
    }

    public void ঋ(View view) {

        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.ri);
        mediaPlayer.start();
    }

    public void এ(View view) {
        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.e);
        mediaPlayer.start();
    }

    public void ঐ(View view) {
        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.oi);
        mediaPlayer.start();
    }

    public void ও(View view) {
        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.ob);
        mediaPlayer.start();
    }

    public void ঔ(View view) {
        mediaPlayer=MediaPlayer.create(vwel.this,R.raw.ou);
        mediaPlayer.start();
    }
}