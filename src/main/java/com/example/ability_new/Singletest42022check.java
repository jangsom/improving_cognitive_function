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

public class Singletest42022check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest42022check);
    }
    public void onClick(View view)
    {
        EditText editText = (EditText)findViewById(R.id.editTextNumber);
        EditText editText3 = (EditText)findViewById(R.id.editTextNumber3);
        EditText editText5 = (EditText)findViewById(R.id.editTextNumber5);
        EditText editText7 = (EditText)findViewById(R.id.editTextNumber7);
        EditText editText9 = (EditText)findViewById(R.id.editTextNumber9);

        String getEdit = editText.getText().toString();
        String getEdit2 = editText3.getText().toString();
        String getEdit3 = editText5.getText().toString();
        String getEdit4 = editText7.getText().toString();
        String getEdit5 = editText9.getText().toString();

        if(TextUtils.isEmpty(getEdit))
        {
            Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();

        }

        else
        {
            int num = Integer.parseInt(editText.getText().toString());
            int num3 = Integer.parseInt(editText3.getText().toString());
            int num5 = Integer.parseInt(editText5.getText().toString());
            int num7 = Integer.parseInt(editText7.getText().toString());
            int num9 = Integer.parseInt(editText9.getText().toString());
            if(num == 9 &&num3 == 1 &&num5 == 4 &&num7 == 1 &&num9 == 4)
            {
                CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("4", new Date());
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_correct);
                dialog.setTitle("정답");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageCorrect);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest42022check.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest42022check.this,Part4CorrectGrape.class);
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest42022check.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest42022check.this,Part4CorrectGrape.class);
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
        Intent intent = new Intent(Singletest42022check.this,Part4CorrectGrape.class);
        startActivity(intent);
    }
}