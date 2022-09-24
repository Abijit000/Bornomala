package com.example.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Vowel(View view) {
        Intent i=new Intent(Menu.this,vwel.class);
        startActivity(i);
    }

    public void cons(View view) {
        Intent i=new Intent(Menu.this,cons.class);
        startActivity(i);
    }

    public void chora(View view) {
        Intent i=new Intent(Menu.this,poem.class);
        startActivity(i);
    }
}