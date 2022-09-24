package com.example.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Alphabet extends AppCompatActivity {

    MediaPlayer mediaPlayer=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
    }

    public void a(View view) {

        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.aa);
        mediaPlayer.start();
    }

    public void b(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ab);
        mediaPlayer.start();
    }

    public void c(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ac);
        mediaPlayer.start();
    }

    public void d(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ad);
        mediaPlayer.start();
    }

    public void e(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ae);
        mediaPlayer.start();
    }

    public void f(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.af);
        mediaPlayer.start();
    }

    public void g(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ag);
        mediaPlayer.start();
    }

    public void h(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ah);
        mediaPlayer.start();
    }

    public void i(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ai);
        mediaPlayer.start();
    }

    public void j(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.aj);
        mediaPlayer.start();
    }

    public void k(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ak);
        mediaPlayer.start();
    }

    public void l(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.al);
        mediaPlayer.start();
    }

    public void m(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.am);
        mediaPlayer.start();
    }

    public void n(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.an);
        mediaPlayer.start();
    }

    public void o(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ao);
        mediaPlayer.start();
    }

    public void p(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ap);
        mediaPlayer.start();
    }

    public void q(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.aq);
        mediaPlayer.start();
    }

    public void r(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ar);
        mediaPlayer.start();
    }

    public void s(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.as);
        mediaPlayer.start();
    }

    public void t(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.at);
        mediaPlayer.start();
    }

    public void u(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.au);
        mediaPlayer.start();
    }

    public void v(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.av);
        mediaPlayer.start();
    }

    public void w(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.aw);
        mediaPlayer.start();
    }

    public void x(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ax);
        mediaPlayer.start();
    }

    public void y(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.ay);
        mediaPlayer.start();
    }

    public void Z(View view) {
        mediaPlayer= MediaPlayer.create(Alphabet.this,R.raw.az);
        mediaPlayer.start();
    }
}