package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MultitestPart3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitest_part3);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(MultitestPart3.this,MultitestPart2.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(MultitestPart3.this,MultitestPart4.class);
        startActivity(intent);
    }
    public void onClick3(View view) {
    }
}