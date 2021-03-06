package com.example.ability_new;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.Date;

public class Singletest7392 extends AppCompatActivity  implements View.OnClickListener{

    int count1=0,count2=0,c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest7392);

    }


    public void onClick(View view)
    {
        ImageButton bi1 = (ImageButton) findViewById(R.id.imageButton21);
        ImageButton bi2 = (ImageButton) findViewById(R.id.imageButton22);
        ImageButton bi3 = (ImageButton) findViewById(R.id.imageButton23);
        Button b1 = (Button) findViewById(R.id.button36);
        Button b2 = (Button) findViewById(R.id.button37);
        Button b3 = (Button) findViewById(R.id.button38);

        switch (view.getId()) {
            case R.id.button30:
                c=1;

                break;

            case R.id.imageButton21:
                bi1.setColorFilter(Color.parseColor("#FFFC52"), PorterDuff.Mode.MULTIPLY);
                bi2.setColorFilter(null);
                bi3.setColorFilter(null);
                count1 = 0;
                break;
            case R.id.imageButton22:
                bi2.setColorFilter(Color.parseColor("#FFFC52"), PorterDuff.Mode.MULTIPLY);
                bi1.setColorFilter(null);
                bi3.setColorFilter(null);
                count1 = 0;
                break;
            case R.id.imageButton23:
                bi3.setColorFilter(Color.parseColor("#FFFC52"), PorterDuff.Mode.MULTIPLY);
                bi2.setColorFilter(null);
                bi1.setColorFilter(null);
                count1 = 1;
                break;

            case R.id.button36:
                count2 = 0;
                //b1.setBackgroundColor(Color.parseColor("#FFFC52"));
                b1.setBackground(ContextCompat.getDrawable(this,R.drawable.textedgeco));
                b2.setBackground(ContextCompat.getDrawable(this,R.drawable.textedge));
                //b2.setBackgroundDrawable(ContextCompat.getDrawable(Context, R.drawable.Drawable??????));
                b3.setBackground(ContextCompat.getDrawable(this,R.drawable.textedge));
                break;

            case R.id.button37:
                count2 = 1;
                b2.setBackground(ContextCompat.getDrawable(this,R.drawable.textedgeco));
                b1.setBackground(ContextCompat.getDrawable(this,R.drawable.textedge));
                b3.setBackground(ContextCompat.getDrawable(this,R.drawable.textedge));
                break;

            case R.id.button38:
                count2 = 0;
                b3.setBackground(ContextCompat.getDrawable(this,R.drawable.textedgeco));
                b1.setBackground(ContextCompat.getDrawable(this,R.drawable.textedge));
                b2.setBackground(ContextCompat.getDrawable(this,R.drawable.textedge));
                break;

            default:
                break;
        }
        if(c==1) {
            if (count1 == 1 && count2 == 1) {
                CorrectDatabase.getInstance().Corrects.IncreaseCorrectCount("7", new Date());
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_correct);
                dialog.setTitle("??????");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageCorrect);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest7392.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest7392.this, Singletest7401.class);
                        startActivity(intent);
                        finish();
                    }
                },1000);

            }
            else {
                Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.activity_fail);
                dialog.setTitle("??????");
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView vv = dialog.findViewById(R.id.imageFail);
                dialog.show();
                new Handler().postDelayed(new Runnable() {  // 5????????? AlertDialog ??????
                    @Override
                    public void run() {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest7392.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest7392.this, Singletest7401.class);
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
        Intent intent = new Intent(Singletest7392.this,Singletest7401.class);
        startActivity(intent);
    }
}