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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class Singletest8462 extends AppCompatActivity implements View.OnClickListener{

    private int count1 = 0, count2 = 0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single8462);


        //TextView Text = (TextView) findViewById(R.id.textView36);
        //Text.setTextColor(Color.GRAY);
        // final Button button1 = (Button) findViewById(R.id.button65);
        //1 button1.setOnClickListener(new View.OnClickListener(){
    }//온클릭 안에넣으면 지워

         @SuppressLint("NonConstantResourceId")
         public void onClick(View view) {

             switch (view.getId()) {
                 case R.id.button30:
                     if(count1==1 && count2==1 && count3==1 && count4==1 && count5==1 &&count6==1&&count7==1&&count8==1)
                     {
                         CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("8", new Date());
                         Dialog dialog = new Dialog(Singletest8462.this);
                         dialog.setContentView(R.layout.activity_correct);
                         dialog.setTitle("정답");
                         dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                         ImageView vv = dialog.findViewById(R.id.imageCorrect);
                         dialog.show();
                         new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                             @Override
                             public void run() {
                                 AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8462.this);
                                 AlertDialog alertDialog = builder.create();
                                 alertDialog.show();
                                 Intent intent = new Intent(Singletest8462.this,Singletest8481.class);
                                 startActivity(intent);
                                 finish();
                             }
                         },1000);

                     }
                     else{
                         Dialog dialog = new Dialog(Singletest8462.this);
                         dialog.setContentView(R.layout.activity_fail);
                         dialog.setTitle("오답");
                         dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                         ImageView vv = dialog.findViewById(R.id.imageFail);
                         dialog.show();
                         new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                             @Override
                             public void run() {
                                 AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8462.this);
                                 AlertDialog alertDialog = builder.create();
                                 alertDialog.show();
                                 Intent intent = new Intent(Singletest8462.this,Singletest8481.class);
                                 startActivity(intent);
                                 finish();
                             }
                         },1000);
                     }
                     break;

                 case R.id.textView42:

                     AlertDialog.Builder dlg = new AlertDialog.Builder(Singletest8462.this);
                     dlg.setTitle("정답을 체크하세요");
                     final String[] versionArray = new String[]{"밑", "윗", "못", "쌀",
                             "이"};
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

                     AlertDialog.Builder dlg2 = new AlertDialog.Builder(Singletest8462.this);
                     dlg2.setTitle("정답을 체크하세요");
                     final String[] versionArray2 = new String[]{"장", "쌀", "콩", "물",
                             "불"};
                     final boolean[] checkArray2 = new boolean[]{false, false, false, false, false};
                     dlg2.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg2.setMultiChoiceItems(versionArray2, checkArray2, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView43);
                             Text.setText(versionArray2[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {

                                     TextView Text = (TextView) findViewById(R.id.textView45);
                                     Text.setEnabled(false);


                                     if (checkArray2[0] && !checkArray2[1] && !checkArray2[2] &&
                                             !checkArray2[3] && !checkArray2[4]) {

                                            count2=1;
                                     }else{count2=0;}
                                 }
                             })
                             .show();

                     break;
                 case R.id.textView46:

                     AlertDialog.Builder dlg3 = new AlertDialog.Builder(Singletest8462.this);
                     dlg3.setTitle("정답을 체크하세요");
                     final String[] versionArray3 = new String[]{"잔반", "바람", "바늘", "토끼",
                             "겨울"};
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
                 case R.id.textView43:

                     AlertDialog.Builder dlg4 = new AlertDialog.Builder(Singletest8462.this);
                     dlg4.setTitle("정답을 체크하세요");
                     final String[] versionArray4 = new String[]{"개", "연", "실", "매",
                             "봄"};
                     final boolean[] checkArray4 = new boolean[]{false, false, false, false, false};
                     dlg4.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg4.setMultiChoiceItems(versionArray4, checkArray4, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView45);
                             Text.setText(versionArray4[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {


                                     TextView Text = (TextView) findViewById(R.id.textView45);
                                     Text.setEnabled(false);

                                     if (!checkArray4[0] && !checkArray4[1] && checkArray4[2] &&
                                             !checkArray4[3] && !checkArray4[4]) {

                                         count4=1;
                                     }else{count4=0;}
                                 }
                             })
                             .show();

                     break;
                 case R.id.textView51:

                     AlertDialog.Builder dlg5 = new AlertDialog.Builder(Singletest8462.this);
                     dlg5.setTitle("정답을 체크하세요");
                     final String[] versionArray5 = new String[]{"파", "해", "피", "자",
                             "초"};
                     final boolean[] checkArray5 = new boolean[]{false, false, false, false, false};
                     dlg5.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg5.setMultiChoiceItems(versionArray5, checkArray5, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView51);
                             Text.setText(versionArray5[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {

                                     TextView Text = (TextView) findViewById(R.id.textView51);
                                     Text.setEnabled(false);

                                     if (!checkArray5[0] && !checkArray5[1] && checkArray5[2] &&
                                             !checkArray5[3] && !checkArray5[4]) {

                                         count5=1;
                                     }else{count5=0;}
                                 }
                             })
                             .show();
                     break;

                 case R.id.textView53:

                     AlertDialog.Builder dlg6 = new AlertDialog.Builder(Singletest8462.this);
                     dlg6.setTitle("정답을 체크하세요");
                     final String[] versionArray6 = new String[]{"불", "달", "물", "말",
                             "시"};
                     final boolean[] checkArray6 = new boolean[]{false, false, false, false, false};
                     dlg6.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg6.setMultiChoiceItems(versionArray6, checkArray6, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView53);
                             Text.setText(versionArray6[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {

                                     TextView Text = (TextView) findViewById(R.id.textView53);
                                     Text.setEnabled(false);

                                     if (!checkArray6[0] && !checkArray6[1] && checkArray6[2] &&
                                             !checkArray6[3] && !checkArray6[4]) {

                                         count6=1;
                                     }else{count6=0;}

                                 }
                             })
                             .show();
                     break;

                 case R.id.textView56:

                     AlertDialog.Builder dlg7 = new AlertDialog.Builder(Singletest8462.this);
                     dlg7.setTitle("정답을 체크하세요");
                     final String[] versionArray7 = new String[]{"녹", "낙", "말", "벌",
                             "날"};
                     final boolean[] checkArray7 = new boolean[]{false, false, false, false, false};
                     dlg7.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg7.setMultiChoiceItems(versionArray7, checkArray7, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView56);
                             Text.setText(versionArray7[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {

                                     TextView Text = (TextView) findViewById(R.id.textView56);
                                     Text.setEnabled(false);

                                     if (!checkArray7[0] && checkArray7[1] && !checkArray7[2] &&
                                             !checkArray7[3] && !checkArray7[4]) {


                                         count7=1;
                                     }else{count7=0;}
                                 }

                             })
                             .show();
                     break;

                 case R.id.textView47:

                     AlertDialog.Builder dlg8 = new AlertDialog.Builder(Singletest8462.this);
                     dlg8.setTitle("정답을 체크하세요");
                     final String[] versionArray8 = new String[]{"두들겨", "다듬어", "보듬어", "문질러",
                            "헤아려"};
                     final boolean[] checkArray8 = new boolean[]{false, false, false, false, false};
                     dlg8.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     //dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener()
                     dlg8.setMultiChoiceItems(versionArray8, checkArray8, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                             //checkArray[i] = b;
                             TextView Text = (TextView) findViewById(R.id.textView47);
                             Text.setText(versionArray8[i]);
                         }
                     })
                             .setPositiveButton("닫기", null)
                             .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                                 @Override
                                 public void onClick(DialogInterface dialogInterface, int i) {

                                     TextView Text = (TextView) findViewById(R.id.textView47);
                                     Text.setEnabled(false);

                                     if (checkArray8[0] && !checkArray8[1] && !checkArray8[2] &&
                                             !checkArray8[3] && !checkArray8[4]) {

                                         count8=1;
                                     }else{count8=0;}
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
        Intent intent = new Intent(Singletest8462.this,Singletest8481.class);
        startActivity(intent);
    }
}

