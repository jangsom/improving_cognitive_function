package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingletestPart4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest_part4);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(SingletestPart4.this,Singletest4181.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(SingletestPart4.this,Questionsingle.class);
        startActivity(intent);
    }
    public void onClick3(View view) {
    }
    public void onClick4(View view) {
    }
    public void onClick5(View view) {
    }
}