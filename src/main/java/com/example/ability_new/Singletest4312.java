package com.example.ability_new;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class Singletest4312 extends AppCompatActivity {

    ////////////이거 안쓰는 코드임 연결 ㄴㄴㄴㄴㄴㄴㄴㄴ////////////////////////////////
    ////////////이거 안쓰는 코드임 연결 ㄴㄴㄴㄴㄴㄴㄴㄴ////////////////////////////////
    ////////////이거 안쓰는 코드임 연결 ㄴㄴㄴㄴㄴㄴㄴㄴ////////////////////////////////
    ////////////이거 안쓰는 코드임 연결 ㄴㄴㄴㄴㄴㄴㄴㄴ////////////////////////////////
    ////////////이거 안쓰는 코드임 연결 ㄴㄴㄴㄴㄴㄴㄴㄴ////////////////////////////////
    ////////////이거 안쓰는 코드임 연결 ㄴㄴㄴㄴㄴㄴㄴㄴ////////////////////////////////
    // //////////이거 안쓰는 코드임 연결 ㄴㄴㄴㄴㄴㄴㄴㄴ///////////////////////////////


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest7411);

    }

    public void onClick(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        int num1 = Integer.parseInt(editText.getText().toString());
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        int num2 = Integer.parseInt(editText2.getText().toString());
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);
        int num3 = Integer.parseInt(editText3.getText().toString());

        if(num1==8&&num2==8&&num3==6){
            CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("4", new Date());
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.activity_correct);
            dialog.setTitle("정답");
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            ImageView vv = dialog.findViewById(R.id.imageCorrect);
            dialog.show();
            Intent intent = new Intent(Singletest4312.this,Singletest7412.class);
            startActivity(intent);
            finish();
        }
        else
        {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.activity_fail);
            dialog.setTitle("오답");
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            ImageView vv = dialog.findViewById(R.id.imageFail);
            dialog.show();
            Intent intent = new Intent(Singletest4312.this,Singletest7412.class);
            startActivity(intent);
            finish();
        }
    }
    public void onClick2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("알림").setMessage("모든 활동을 종료하고 돌아가시겠습니까?");

        builder.setPositiveButton("예", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Intent intent = new Intent(Singletest4312.this,Questionsingle.class);
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
        Intent intent = new Intent(Singletest4312.this,Singletest5221.class);
        startActivity(intent);
    }
}