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


public class Singletest6305 extends AppCompatActivity implements View.OnClickListener {

    int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,t=0,f=0;
    ImageView circle1,circle2,circle3,circle4,circle5,circle6,
            circle7,circle8,circle9,circle10,circle11,circle12,circle13,circle14,circle15,circle16,circle17,circle18,circle19,circle20,circle21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest6305);

    }

    @Override
    public void onClick(View view) {

//59,65,,154,156,,77,154,,157

        circle1 = (ImageView) findViewById(R.id.imageView59);
        circle2 = (ImageView) findViewById(R.id.imageView65);
        circle3 = (ImageView) findViewById(R.id.imageView66);
        circle4 = (ImageView) findViewById(R.id.imageView149);
        //
        circle5 = (ImageView) findViewById(R.id.imageView150);
        circle6 = (ImageView) findViewById(R.id.imageView151);
        circle7 = (ImageView) findViewById(R.id.imageView152);
        circle8 = (ImageView) findViewById(R.id.imageView153);
        circle9 = (ImageView) findViewById(R.id.imageView154);
        circle10 = (ImageView) findViewById(R.id.imageView156);
        circle11 = (ImageView) findViewById(R.id.imageView77);
        circle12 = (ImageView) findViewById(R.id.imageView157);

        switch (view.getId()) {

        case R.id.button30:
        t = 1;
        break;

        case R.id.imageView59:
        circle1.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        count1 = 1;
        break;
        case R.id.imageView65:
        circle2.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        count2 = 1;
        break;
        case R.id.imageView66:
        circle3.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        count3 = 1;
        break;
        case R.id.imageView149:
        circle4.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        count4 = 1;
        break;


        case R.id.imageView150:
        circle5.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        f = 1;
        break;
        case R.id.imageView151:
        circle6.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        f = 1;
        break;
        case R.id.imageView152:
        circle7.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        f=1;
        break;
        case R.id.imageView153:
        circle8.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        f=1;
        break;
        case R.id.imageView154:
        circle9.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        f=1;
        break;
        case R.id.imageView77:
        circle10.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        f=1;
        break;
        case R.id.imageView156:
        circle11.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        f=1;
        break;
        case R.id.imageView157:
        circle12.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
        f=1;
        break;

        default:
        break;

    }
        if(t==1) {
        if(f==0){
            if (count1==1&&count2==1&&count3==1
                    &&count4==1) {
                CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("7", new Date());
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_correct);
                dialog.setTitle("??????");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageCorrect);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest6305.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest6305.this,Singletest6306.class);
                        startActivity(intent);
                        finish();
                    }
                },1000);

            }
            else {
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_fail);
                dialog.setTitle("??????");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageFail);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest6305.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest6305.this,Singletest6306.class);
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
            dialog.setTitle("??????");
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            ImageView vv = dialog.findViewById(R.id.imageFail);
            dialog.show();
            new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                @Override
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Singletest6305.this);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    Intent intent = new Intent(Singletest6305.this,Singletest6306.class);
                    startActivity(intent);
                    finish();
                }
            },1000);
        }
    }
    }
    public void onClick2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("??????").setMessage("?????? ????????? ???????????? ?????????????????????????");

        builder.setPositiveButton("???", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Intent intent = new Intent(getApplicationContext(),Questionsingle.class);
                startActivity(intent);//??????
            }
        });

        builder.setNegativeButton("?????????", new DialogInterface.OnClickListener(){
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
        Intent intent = new Intent(Singletest6305.this,Singletest6306.class);
        startActivity(intent);
    }
}