package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Singletest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest);
        Drawable alpha = ((ImageView)findViewById(R.id.imageView49)).getDrawable();
        alpha.setAlpha(170);//뒤로가기 버튼 투명도 설정 불투명 max250임
    }

    public void onClick2(View view) {
        Intent intent = new Intent(Singletest.this,Questionsingle.class);
        startActivity(intent);
    }
    public void onTextViewClicked2(View view) {
        //Intent intent = new Intent(Singletest.this,Singletest6261.class);
        Intent intent = new Intent(Singletest.this,Single1.class);
        startActivity(intent);
    }
    public void onTextViewClicked3(View view) {
    }

    public void onTextViewClicked4(View view) {
    }
}