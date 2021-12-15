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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;


import androidx.appcompat.app.AppCompatActivity;



public class Singletest8442 extends AppCompatActivity {

    Spinner spinner;
    int number=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest8442);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter monthAdapter = ArrayAdapter.createFromResource(this,R.array.test, android.R.layout.simple_spinner_dropdown_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(monthAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getItemAtPosition(position);
                number = position;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }

    public void onClick(View view){
        EditText editText = (EditText)findViewById(R.id.editTextNumber);
        int num = Integer.parseInt(editText.getText().toString());
        EditText editText2 = (EditText)findViewById(R.id.editTextNumber2);
        int num2 = Integer.parseInt(editText2.getText().toString());

        if(num == 1&&num2==29&&number==1)
        {
            CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("8", new Date());
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.activity_correct);
            dialog.setTitle("정답");
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            ImageView vv = dialog.findViewById(R.id.imageCorrect);
            dialog.show();
            new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                @Override
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8442.this);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    Intent intent = new Intent(Singletest8442.this,Singletest8443.class);
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
            ImageView vv = dialog.findViewById(R.id.imageCorrect);
            dialog.show();
            new Handler().postDelayed(new Runnable() {  // 5초뒤에 AlertDialog 실행
                @Override
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8442.this);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    Intent intent = new Intent(Singletest8442.this,Singletest8443.class);
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
        Intent intent = new Intent(Singletest8442.this,Singletest8443.class);
        startActivity(intent);
    }

}
