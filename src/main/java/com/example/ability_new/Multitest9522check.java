package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Multitest9522check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitest9522check);
    }
    public void onClick (View view){
        Intent intent = new Intent(Multitest9522check.this,Multitest9522.class);
        startActivity(intent);
    }
    public void onClick2 (View view){
        Intent intent = new Intent(Multitest9522check.this,Multitest9522.class);
        startActivity(intent);
    }
}