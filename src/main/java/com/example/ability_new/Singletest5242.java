package com.example.ability_new;

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

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class Singletest5242 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest5242);

    }
    public void onClick(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);
        EditText editText4 = (EditText) findViewById(R.id.editTextNumber4);
        EditText editText5 = (EditText) findViewById(R.id.editTextNumber5);
        EditText editText6 = (EditText) findViewById(R.id.editTextNumber8);
        String getEdit = editText.getText().toString();
        String getEdit2 = editText2.getText().toString();
        String getEdit3 = editText3.getText().toString();
        String getEdit4 = editText4.getText().toString();
        String getEdit5 = editText5.getText().toString();
        String getEdit6 = editText6.getText().toString();

        if(TextUtils.isEmpty(getEdit)&&TextUtils.isEmpty(getEdit2)&&TextUtils.isEmpty(getEdit3)
                &&TextUtils.isEmpty(getEdit4)&&TextUtils.isEmpty(getEdit5)&&TextUtils.isEmpty(getEdit6))
        {
            Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();

        }
        else
        {
            int num1 = Integer.parseInt(editText.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());
            int num3 = Integer.parseInt(editText3.getText().toString());
            int num4 = Integer.parseInt(editText4.getText().toString());
            int num5 = Integer.parseInt(editText5.getText().toString());
            int num6 = Integer.parseInt(editText6.getText().toString());
            if(num1==9&&num2==27&&num3==11&&num4==6&&num5==31&&num6==25){
                CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("5", new Date());
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_correct);
                dialog.setTitle("정답");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageCorrect);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest5242.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest5242.this,Singletest5251.class);
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest5242.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest5242.this,Singletest5251.class);
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
        Intent intent = new Intent(Singletest5242.this,Singletest5251.class);
        startActivity(intent);
    }
}