package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MultitestPart1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitest_part1);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(MultitestPart1.this,Questionsingle.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(MultitestPart1.this,MultitestPart2.class);
        startActivity(intent);
    }
    public void onClick3(View view) {
        Intent intent = new Intent(MultitestPart1.this,Multi1.class);
        startActivity(intent);
    }

}