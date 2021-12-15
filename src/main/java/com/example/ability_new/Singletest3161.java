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
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Date;

public class Singletest3161 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest3161);
    }
    public void onClick(View view) {

        EditText editText2 = (EditText)findViewById(R.id.editTextNumber2);
        String getEdit = editText2.getText().toString();
        EditText editText4 = (EditText)findViewById(R.id.editTextNumber4);
        String getEdit2 = editText4.getText().toString();
        EditText editText6 = (EditText)findViewById(R.id.editTextNumber6);
        String getEdit3 = editText6.getText().toString();
        EditText editText8 = (EditText)findViewById(R.id.editTextNumber8);
        String getEdit4 = editText8.getText().toString();
        EditText editText10 = (EditText)findViewById(R.id.editTextNumber10);
        String getEdit5 = editText10.getText().toString();
        EditText editText13 = (EditText)findViewById(R.id.editTextNumber13);
        String getEdit6 = editText13.getText().toString();
        EditText editText14 = (EditText)findViewById(R.id.editTextNumber14);
        String getEdit7 = editText14.getText().toString();
        EditText editText16 = (EditText)findViewById(R.id.editTextNumber16);
        String getEdit8 = editText16.getText().toString();
        EditText editText17 = (EditText)findViewById(R.id.editTextNumber17);
        String getEdit9 = editText17.getText().toString();
        EditText editText19 = (EditText)findViewById(R.id.editTextNumber19);
        String getEdit10 = editText19.getText().toString();
        EditText editText20 = (EditText)findViewById(R.id.editTextNumber20);
        String getEdit11 = editText20.getText().toString();
        EditText editText22 = (EditText)findViewById(R.id.editTextNumber22);
        String getEdit12 = editText22.getText().toString();
        EditText editText23 = (EditText)findViewById(R.id.editTextNumber23);
        String getEdit13 = editText23.getText().toString();
        EditText editText25 = (EditText)findViewById(R.id.editTextNumber25);
        String getEdit14 = editText25.getText().toString();
        EditText editText26 = (EditText)findViewById(R.id.editTextNumber26);
        String getEdit15 = editText26.getText().toString();
        EditText editText27 = (EditText)findViewById(R.id.editTextNumber27);
        String getEdit16 = editText27.getText().toString();
        EditText editText28 = (EditText)findViewById(R.id.editTextNumber28);
        String getEdit17 = editText28.getText().toString();
        EditText editText29 = (EditText)findViewById(R.id.editTextNumber29);
        String getEdit18 = editText29.getText().toString();

        if(TextUtils.isEmpty(getEdit)&&TextUtils.isEmpty(getEdit2)&&
                TextUtils.isEmpty(getEdit3)&&TextUtils.isEmpty(getEdit4)&&TextUtils.isEmpty(getEdit5)
                &&TextUtils.isEmpty(getEdit6)&&TextUtils.isEmpty(getEdit7)&&TextUtils.isEmpty(getEdit8)
                &&TextUtils.isEmpty(getEdit9)&&TextUtils.isEmpty(getEdit10)&&TextUtils.isEmpty(getEdit11)
                &&TextUtils.isEmpty(getEdit12)&&TextUtils.isEmpty(getEdit13)&&TextUtils.isEmpty(getEdit14)
                &&TextUtils.isEmpty(getEdit15)&&TextUtils.isEmpty(getEdit16)&&TextUtils.isEmpty(getEdit17)
                &&TextUtils.isEmpty(getEdit18))
        {
            Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();

        }
        else{
            int num2 = Integer.parseInt(editText2.getText().toString());
            int num4 = Integer.parseInt(editText4.getText().toString());
            int num6 = Integer.parseInt(editText6.getText().toString());
            int num8 = Integer.parseInt(editText8.getText().toString());
            int num10 = Integer.parseInt(editText10.getText().toString());
            int num13 = Integer.parseInt(editText13.getText().toString());
            int num14 = Integer.parseInt(editText14.getText().toString());
            int num16 = Integer.parseInt(editText16.getText().toString());
            int num17 = Integer.parseInt(editText17.getText().toString());
            int num19 = Integer.parseInt(editText19.getText().toString());
            int num20 = Integer.parseInt(editText20.getText().toString());
            int num22 = Integer.parseInt(editText22.getText().toString());
            int num23 = Integer.parseInt(editText23.getText().toString());
            int num25 = Integer.parseInt(editText25.getText().toString());
            int num26 = Integer.parseInt(editText26.getText().toString());
            int num27 = Integer.parseInt(editText27.getText().toString());
            int num28 = Integer.parseInt(editText28.getText().toString());
            int num29 = Integer.parseInt(editText29.getText().toString());

            if(num2==2&&num4==4&&num6==6&&num8==8&&num10==10&&
                    num13==13&&num14==14&&num16==16&&num17==17&&num19==19&&
                    num20==20&&num22==22&&num23==23&&num25==25&&
                    num26==26&&num27==27&&num28==28&&num29==29)
            {
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3161.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest3161.this,Singletest3162.class);
                        startActivity(intent);
                        finish();
                    }
                },1000);
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3161.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest3161.this,Singletest3162.class);
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
                Intent intent = new Intent(Singletest3161.this,Questionsingle.class);
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
        Intent intent = new Intent(Singletest3161.this,Singletest3162.class);
        startActivity(intent);
    }
}