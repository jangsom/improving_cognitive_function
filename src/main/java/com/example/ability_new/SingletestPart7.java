package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingletestPart7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest_part7);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(SingletestPart7.this,Singletest7391.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(SingletestPart7.this,Questionsingle.class);
        startActivity(intent);
    }
}