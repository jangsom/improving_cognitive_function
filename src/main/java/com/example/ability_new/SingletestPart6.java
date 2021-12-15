package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingletestPart6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest_part6);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(SingletestPart6.this,Singletest6281.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(SingletestPart6.this,Questionsingle.class);
        startActivity(intent);

    }



}