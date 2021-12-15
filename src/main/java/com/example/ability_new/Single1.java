package com.example.ability_new;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Date;


public class Single1 extends AppCompatActivity {


    private ImageButton btn_end;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single1);
    }

    public void onClick14(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_fail);
        dialog.setTitle("오답");
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView vv = dialog.findViewById(R.id.imageFail);
        dialog.show();
        new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
            @Override
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(Single1.this);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                Intent intent = new Intent(Single1.this,Singletest151.class);
                startActivity(intent);
                finish();
            }
        },1000);

    }

    public void onClick13(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_fail);
        dialog.setTitle("오답");
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView vv = dialog.findViewById(R.id.imageFail);
        dialog.show();new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
            @Override
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(Single1.this);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                Intent intent = new Intent(Single1.this,Singletest151.class);
                startActivity(intent);
                finish();
            }
        },1000);
    }

    public void onClick12(View view) {
        CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("1", new Date());
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_correct);
        dialog.setTitle("정답");
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView vv = dialog.findViewById(R.id.imageCorrect);
        dialog.show();new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
            @Override
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(Single1.this);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                Intent intent = new Intent(Single1.this,Singletest151.class);
                startActivity(intent);
                finish();
            }
        },1000);
    }

    public void onClick11(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_fail);
        dialog.setTitle("오답");
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //TextView v = dialog.findViewById(R.id.tv_progress_message2);
        ImageView vv = dialog.findViewById(R.id.imageFail);
        dialog.show();new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
            @Override
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(Single1.this);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                Intent intent = new Intent(Single1.this,Singletest151.class);
                startActivity(intent);
                finish();
            }
        },1000);
    }

    public void onClick2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("알림").setMessage("모든 활동을 종료하고 돌아가시겠습니까?");

        builder.setPositiveButton("예", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Intent intent = new Intent(Single1.this,Questionsingle.class);
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
        Intent intent = new Intent(Single1.this,Singletest151.class);
        startActivity(intent);
    }



}