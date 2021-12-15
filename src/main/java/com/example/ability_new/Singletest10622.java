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

public class Singletest10622 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest10622);
    }
    public void onClick (View view){
        EditText editText2 = (EditText)findViewById(R.id.editTextNumber);
        String value2 = editText2.getText().toString();

        EditText editText3 = (EditText)findViewById(R.id.editTextNumber2);
        String value3 = editText3.getText().toString();

        EditText editText4 = (EditText)findViewById(R.id.editTextNumber3);
        String value4 = editText4.getText().toString();

        EditText editText5 = (EditText)findViewById(R.id.editTextNumber4);
        String value5 = editText5.getText().toString();

        EditText editText6 = (EditText)findViewById(R.id.editTextNumber5);
        String value6 = editText6.getText().toString();

        EditText editText7 = (EditText)findViewById(R.id.editTextNumber6);
        String value7 = editText7.getText().toString();

        EditText editText8 = (EditText)findViewById(R.id.editTextNumber7);
        String value8 = editText8.getText().toString();

        EditText editText9 = (EditText)findViewById(R.id.editTextNumber8);
        String value9 = editText9.getText().toString();

        if(TextUtils.isEmpty(value2)&&TextUtils.isEmpty(value3)&&TextUtils.isEmpty(value4)&&
                TextUtils.isEmpty(value5)&&TextUtils.isEmpty(value6)&&TextUtils.isEmpty(value7)&&
                TextUtils.isEmpty(value8)&&TextUtils.isEmpty(value9))
        {
            Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();

        }
        else
        {
            if(value2.equals("배부르다")&&value3.equals("춥다")&&value4.equals("느리다")&&
                    value5.equals("짧다")&&value6.equals("남쪽")&&value7.equals("오다")&&
                    value8.equals("아래쪽")&&value9.equals("비우다"))
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest10622.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest10622.this,Part10CorrectGrape.class);
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest10622.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest10622.this,Part10CorrectGrape.class);
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
        Intent intent = new Intent(Singletest10622.this,Part10CorrectGrape.class);
        startActivity(intent);
    }
}