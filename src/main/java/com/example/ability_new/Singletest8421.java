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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class Singletest8421 extends AppCompatActivity implements View.OnClickListener{
    ImageView circle1;
    int count1=0,count2=0,count3=0,count4=0,count5=0,t=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest8421);

    }


    public void onClick(View view)
    {
        TextView Text = (TextView) findViewById(R.id.t1);
        TextView Text2 = (TextView) findViewById(R.id.t2);
        TextView Text3 = (TextView) findViewById(R.id.t3);
        TextView Text4 = (TextView) findViewById(R.id.t4);
        TextView Text5 = (TextView) findViewById(R.id.t5);
        TextView Text6 = (TextView) findViewById(R.id.t7);
        TextView Text7 = (TextView) findViewById(R.id.t8);
        TextView Text8 = (TextView) findViewById(R.id.t9);
        TextView Text9 = (TextView) findViewById(R.id.t10);

     switch (view.getId()) {
          case R.id.t3:
                count1 = 1;
              Text3.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.t4:
                count2 = 1;
                Text4.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.t8:
                count3 = 1;
                Text7.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.t9:
                count5 = 1;
                Text8.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.t1:
                count5 = 1;
                Text.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.t2:
                count5 = 1;
                Text2.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.t5:
                count5 = 1;
                Text5.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.t7:
                count5 = 1;
                Text6.setBackgroundColor(Color.YELLOW);
                break;

            case R.id.t10:
                count5 = 1;
                Text9.setBackgroundColor(Color.YELLOW);
                break;

         case R.id.button30:
             t=1;
                break;

            default:
                break;
    }
    if(t==1)
    {
        if(count5==0) {
            if (count1 == 1 && count2 == 1 && count3 == 1) {

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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8421.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest8421.this,Singletest8421_2.class);
                        startActivity(intent);
                        finish();
                    }
                },1000);

            } else {
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_fail);
                dialog.setTitle("??????");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageFail);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8421.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest8421.this,Singletest8421_2.class);
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
            dialog.setTitle("??????");
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            ImageView vv = dialog.findViewById(R.id.imageFail);
            dialog.show();
            new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                @Override
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Singletest8421.this);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    Intent intent = new Intent(Singletest8421.this,Singletest8421_2.class);
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
        Intent intent = new Intent(Singletest8421.this,Singletest8421_2.class);
        startActivity(intent);
    }
}
