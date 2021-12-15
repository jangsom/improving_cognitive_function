package com.example.ability_new;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;


public class Singletest3132 extends AppCompatActivity implements View.OnClickListener {

    int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0,count13=0,count14=0,
            count15=0,count16=0,count17=0,count18=0,count19=0,count20=0,count21=0,f=0,t=0;
    ImageView circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10,circle11,circle12,circle13,circle14,
            circle15,circle16,circle17,circle18,circle19,circle20,circle21,circle22,circle23,circle24,circle25,circle26,circle27,circle28,
            circle29,circle30,circle31,circle32,circle33,circle34,circle35,circle36;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest3132);
    }

    @Override
    public void onClick(View view) {
        circle1 = (ImageView) findViewById(R.id.imageView12);
        circle2 = (ImageView) findViewById(R.id.imageView13);
        circle3 = (ImageView) findViewById(R.id.imageView14);
        circle4 = (ImageView) findViewById(R.id.imageView15);
        circle5 = (ImageView) findViewById(R.id.imageView16);
        circle6 = (ImageView) findViewById(R.id.imageView17);
        circle7 = (ImageView) findViewById(R.id.imageView18);
        circle8 = (ImageView) findViewById(R.id.imageView19);
        circle9 = (ImageView) findViewById(R.id.imageView20);
        circle10 = (ImageView) findViewById(R.id.imageView21);
        circle11 = (ImageView) findViewById(R.id.imageView22);
        circle12 = (ImageView) findViewById(R.id.imageView23);
        circle13 = (ImageView) findViewById(R.id.imageView24);
        circle14 = (ImageView) findViewById(R.id.imageView25);
        circle15 = (ImageView) findViewById(R.id.imageView26);
        circle16 = (ImageView) findViewById(R.id.imageView27);
        circle17 = (ImageView) findViewById(R.id.imageView28);
        circle18 = (ImageView) findViewById(R.id.imageView29);
        circle19 = (ImageView) findViewById(R.id.imageView30);
        circle20 = (ImageView) findViewById(R.id.imageView31);
        circle21 = (ImageView) findViewById(R.id.imageView32);
        circle22 = (ImageView) findViewById(R.id.imageView172);
        circle23 = (ImageView) findViewById(R.id.imageView173);
        circle24 = (ImageView) findViewById(R.id.imageView174);
        circle25 = (ImageView) findViewById(R.id.imageView175);
        circle26 = (ImageView) findViewById(R.id.imageView176);
        circle27 = (ImageView) findViewById(R.id.imageView177);
        circle28 = (ImageView) findViewById(R.id.imageView178);
        circle29 = (ImageView) findViewById(R.id.imageView179);
        circle30 = (ImageView) findViewById(R.id.imageView180);
        circle31 = (ImageView) findViewById(R.id.imageView181);
        circle32 = (ImageView) findViewById(R.id.imageView182);
        circle33 = (ImageView) findViewById(R.id.imageView183);
        circle34 = (ImageView) findViewById(R.id.imageView184);
        circle35 = (ImageView) findViewById(R.id.imageView185);
        circle36 = (ImageView) findViewById(R.id.imageView186);
        //정 12~32
        //오답 172~186

        switch (view.getId()) {
            case R.id.button30:
                t = 1;
                break;

            case R.id.imageView12:
                circle1.setImageResource(R.drawable.circle);
                count1 = 1;
                break;

            case R.id.imageView13:
                circle2.setImageResource(R.drawable.circle);
                count2 = 1;
                break;
            case R.id.imageView14:
                circle3.setImageResource(R.drawable.circle);
                count3 = 1;
                break;
            case R.id.imageView15:
                circle4.setImageResource(R.drawable.circle);
                count4 = 1;
                break;
            case R.id.imageView16:
                circle5.setImageResource(R.drawable.circle);
                count5 = 1;
                break;
            case R.id.imageView17:
                circle6.setImageResource(R.drawable.circle);
                count6 = 1;
                break;
            case R.id.imageView18:
                circle7.setImageResource(R.drawable.circle);
                count7 = 1;
                break;
            case R.id.imageView19:
                circle8.setImageResource(R.drawable.circle);
                count8 = 1;
                break;
            case R.id.imageView20:
                circle9.setImageResource(R.drawable.circle);
                count9 = 1;
                break;
            case R.id.imageView21:
                circle10.setImageResource(R.drawable.circle);
                count10 = 1;
                break;
            case R.id.imageView22:
                circle11.setImageResource(R.drawable.circle);
                count11 = 1;
                break;
            case R.id.imageView23:
                circle12.setImageResource(R.drawable.circle);
                count12 = 1;
                break;
            case R.id.imageView24:
                circle13.setImageResource(R.drawable.circle);
                count13 = 1;
                break;
            case R.id.imageView25:
                circle14.setImageResource(R.drawable.circle);
                count14 = 1;
                break;
            case R.id.imageView26:
                circle15.setImageResource(R.drawable.circle);
                count15 = 1;
                break;
            case R.id.imageView27:
                circle16.setImageResource(R.drawable.circle);
                count16 = 1;
                break;
            case R.id.imageView28:
                circle17.setImageResource(R.drawable.circle);
                count17 = 1;
                break;
            case R.id.imageView29:
                circle18.setImageResource(R.drawable.circle);
                count18 = 1;
                break;
            case R.id.imageView30:
                circle19.setImageResource(R.drawable.circle);
                count19 = 1;
                break;
            case R.id.imageView31:
                circle20.setImageResource(R.drawable.circle);
                count20 = 1;
                break;
            case R.id.imageView32:
                circle21.setImageResource(R.drawable.circle);
                count21 = 1;
                break;

                //

            case R.id.imageView172:
                circle22.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView173:
                circle23.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView174:
                circle24.setImageResource(R.drawable.circle);
                f = 1;
                break;
                case R.id.imageView175:
                circle25.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView176:
                circle26.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView177:
                circle27.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView178:
                circle28.setImageResource(R.drawable.circle);
                f = 1;
                break;
                case R.id.imageView179:
                circle29.setImageResource(R.drawable.circle);
                f = 1;
                break;
                case R.id.imageView180:
                circle30.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView181:
                circle31.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView182:
                circle32.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView183:
                circle33.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView184:
                circle34.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView185:
                circle35.setImageResource(R.drawable.circle);
                f = 1;
                break;
            case R.id.imageView186:
                circle36.setImageResource(R.drawable.circle);
                f = 1;
                break;

            default:
                break;

        }

        if(t==1) {
            if(f==0){
                if(count1==1&&count2==1&&count3==1&&count4==1&&count5==1&&count6==1&&count7==1&&count8==1&&count9==1&&count10==1&&
                        count11==1&&count12==1&&count13==1&&count14==1&&count15==1&&count16==1&&count17==1&&count18==1&&count19==1&&count20==1&&
                        count21==1){
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
                            AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3132.this);
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                            Intent intent = new Intent(Singletest3132.this,Singletest3133.class);
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
                    dialog.show();new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                        @Override
                        public void run() {
                            AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3132.this);
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                            Intent intent = new Intent(Singletest3132.this,Singletest3133.class);
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
                dialog.show();new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                @Override
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3132.this);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    Intent intent = new Intent(Singletest3132.this,Singletest3133.class);
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
                Intent intent = new Intent(Singletest3132.this,Questionsingle.class);
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
        Intent intent = new Intent(Singletest3132.this,Singletest3133.class);
        startActivity(intent);
    }
}