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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Date;

public class Singletest3174 extends AppCompatActivity {

    int count1=0,count2=0,count3=0,count4=0,c=0,f=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest3174);
    }

    public void onClick (View view){
        ImageButton button2 = (ImageButton)findViewById(R.id.imageButton6);
        ImageButton button4 = (ImageButton)findViewById(R.id.imageButton8);
        ImageButton button6 = (ImageButton)findViewById(R.id.imageButton10);
        ImageButton button8 = (ImageButton)findViewById(R.id.imageButton12);
        ImageButton button10 = (ImageButton)findViewById(R.id.imageButton14);
        ImageButton button12 = (ImageButton)findViewById(R.id.imageButton16);
        ImageButton button14 = (ImageButton)findViewById(R.id.imageButton18);
        ImageButton button16 = (ImageButton)findViewById(R.id.imageButton20);

        switch (view.getId()) {
            case R.id.button23:
                c = 1;
                break;

            case R.id.imageButton6:
                f = 1;
                button2.setVisibility(View.INVISIBLE);
                break;

            case R.id.imageButton8:
                f = 1;
                button4.setVisibility(View.INVISIBLE);
                break;

            case R.id.imageButton10:
                count1 = 1;
                button6.setVisibility(View.INVISIBLE);
                break;

            case R.id.imageButton12:
                count2 = 1;
                button8.setVisibility(View.INVISIBLE);
                break;

            case R.id.imageButton14:
                count3 = 1;
                button10.setVisibility(View.INVISIBLE);
                break;

            case R.id.imageButton16:
                count4 = 1;
                button12.setVisibility(View.INVISIBLE);
                break;

            case R.id.imageButton18:
                f = 1;
                button14.setVisibility(View.INVISIBLE);
                break;

            case R.id.imageButton20:
                f = 1;
                button16.setVisibility(View.INVISIBLE);
                break;

            default:
                break;

        }
        if(c==1) {
            if(f==0){
                if (count1 == 1 && count2 == 1 && count3 == 1 && count4 == 1) {
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
                            AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3174.this);
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                            Intent intent = new Intent(Singletest3174.this, Part3CorrectGrape.class);
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
                            AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3174.this);
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                            Intent intent = new Intent(Singletest3174.this, Part3CorrectGrape.class);
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3174.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest3174.this, Part3CorrectGrape.class);
                        startActivity(intent);
                        finish();
                    }
                },1000);
            }
        }
    }
    public void onClicknext(View view){
        Intent intent = new Intent(Singletest3174.this,Part3CorrectGrape.class);
        startActivity(intent);
        finish();
    }

    public void onClick2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("알림").setMessage("모든 활동을 종료하고 돌아가시겠습니까?");

        builder.setPositiveButton("예", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Intent intent = new Intent(Singletest3174.this,Questionsingle.class);
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
}