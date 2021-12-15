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


public class Singletest6302 extends AppCompatActivity implements View.OnClickListener {

    int count1=0,count2=0,count3=0,count4=0,count5=0,t=0,f=0;
    ImageView circle1,circle2,circle3,circle4,circle5,circle6,
            circle7,circle8,circle9,circle10,circle11,circle12,circle13,circle14,circle15,circle16,circle17,circle18,circle19,circle20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest6302);

    }
    @Override
    public void onClick(View view) {

        circle1 = (ImageView) findViewById(R.id.imageView59);
        circle2 = (ImageView) findViewById(R.id.imageView60);
        circle3 = (ImageView) findViewById(R.id.imageView75);
        circle4 = (ImageView) findViewById(R.id.imageView76);
        circle5 = (ImageView) findViewById(R.id.imageView78);
        circle6 = (ImageView) findViewById(R.id.imageView77);
        circle7 = (ImageView) findViewById(R.id.imageView80);
        circle8 = (ImageView) findViewById(R.id.imageView96);
        circle9 = (ImageView) findViewById(R.id.imageView97);
        circle10 = (ImageView) findViewById(R.id.imageView98);
        circle11 = (ImageView) findViewById(R.id.imageView99);
        circle12 = (ImageView) findViewById(R.id.imageView100);
        circle13 = (ImageView) findViewById(R.id.imageView101);
        circle14 = (ImageView) findViewById(R.id.imageView102);
        circle15 = (ImageView) findViewById(R.id.imageView103);
        circle16 = (ImageView) findViewById(R.id.imageView104);
        circle17 = (ImageView) findViewById(R.id.imageView105);
        circle18 = (ImageView) findViewById(R.id.imageView106);
        circle19 = (ImageView) findViewById(R.id.imageView94);
        circle20 = (ImageView) findViewById(R.id.imageView95);

        switch (view.getId()) {


            case R.id.button30:
                t = 1;
                break;

            case R.id.imageView59:
                circle1.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                count1 = 1;
                break;
            case R.id.imageView60:
                circle2.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                count2 = 1;
                break;
            case R.id.imageView75:
                circle3.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                count3 = 1;
                break;
            case R.id.imageView76:
                circle4.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                count4 = 1;
                break;
            case R.id.imageView78:
                circle5.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                count5 = 1;
                break;

                //

                case R.id.imageView77:
                    circle6.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView80:
                    circle7.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView96:
                    circle8.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView97:
                    circle9.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView98:
                    circle10.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView99:
                    circle11.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView100:
                    circle12.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView101:
                    circle13.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView102:
                    circle14.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView103:
                    circle15.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView104:
                    circle16.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView105:
                    circle17.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView106:
                    circle18.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView94:
                    circle19.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;
                case R.id.imageView95:
                    circle20.setBackground(ContextCompat.getDrawable(this, R.drawable.rededge));
                    f=1;
                    break;

                default:
                    break;

            }
            if(t==1) {
                if(f==0){
                    if (count1==1&&count2==1&&count3==1
                            &&count4==1&&count5==1) {
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
                                AlertDialog.Builder builder = new AlertDialog.Builder(Singletest6302.this);
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();
                                Intent intent = new Intent(Singletest6302.this,Singletest6303.class);
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
                                AlertDialog.Builder builder = new AlertDialog.Builder(Singletest6302.this);
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();
                                Intent intent = new Intent(Singletest6302.this,Singletest6303.class);
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
                            AlertDialog.Builder builder = new AlertDialog.Builder(Singletest6302.this);
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                            Intent intent = new Intent(Singletest6302.this,Singletest6303.class);
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
        Intent intent = new Intent(Singletest6302.this,Singletest6303.class);
        startActivity(intent);
    }
}