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

public class Singletest3162 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest3162);
    }
    public void onClick(View view) {
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        String value2 = editText2.getText().toString();

        EditText editText3 = (EditText)findViewById(R.id.editText3);
        String value3 = editText3.getText().toString();

        EditText editText4 = (EditText)findViewById(R.id.editText4);
        String value4 = editText4.getText().toString();

        EditText editText5 = (EditText)findViewById(R.id.editText5);
        String value5 = editText5.getText().toString();

        EditText editText6 = (EditText)findViewById(R.id.editText6);
        String value6 = editText6.getText().toString();

        EditText editText7 = (EditText)findViewById(R.id.editText7);
        String value7 = editText7.getText().toString();

        EditText editText8 = (EditText)findViewById(R.id.editText8);
        String value8 = editText8.getText().toString();

        EditText editText9 = (EditText)findViewById(R.id.editText9);
        String value9 = editText9.getText().toString();

        EditText editText10 = (EditText)findViewById(R.id.editText10);
        String value10 = editText10.getText().toString();

        EditText editText11 = (EditText)findViewById(R.id.editText11);
        String value11 = editText11.getText().toString();

        EditText editText12 = (EditText)findViewById(R.id.editText12);
        String value12 = editText12.getText().toString();

        EditText editText13 = (EditText)findViewById(R.id.editText13);
        String value13 = editText13.getText().toString();

        EditText editText14 = (EditText)findViewById(R.id.editText14);
        String value14 = editText14.getText().toString();

        EditText editText15 = (EditText)findViewById(R.id.editText15);
        String value15 = editText15.getText().toString();

        if(TextUtils.isEmpty(value2)&&TextUtils.isEmpty(value3)&&TextUtils.isEmpty(value4)&&TextUtils.isEmpty(value5)&&
                TextUtils.isEmpty(value6)&&TextUtils.isEmpty(value7)&&TextUtils.isEmpty(value8)&&TextUtils.isEmpty(value9)&&
                TextUtils.isEmpty(value10)&&TextUtils.isEmpty(value11)&&TextUtils.isEmpty(value12)&&TextUtils.isEmpty(value13)&&
                TextUtils.isEmpty(value14)&&TextUtils.isEmpty(value15))
        {
            Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();

        }
        else
        {
            if(value2.equals("ㄴ")&&value3.equals("ㄹ")&&value4.equals("ㅂ")&&
                    value5.equals("ㅇ")&&value6.equals("ㅊ")&&value7.equals("ㅍ")&&
                    value8.equals("ㅑ")&&value9.equals("ㅕ")&&value10.equals("ㅛ")&&
                    value11.equals("ㅠ")&&value12.equals("ㅡ")&&value13.equals("나")&&
                    value14.equals("라")&&value15.equals("마"))
            {
                //CorrectDatabase.IncreaseToday("3");
                CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("3", new Date());
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_correct);
                dialog.setTitle("정답");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageCorrect);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3162.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest3162.this,Singletest3163.class);
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3162.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest3162.this,Singletest3163.class);
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
                Intent intent = new Intent(Singletest3162.this,Questionsingle.class);
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
        Intent intent = new Intent(Singletest3162.this,Singletest3163.class);
        startActivity(intent);
    }
}