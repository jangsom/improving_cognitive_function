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
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.Date;


public class Singletest6306 extends AppCompatActivity implements View.OnClickListener {

    int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,t=0,f=0;
    ImageView circle1,circle2,circle3,circle4,circle5,circle6,
            circle7,circle8,circle9,circle10,circle11,circle12,circle13,circle14,circle15,circle16,circle17,circle18,circle19,circle20,circle21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest6306);
    }

    @Override
    public void onClick(View view) {
//160~164,77,146,155,158,159

        circle1 = (ImageView) findViewById(R.id.imageView162);
        circle2 = (ImageView) findViewById(R.id.imageView163);
        circle3 = (ImageView) findViewById(R.id.imageView164);


        circle4 = (ImageView) findViewById(R.id.imageView77);
        circle5 = (ImageView) findViewById(R.id.imageView155);
        circle6 = (ImageView) findViewById(R.id.imageView158);
        circle7 = (ImageView) findViewById(R.id.imageView159);
        circle8 = (ImageView) findViewById(R.id.imageView146);
        circle9 = (ImageView) findViewById(R.id.imageView160);
        circle10 = (ImageView) findViewById(R.id.imageView161);


        switch (view.getId()) {

            case R.id.button30:
                t = 1;
                break;

            case R.id.imageView162:
                circle1.setImageResource(R.drawable.circle);
                count1 = 1;
                break;

            case R.id.imageView163:
                circle2.setImageResource(R.drawable.circle);
                count2 = 1;
                break;
            case R.id.imageView164:
                circle3.setImageResource(R.drawable.circle);
                count3 = 1;
                break;

            case R.id.imageView77:
                circle4.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                f = 1;
                break;
            case R.id.imageView155:
            circle5.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
            f = 1;
            break;
            case R.id.imageView158:
            circle6.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
            f = 1;
            break;
            case R.id.imageView159:
            circle7.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
            f=1;
            break;
            case R.id.imageView146:
            circle8.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
            f=1;
            break;
            case R.id.imageView160:
            circle9.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
            f=1;
            break;
            case R.id.imageView161:
            circle10.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
            f=1;
            break;

            default:
            break;

    }
        if(t==1) {
        if(f==0){
            if (count1==1&&count2==1&&count3==1) {
                CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("7", new Date());
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_correct);
                dialog.setTitle("정답");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageCorrect);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest6306.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest6306.this,Singletest6321.class);
                        startActivity(intent);
                        finish();
                    }
                },1000);

            }
            else {
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_fail);
                dialog.setTitle("오답");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageFail);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest6306.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest6306.this,Singletest6321.class);
                        startActivity(intent);
                        finish();
                    }
                },1000);
            }
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
                    AlertDialog.Builder builder = new AlertDialog.Builder(Singletest6306.this);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    Intent intent = new Intent(Singletest6306.this,Singletest6321.class);
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
        Intent intent = new Intent(Singletest6306.this,Singletest6321.class);
        startActivity(intent);
    }
}