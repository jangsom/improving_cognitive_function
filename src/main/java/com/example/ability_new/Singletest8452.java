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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class Singletest8452 extends AppCompatActivity implements View.OnClickListener{

    private int count1 = 0, count2 = 0,count3=0,count4=0,count5=0,count6=0,count7=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest8452);

    }//온클릭 안에넣으면 지워

         public void onClick(View view) {

             switch (view.getId()) {
                 case R.id.button65:

                     AlertDialog.Builder dlg = new AlertDialog.Builder(Singletest8452.this);
                     dlg.setTitle("해당하는 물건을 체크하세요");
                     final String[] versionArray = new String[]{"라켓", "실", "칫솔", "바늘",
                             "망치", "비누", "수건","배드민턴 공","드라이버"};
                     final boolean[] checkArray = new boolean[]{false, false, false,false, false, false,false,false,false};
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

                             if (checkArray[0] == true && checkArray[1] == false && checkArray[2] == false &&
                                     checkArray[3] == false && checkArray[4] == false && checkArray[5] == false &&
                                     checkArray[6] == false && checkArray[7] == true && checkArray[8] == false) {

                                 CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("8", new Date());
                                 Dialog dialog5 = new Dialog(Singletest8452.this);
                                 dialog5.setContentView(R.layout.activity_correct);
                                 dialog5.setTitle("정답");
                                 dialog5.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                 ImageView vv = dialog5.findViewById(R.id.imageCorrect);
                                 dialog5.show();
                                 new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                                     @Override
                                     public void run() {
                                         AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8452.this);
                                         AlertDialog alertDialog = builder.create();
                                         alertDialog.show();
                                         Intent intent = new Intent(Singletest8452.this, Singletest8461.class);
                                         startActivity(intent);
                                         finish();
                                     }
                                 },1000);

                             } else {
                                 Dialog dialog5 = new Dialog(Singletest8452.this);
                                 dialog5.setContentView(R.layout.activity_fail);
                                 dialog5.setTitle("오답");
                                 dialog5.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                 ImageView vv = dialog5.findViewById(R.id.imageCorrect);
                                 dialog5.show();
                                 new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                                     @Override
                                     public void run() {
                                         AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8452.this);
                                         AlertDialog alertDialog = builder.create();
                                         alertDialog.show();
                                         Intent intent = new Intent(Singletest8452.this, Singletest8461.class);
                                         startActivity(intent);
                                         finish();
                                     }
                                 },1000);
                             }
                         }
                     });
                     dlg.show();


                     break;
                 /*case R.id.button66:

                     AlertDialog.Builder dlg2 = new AlertDialog.Builder(Singletest8452.this);
                     dlg2.setTitle("해당하는 물건을 체크하세요");
                     final String[] versionArray2 = new String[]{"라켓", "실", "칫솔", "바늘",
                             "망치", "비누", "수건","배드민턴 공","드라이버"};
                     final boolean[] checkArray2 = new boolean[]{false, false, false,false, false, false,false,false,false};
                     dlg2.setIcon(R.drawable.correct);//아이콘넣어주는거 없어도무방

                     dlg2.setMultiChoiceItems(versionArray2, checkArray2, new DialogInterface.OnMultiChoiceClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                         }
                     });
//                버튼 클릭시 동작

                     dlg2.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                         public void onClick(DialogInterface dialog, int which) {

                             if (checkArray2[0] == false && checkArray2[1] == true && checkArray2[2] == false &&
                                     checkArray2[3] == true && checkArray2[4] == false && checkArray2[5] == false &&
                                     checkArray2[6] == false&&checkArray2[7] == false&& checkArray2[8] == false) {
                                 CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("8", new Date());
                                 Dialog dialog5 = new Dialog(Singletest8452.this);
                                 dialog5.setContentView(R.layout.activity_correct);
                                 dialog5.setTitle("정답");
                                 dialog5.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                 ImageView vv = dialog5.findViewById(R.id.imageCorrect);
                                 dialog5.show();
                                 Intent intent = new Intent(Singletest8452.this,MainActivity.class);
                                 startActivity(intent);
                             }
                             else {
                                 Toast.makeText(Singletest8452.this, "오답입니다.", Toast.LENGTH_SHORT).show();
                             }

                         }
                     });
                     dlg2.show();
                     break;*/

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
        Intent intent = new Intent(Singletest8452.this,Singletest8461.class);
        startActivity(intent);
    }
}
