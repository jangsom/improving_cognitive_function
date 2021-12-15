package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Singletestrectcheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletestrectcheck);
    }
    public void onClick(View view){
        Intent intent = new Intent(Singletestrectcheck.this,Singletest3173.class);
        startActivity(intent);

    }
}