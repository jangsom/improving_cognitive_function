package com.example.ability_new;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class Singletest8481 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest8481);
    }

    public void onClick99(View view)
    {
        CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("8", new Date());
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_correct);
        dialog.setTitle("정답");
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView vv = dialog.findViewById(R.id.imageCorrect);
        dialog.show();
        new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
            @Override
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8481.this);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                Intent intent = new Intent(Singletest8481.this,Singletest8482.class);
                startActivity(intent);
                finish();
            }
        },1000);

    }
    public void onClick299(View view)
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
                AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8481.this);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                Intent intent = new Intent(Singletest8481.this,Singletest8482.class);
                startActivity(intent);
                finish();
            }
        },1000);
    }

    public void onClick399(View view)
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
                AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8481.this);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                Intent intent = new Intent(Singletest8481.this,Singletest8482.class);
                startActivity(intent);
                finish();
            }
        },1000);
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
        Intent intent = new Intent(Singletest8481.this,Singletest8482.class);
        startActivity(intent);
    }
}