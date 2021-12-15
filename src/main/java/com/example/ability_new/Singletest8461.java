package com.example.ability_new;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class Singletest8461 extends AppCompatActivity implements View.OnClickListener{

    private int count1 = 0, count2 = 0,count3=0,count4=0,count5=0,count6=0,count7=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single8461);


        //TextView Text = (TextView) findViewById(R.id.textView36);
        //Text.setTextColor(Color.GRAY);
        // final Button button1 = (Button) findViewById(R.id.button65);
        //1 button1.setOnClickListener(new View.OnClickListener(){
    }//온클릭 안에넣으면 지워

         @SuppressLint("NonConstantResourceId")
         public void onClick(View view) {

             switch (view.getId()) {
                 case R.id.button30:
                     if(count1==1 && count2==1 && count3==1 && count4==1 && count5==1)
                     {
                         CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("8", new Date());
                         Dialog dialog = new Dialog(Singletest8461.this);
                         dialog.setContentView(R.layout.activity_correct);
                         dialog.setTitle("정답");
                         dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                         ImageView vv = dialog.findViewById(R.id.imageCorrect);
                         dialog.show();
                         new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                             @Override
                             public void run() {
                                 AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8461.this);
                                 AlertDialog alertDialog = builder.create();
                                 alertDialog.show();
                                 Intent intent = new Intent(Singletest8461.this, Singletest8462.class);
                                 startActivity(intent);
                                 finish();
                             }
                         },1000);

                     }
                     else{
                         Dialog dialog = new Dialog(Singletest8461.this);
                         dialog.setContentView(R.layout.activity_fail);
                         dialog.setTitle("오답");
                         dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                         ImageView vv = dialog.findViewById(R.id.imageFail);
                         dialog.show();
                         new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                             @Override
                             public void run() {
                                 AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8461.this);
                                 AlertDialog alertDialog = builder.create();
                                 alertDialog.show();
                                 Intent intent = new Intent(Singletest8461.this, Singletest8462.class);
                                 startActivity(intent);
                                 finish();
                             }
                         },1000);
                     }
                     break;
                 case R.id.textView42:

                     AlertDialog.Builder dlg = new AlertDialog.Builder(Singletest8461.this);
                     dlg.setTitle("정답을 체크하세요");
                     final String[] versionArray = new String[]{"기억자", "니은자", "디귿자", "리을자",
                             "미음자"};
                     final boolean[] checkArray = new boolean[]{false, false, false, false, false};
                     dlg.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView42);
                             Text.setText(versionArray[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {

                                     TextView Text = (TextView) findViewById(R.id.textView42);
                                     Text.setEnabled(false);

                                     if (checkArray[0] && !checkArray[1] && !checkArray[2] &&
                                             !checkArray[3] && !checkArray[4]) {

                                         count1=1;
                                     }else{count1=0;}
                                     }
                             })
                             .show();

                     break;
                 case R.id.textView45:

                     AlertDialog.Builder dlg2 = new AlertDialog.Builder(Singletest8461.this);
                     dlg2.setTitle("정답을 체크하세요");
                     final String[] versionArray2 = new String[]{"곰", "꿩", "매", "개",
                             "소"};
                     final boolean[] checkArray2 = new boolean[]{false, false, false, false, false};
                     dlg2.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg2.setMultiChoiceItems(versionArray2, checkArray2, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView45);
                             Text.setText(versionArray2[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {

                                     TextView Text = (TextView) findViewById(R.id.textView45);
                                     Text.setEnabled(false);


                                     if (!checkArray2[0] && !checkArray2[1] && !checkArray2[2] &&
                                             checkArray2[3] && !checkArray2[4]) {

                                         count2=1;
                                     }else{count2=0;}

                                 }
                             })
                             .show();

                     break;
                 case R.id.textView46:

                     AlertDialog.Builder dlg3 = new AlertDialog.Builder(Singletest8461.this);
                     dlg3.setTitle("정답을 체크하세요");
                     final String[] versionArray3 = new String[]{"찻잔", "촛불", "등잔", "그늘",
                             "다리"};
                     final boolean[] checkArray3 = new boolean[]{false, false, false, false, false};
                     dlg3.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg3.setMultiChoiceItems(versionArray3, checkArray3, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView46);
                             Text.setText(versionArray3[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {

                                     TextView Text = (TextView) findViewById(R.id.textView46);
                                     Text.setEnabled(false);

                                     if (!checkArray3[0] && !checkArray3[1] && checkArray3[2] &&
                                             !checkArray3[3] && !checkArray3[4]) {

                                         count3=1;
                                     }else{count3=0;}

                                 }
                             })
                             .show();

                     break;
                 case R.id.textView47:

                     AlertDialog.Builder dlg4 = new AlertDialog.Builder(Singletest8461.this);
                     dlg4.setTitle("정답을 체크하세요");
                     final String[] versionArray4 = new String[]{"장맛비", "가랑비", "소나기", "장대비",
                             "이슬비"};
                     final boolean[] checkArray4 = new boolean[]{false, false, false, false, false};
                     dlg4.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg4.setMultiChoiceItems(versionArray4, checkArray4, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView47);
                             Text.setText(versionArray4[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {

                                     TextView Text = (TextView) findViewById(R.id.textView47);
                                     Text.setEnabled(false);

                                     if (!checkArray4[0] && checkArray4[1] && !checkArray4[2] &&
                                             !checkArray4[3] && !checkArray4[4]) {

                                         count4=1;
                                     }else{count4=0;}

                                 }
                             })
                             .show();

                     break;
                 case R.id.textView48:

                     AlertDialog.Builder dlg5 = new AlertDialog.Builder(Singletest8461.this);
                     dlg5.setTitle("정답을 체크하세요");
                     final String[] versionArray5 = new String[]{"열매", "잎새", "바람", "그네",
                             "벌레"};
                     final boolean[] checkArray5 = new boolean[]{false, false, false, false, false};
                     dlg5.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg5.setMultiChoiceItems(versionArray5, checkArray5, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView48);
                             Text.setText(versionArray5[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {


                                     TextView Text = (TextView) findViewById(R.id.textView48);
                                     Text.setEnabled(false);

                                     if (!checkArray5[0] && !checkArray5[1] && checkArray5[2] &&
                                             !checkArray5[3] && !checkArray5[4]) {

                                         count5=1;
                                     }else{count5=0;}
                                 }
                             })
                             .show();

                     break;

                 default:
                     break;
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
        Intent intent = new Intent(Singletest8461.this,Singletest8462.class);
        startActivity(intent);
    }
}

