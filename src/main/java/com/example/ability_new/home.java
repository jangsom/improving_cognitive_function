package com.example.ability_new;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClick(View view) {
        Intent intent = new Intent(home.this,Questionsingle.class);
        startActivity(intent);//혼자풀기,도움받아풀기 선택지
    }
    public void onClick2(View view) {
        Intent intent = new Intent(home.this,CheckGrape.class);
        startActivity(intent);//통계연결로 바꿔야함
    }
    public void onClick3(View view) {
        Intent intent = new Intent(home.this,Main2.class);
        startActivity(intent);
        //이거누르면 데이터부분에서도 로그아웃되게 바꿔야함!!!! 중요
    }
    public void onClick4(View view) {
    }

}