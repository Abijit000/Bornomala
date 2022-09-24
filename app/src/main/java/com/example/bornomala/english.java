package com.example.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class english extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
    }

    public void poem(View view) {
        Intent i=new Intent(english.this,poems.class);
        startActivity(i);
    }

    public void alphabet(View view) {
        Intent i=new Intent(english.this,Alphabet.class);
        startActivity(i);
    }
}