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
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Date;

public class Singletest6282 extends AppCompatActivity implements View.OnClickListener{
    int count1=0;
    ImageView view1,circle5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest6282);
        view1 = (ImageView) findViewById(R.id.imageView9);

        //이미지 변환코드*/
        circle5 = (ImageView) findViewById(R.id.imageView16);
        circle5.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.imageView16:
                circle5.setImageResource(R.drawable.circle);
                count1 = 1;
                break;

            default:
                break;

        }
        if(count1==1){
            CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("6", new Date());
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.activity_correct);
            dialog.setTitle("정답");
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            ImageView vv = dialog.findViewById(R.id.imageCorrect);
            dialog.show();
            new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                @Override
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Singletest6282.this);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    Intent intent = new Intent(Singletest6282.this,Singletest6283.class);
                    startActivity(intent);
                    finish();
                }
            },1000);

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
        Intent intent = new Intent(Singletest6282.this,Singletest6283.class);
        startActivity(intent);
    }

}