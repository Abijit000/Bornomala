package com.example.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class flash extends AppCompatActivity {

    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

        progressBar = findViewById(R.id.progressBar);

        startprogerss();
    }

    private void startprogerss() {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    for (int p=0;p<=100;p=p+10){

                        Thread.sleep(100);

                        progressBar.setProgress(p);}
                    Intent i=new Intent(flash.this,Mainmenu.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();



    }
}