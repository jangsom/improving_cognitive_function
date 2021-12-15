package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingletestCirclecheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest_circlecheck);
    }
    public void onClick(View view){
        Intent intent = new Intent(SingletestCirclecheck.this,Singletest3172.class);
        startActivity(intent);

    }
}