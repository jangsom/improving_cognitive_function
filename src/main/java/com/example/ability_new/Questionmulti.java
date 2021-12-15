package com.example.ability_new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Questionmulti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionmulti);

        findViewById(R.id.button5).setOnClickListener(onClickListener);
    }
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button5:
                        Intent intent = new Intent(Questionmulti.this,Multi1.class);
                        startActivity(intent);
                        break;
                }
            }
        };

    public void onClick(View view) {
        Intent intent = new Intent(Questionmulti.this,Multi1.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(Questionmulti.this,Questionsingle.class);
        startActivity(intent);
    }
    public void onClick3(View view) {
        Intent intent = new Intent(Questionmulti.this, home.class);
        startActivity(intent);//홈
    }

}