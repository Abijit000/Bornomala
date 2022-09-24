package com.example.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class poems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poems);
    }

    public void a(View view) {
        Intent i=new Intent(poems.this,blacksheep.class);
        startActivity(i);
    }

    public void b(View view) {

        Intent i=new Intent(poems.this,Jhonny.class);
        startActivity(i);
    }

    public void c(View view) {

        Intent i=new Intent(poems.this,Little.class);
        startActivity(i);
    }
}