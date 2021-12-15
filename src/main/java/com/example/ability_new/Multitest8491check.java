package com.example.ability_new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Multitest8491check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi8491check);
    }
    public void onClick (View view){
        Intent intent = new Intent(Multitest8491check.this,Multitest8491.class);
        startActivity(intent);
    }
    public void onClick2 (View view){
        Intent intent = new Intent(Multitest8491check.this,Multitest8492.class);
        startActivity(intent);
    }
}