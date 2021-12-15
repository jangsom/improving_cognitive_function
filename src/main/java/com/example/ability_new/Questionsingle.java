package com.example.ability_new;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Questionsingle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionsingle);

        findViewById(R.id.textview).setOnClickListener(onClickListener);
        findViewById(R.id.textview2).setOnClickListener(onClickListener);
        findViewById(R.id.textview3).setOnClickListener(onClickListener);
        findViewById(R.id.textview4).setOnClickListener(onClickListener);
        findViewById(R.id.textview5).setOnClickListener(onClickListener);
        findViewById(R.id.textview6).setOnClickListener(onClickListener);
        findViewById(R.id.textview7).setOnClickListener(onClickListener);
        findViewById(R.id.textview8).setOnClickListener(onClickListener);
        findViewById(R.id.textview9).setOnClickListener(onClickListener);
    }
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.textview:
                        Intent intent = new Intent(Questionsingle.this,Singletest.class);
                        startActivity(intent);//131,151,153,154
                        break;
                    case R.id.textview2:
                        Intent intent2 = new Intent(Questionsingle.this,SingletestPart3.class);
                        startActivity(intent2);
                       // Intent intent2 = new Intent(Questionsingle.this,Singletest151.class);
                        //startActivity(intent2);//151
                        break;
                    case R.id.textview3:
                        Intent intent3 = new Intent(Questionsingle.this,SingletestPart4.class);
                        startActivity(intent3);
                        break;
                    case R.id.textview4:
                        Intent intent4 = new Intent(Questionsingle.this,SingletestPart5.class);
                        startActivity(intent4);
                        break;
                    case R.id.textview5:
                        Intent intent5 = new Intent(Questionsingle.this,SingletestPart6.class);
                        startActivity(intent5);
                        break;
                    case R.id.textview6:
                        Intent intent6 = new Intent(Questionsingle.this,SingletestPart7.class);
                        startActivity(intent6);
                        break;
                    case R.id.textview7:
                        Intent intent7 = new Intent(Questionsingle.this,SingletestPart8.class);
                        startActivity(intent7);
                        break;
                    case R.id.textview8:
                        Intent intent8 = new Intent(Questionsingle.this,SingletestPart9.class);
                        startActivity(intent8);
                        break;
                    case R.id.textview9:
                        Intent intent9 = new Intent(Questionsingle.this,SingletestPart10.class);
                        startActivity(intent9);
                        break;


                }
            }
        };

    public void onClick2(View view) {
        Intent intent = new Intent(Questionsingle.this,Questionmulti.class);
        startActivity(intent);//도움받아화면으로
    }
    public void onClick3(View view) {
        Intent intent = new Intent(Questionsingle.this,home.class);
        startActivity(intent);//홈
    }

}