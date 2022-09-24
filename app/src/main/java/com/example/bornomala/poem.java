package com.example.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class poem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
    }

    public void a(View view) {
        Intent i=new Intent(poem.this,ayay.class);
        startActivity(i);
    }

    public void b(View view) {
        Intent i=new Intent(poem.this,khokhon.class);
        startActivity(i);
    }

    public void c(View view) {
        Intent i=new Intent(poem.this,katbirali.class);
        startActivity(i);
    }

    public void d(View view) {
        Intent i=new Intent(poem.this,taitai.class);
        startActivity(i);
    }

    public void e(View view) {
        Intent i=new Intent(poem.this,chadutheche.class);
        startActivity(i);
    }
}