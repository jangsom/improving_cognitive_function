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

public class Singletest3162 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest3162);
    }
    public void onClick(View view) {
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        String value2 = editText2.getText().toString();

        EditText editText3 = (EditText)findViewById(R.id.editText3);
        String value3 = editText3.getText().toString();

        EditText editText4 = (EditText)findViewById(R.id.editText4);
        String value4 = editText4.getText().toString();

        EditText editText5 = (EditText)findViewById(R.id.editText5);
        String value5 = editText5.getText().toString();

        EditText editText6 = (EditText)findViewById(R.id.editText6);
        String value6 = editText6.getText().toString();

        EditText editText7 = (EditText)findViewById(R.id.editText7);
        String value7 = editText7.getText().toString();

        EditText editText8 = (EditText)findViewById(R.id.editText8);
        String value8 = editText8.getText().toString();

        EditText editText9 = (EditText)findViewById(R.id.editText9);
        String value9 = editText9.getText().toString();

        EditText editText10 = (EditText)findViewById(R.id.editText10);
        String value10 = editText10.getText().toString();

        EditText editText11 = (EditText)findViewById(R.id.editText11);
        String value11 = editText11.getText().toString();

        EditText editText12 = (EditText)findViewById(R.id.editText12);
        String value12 = editText12.getText().toString();

        EditText editText13 = (EditText)findViewById(R.id.editText13);
        String value13 = editText13.getText().toString();

        EditText editText14 = (EditText)findViewById(R.id.editText14);
        String value14 = editText14.getText().toString();

        EditText editText15 = (EditText)findViewById(R.id.editText15);
        String value15 = editText15.getText().toString();

        if(TextUtils.isEmpty(value2)&&TextUtils.isEmpty(value3)&&TextUtils.isEmpty(value4)&&TextUtils.isEmpty(value5)&&
                TextUtils.isEmpty(value6)&&TextUtils.isEmpty(value7)&&TextUtils.isEmpty(value8)&&TextUtils.isEmpty(value9)&&
                TextUtils.isEmpty(value10)&&TextUtils.isEmpty(value11)&&TextUtils.isEmpty(value12)&&TextUtils.isEmpty(value13)&&
                TextUtils.isEmpty(value14)&&TextUtils.isEmpty(value15))
        {
            Toast.makeText(getApplicationContext(), "?????? ???????????????.", Toast.LENGTH_SHORT).show();

        }
        else
        {
            if(value2.equals("???")&&value3.equals("???")&&value4.equals("???")&&
                    value5.equals("???")&&value6.equals("???")&&value7.equals("???")&&
                    value8.equals("???")&&value9.equals("???")&&value10.equals("???")&&
                    value11.equals("???")&&value12.equals("???")&&value13.equals("???")&&
                    value14.equals("???")&&value15.equals("???"))
            {
                //CorrectDatabase.IncreaseToday("3");
                CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("3", new Date());
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_correct);
                dialog.setTitle("??????");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageCorrect);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3162.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest3162.this,Singletest3163.class);
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
                ImageView vv = dialog.findViewById(R.id.imageFail);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3162.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest3162.this,Singletest3163.class);
                        startActivity(intent);
                        finish();
                    }
                },1000);
            }
        }

    }
    public void onClick2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("??????").setMessage("?????? ????????? ???????????? ?????????????????????????");

        builder.setPositiveButton("???", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Intent intent = new Intent(Singletest3162.this,Questionsingle.class);
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
        Intent intent = new Intent(Singletest3162.this,Singletest3163.class);
        startActivity(intent);
    }
}