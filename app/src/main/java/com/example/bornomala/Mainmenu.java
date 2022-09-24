package com.example.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
    }

    public void bangla(View view) {
        Intent i=new Intent(Mainmenu.this,Menu.class);
        startActivity(i);
    }

    public void english(View view) {
        Intent i=new Intent(Mainmenu.this,english.class);
        startActivity(i);
    }
}