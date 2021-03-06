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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Date;

public class Singletest8443 extends AppCompatActivity {
    Spinner spinner;
    int number=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest8443);
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

        if(num == 12&&num2==25&&number==0)
        {
            CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("8", new Date());
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.activity_correct);
            dialog.setTitle("??????");
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            ImageView vv = dialog.findViewById(R.id.imageCorrect);
            dialog.show();
            new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                @Override
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8443.this);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    Intent intent = new Intent(Singletest8443.this,Singletest8451.class);
                    startActivity(intent);
                    finish();
                }
            },1000);

        }
        else
        {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.activity_fail);
            dialog.setTitle("??????");
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            ImageView vv = dialog.findViewById(R.id.imageCorrect);
            dialog.show();
            new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                @Override
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8443.this);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    Intent intent = new Intent(Singletest8443.this,Singletest8451.class);
                    startActivity(intent);
                    finish();
                }
            },1000);
        }
    }

    public void onClick2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("??????").setMessage("?????? ????????? ???????????? ?????????????????????????");

        builder.setPositiveButton("???", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Intent intent = new Intent(getApplicationContext(),Questionsingle.class);
                startActivity(intent);//??????
            }
        });

        builder.setNegativeButton("?????????", new DialogInterface.OnClickListener(){
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
        Intent intent = new Intent(Singletest8443.this,Singletest8451.class);
        startActivity(intent);
    }
}