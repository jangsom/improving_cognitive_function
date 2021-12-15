package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Multitest7382check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitest7382check);
    }
    public void onClick (View view){
        Intent intent = new Intent(Multitest7382check.this,Multitest7382.class);
        startActivity(intent);
    }
    public void onClick2 (View view){
        Intent intent = new Intent(Multitest7382check.this,Multitest7382.class);
        startActivity(intent);
    }
}