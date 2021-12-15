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

public class Singletest3163 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletest3163);
    }
    public void onClick(View view){

        EditText editText2 = (EditText)findViewById(R.id.editTextNumber99);
        EditText editText4 = (EditText)findViewById(R.id.editTextNumber97);
        EditText editText6 = (EditText)findViewById(R.id.editTextNumber95);
        EditText editText8 = (EditText)findViewById(R.id.editTextNumber93);
        EditText editText10 = (EditText)findViewById(R.id.editTextNumber91);
        EditText editText13 = (EditText)findViewById(R.id.editTextNumber89);
        EditText editText14 = (EditText)findViewById(R.id.editTextNumber88);
        EditText editText16 = (EditText)findViewById(R.id.editTextNumber87);
        EditText editText19 = (EditText)findViewById(R.id.editTextNumber85);
        EditText editText20 = (EditText)findViewById(R.id.editTextNumber83);
        EditText editText22 = (EditText)findViewById(R.id.editTextNumber81);
        EditText editText23 = (EditText)findViewById(R.id.editTextNumber79);
        EditText editText25 = (EditText)findViewById(R.id.editTextNumber78);
        EditText editText26 = (EditText)findViewById(R.id.editTextNumber76);
        EditText editText27 = (EditText)findViewById(R.id.editTextNumber75);
        EditText editText28 = (EditText)findViewById(R.id.editTextNumber73);
        EditText editText29 = (EditText)findViewById(R.id.editTextNumber72);
        String getEdit = editText2.getText().toString();
        String getEdit2 = editText4.getText().toString();
        String getEdit3 = editText6.getText().toString();
        String getEdit4 = editText8.getText().toString();
        String getEdit5 = editText10.getText().toString();
        String getEdit6 = editText13.getText().toString();
        String getEdit7 = editText14.getText().toString();
        String getEdit8 = editText16.getText().toString();
        String getEdit9 = editText19.getText().toString();
        String getEdit10 = editText20.getText().toString();
        String getEdit11 = editText22.getText().toString();
        String getEdit12 = editText23.getText().toString();
        String getEdit13 = editText25.getText().toString();
        String getEdit14 = editText26.getText().toString();
        String getEdit15 = editText27.getText().toString();
        String getEdit16 = editText28.getText().toString();
        String getEdit17 = editText29.getText().toString();


        if(TextUtils.isEmpty(getEdit)&&TextUtils.isEmpty(getEdit2)&&
                TextUtils.isEmpty(getEdit3)&&TextUtils.isEmpty(getEdit4)&&TextUtils.isEmpty(getEdit5)
                &&TextUtils.isEmpty(getEdit6)&&TextUtils.isEmpty(getEdit7)&&TextUtils.isEmpty(getEdit8)
                &&TextUtils.isEmpty(getEdit9)&&TextUtils.isEmpty(getEdit10)&&TextUtils.isEmpty(getEdit11)
                &&TextUtils.isEmpty(getEdit12)&&TextUtils.isEmpty(getEdit13)&&TextUtils.isEmpty(getEdit14)
                &&TextUtils.isEmpty(getEdit15)&&TextUtils.isEmpty(getEdit16)&&TextUtils.isEmpty(getEdit17))
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
            int num19 = Integer.parseInt(editText19.getText().toString());
            int num20 = Integer.parseInt(editText20.getText().toString());
            int num22 = Integer.parseInt(editText22.getText().toString());
            int num23 = Integer.parseInt(editText23.getText().toString());
            int num25 = Integer.parseInt(editText25.getText().toString());
            int num26 = Integer.parseInt(editText26.getText().toString());
            int num27 = Integer.parseInt(editText27.getText().toString());
            int num28 = Integer.parseInt(editText28.getText().toString());
            int num29 = Integer.parseInt(editText29.getText().toString());

            if(num2==99&&num4==97&&num6==95&&num8==93&&num10==91&&
                    num13==89&&num14==88&&num16==87&&num19==85&&
                    num20==83&&num22==81&&num23==79&&num25==78&&
                    num26==76&&num27==75&&num28==73&&num29==72)
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3163.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest3163.this,Singletest3171.class);
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(Singletest3163.this);
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Intent intent = new Intent(Singletest3163.this,Singletest3171.class);
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
                Intent intent = new Intent(Singletest3163.this,Questionsingle.class);
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
        Intent intent = new Intent(Singletest3163.this,Singletest3171.class);
        startActivity(intent);
    }


}