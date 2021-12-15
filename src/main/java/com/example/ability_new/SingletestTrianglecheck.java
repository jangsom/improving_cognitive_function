package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingletestTrianglecheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest_trianglecheck);
    }
    public void onClick(View view){
        Intent intent = new Intent(SingletestTrianglecheck.this,Singletest3174.class);
        startActivity(intent);

    }
}