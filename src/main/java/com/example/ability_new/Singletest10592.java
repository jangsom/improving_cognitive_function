package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Date;

public class Singletest10592 extends AppCompatActivity {

    ////////////이거 안쓰는 코드임 연결 ㄴㄴㄴㄴㄴㄴㄴㄴ////////////////////////////////
    ////////////이거 안쓰는 코드임 연결 ㄴㄴㄴㄴㄴㄴㄴㄴ////////////////////////////////
    ////////////이거 안쓰는 코드임 연결 ㄴㄴㄴㄴㄴㄴㄴㄴ////////////////////////////////


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_singletest10592);
    }
    public void onClick(View view) {
        EditText editText2 = (EditText)findViewById(R.id.editTextNumber2);
        String value2 = editText2.getText().toString();
        EditText editText3 = (EditText)findViewById(R.id.editTextNumber3);
        String value3 = editText3.getText().toString();
        EditText editText4 = (EditText)findViewById(R.id.editTextNumber4);
        String value4 = editText4.getText().toString();


        if(TextUtils.isEmpty(value2)&&TextUtils.isEmpty(value3)&&TextUtils.isEmpty(value4))
        {
            Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();

        }
        else
        {
            if(value2.equals("백두산이")&&value3.equals("우리나라")&&value4.equals("삼천리"))
            {
                CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("10", new Date());
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_correct);
                dialog.setTitle("정답");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageCorrect);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest10592.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest10592.this,Singletest10611.class);
                        startActivity(intent);
                        finish();
                    }
                },1000);

            }
            else
            {
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_fail);
                dialog.setTitle("오답");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageFail);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest10592.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest10592.this,Singletest10611.class);
                        startActivity(intent);
                        finish();
                    }
                },1000);
            }
        }

    }

    public void onClick2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("알림").setMessage("모든 활동을 종료하고 돌아가시겠습니까?");

        builder.setPositiveButton("예", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Intent intent = new Intent(getApplicationContext(),Questionsingle.class);
                startActivity(intent);//뒤로
            }
        });

        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                //Toast.makeText(getApplicationContext(), "Cancel Click", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void onClick1(View view) {
        Intent intent = new Intent(Singletest10592.this,Singletest10611.class);
        startActivity(intent);
    }
}