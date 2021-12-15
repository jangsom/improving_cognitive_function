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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;

public class Singletest7352 extends AppCompatActivity implements View.OnClickListener{

    private int count1 = 0, count2 = 0,count3=0,count4=0,count5=0,count6=0,count7=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest7352);

        // final Button button1 = (Button) findViewById(R.id.button65);
        //1 button1.setOnClickListener(new View.OnClickListener(){
    }//온클릭 안에넣으면 지워

         public void onClick(View view) {

             switch (view.getId()) {
                 case R.id.button65:

                     AlertDialog.Builder dlg = new AlertDialog.Builder(Singletest7352.this);
                     dlg.setTitle("해당하는 지역을 체크하세요");
                     final String[] versionArray = new String[]{"인천광역시", "대전광역시", "대구광역시", "광주광역시",
                             "울산광역시", "부산광역시", "제주도"};
                     final boolean[] checkArray = new boolean[]{false, false, false,false, false, false,false};
                     dlg.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                         }
                     });
//                버튼 클릭시 동작
                     dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                         public void onClick(DialogInterface dialog, int which) {
                             //토스트 메시지

                             if (checkArray[0] == false && checkArray[1] == false && checkArray[2] == false &&
                                     checkArray[3] == false && checkArray[4] == false && checkArray[5] == false &&
                                     checkArray[6] == true) {
                                 CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("7", new Date());
                                 Toast.makeText(Singletest7352.this, "정답입니다.", Toast.LENGTH_SHORT).show();
                                 new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                                     @Override
                                     public void run() {
                                         AlertDialog.Builder builder = new AlertDialog.Builder(Singletest7352.this);
                                         AlertDialog alertDialog = builder.create();
                                         alertDialog.show();
                                         Intent intent = new Intent(Singletest7352.this,Singletest7391.class);
                                         startActivity(intent);
                                         finish();
                                     }
                                 },1000);


                             } else {
                                 Toast.makeText(Singletest7352.this, "오답입니다.", Toast.LENGTH_SHORT).show();
                                 new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                                     @Override
                                     public void run() {
                                         AlertDialog.Builder builder = new AlertDialog.Builder(Singletest7352.this);
                                         AlertDialog alertDialog = builder.create();
                                         alertDialog.show();
                                         Intent intent = new Intent(Singletest7352.this,Singletest7391.class);
                                         startActivity(intent);
                                         finish();
                                     }
                                 },1000);
                             }

                         }
                     });
                     dlg.show();


                     break;

                 default:
                     break;
             }
         }
    //온ㄴ클릭안에넣으면 꺼내    });
   //1 }

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
        Intent intent = new Intent(Singletest7352.this,Singletest7391.class);
        startActivity(intent);
    }

}
