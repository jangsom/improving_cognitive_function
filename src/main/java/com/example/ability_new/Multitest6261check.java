package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Multitest6261check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitest6261check);
    }
    public void onClick (View view){
        Intent intent = new Intent(Multitest6261check.this,Multitest6261.class);
        startActivity(intent);
    }
    public void onClick2 (View view){
        Intent intent = new Intent(Multitest6261check.this,Multitest6262.class);
        startActivity(intent);
    }
}