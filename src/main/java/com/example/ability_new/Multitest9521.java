package com.example.ability_new;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class Multitest9521 extends AppCompatActivity {
    Button red, blue,green, yellow,black;
    View.OnClickListener cl;
    LinearLayout ll;
    private int color = 0xFFD50000;
    //int width = 2;
    private Paint p = new Paint();
    private Path path  = new Path();

    class Point{
        float x,y;
        boolean check;
        int color;
        public Point(float x,float y,boolean check,int color)
        {
            this.x=x;
            this.y=y;
            this.check=check;
            this.color=color;
        }
    }
    class MyView extends View {
        ArrayList<Multitest9521.Point> points = new ArrayList<Multitest9521.Point>();

        public MyView(Context c){
            super(c);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawPath(path, p); // 저장된 path 를 그려라
            p.setColor(color);
            p.setStyle(Paint.Style.STROKE);
            p.setStrokeWidth(5); // 선 굵기 지정
            p.setAntiAlias(true); // 선 매끄럽게 하는건데 느려짐
            for(int i=1; i<points.size(); i++)
            {
                p.setColor(points.get(i).color);
                if(!points.get(i).check)
                    continue;
                canvas.drawLine(points.get(i-1).x,points.get(i-1).y,points.get(i).x,points.get(i).y,p);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            float x = event.getX();
            float y = event.getY();

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:

                    points.add(new Multitest9521.Point(x,y,false , color));

                    break;
                case MotionEvent.ACTION_UP:
                    break;

                case MotionEvent.ACTION_MOVE:
                    //path.lineTo(x, y);
                    points.add(new Multitest9521.Point(x,y,true , color));
                    break;

            }
            invalidate(); // 화면을 다시그려라

            return true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitest9521);

        Multitest9521.MyView mv;
        mv = new Multitest9521.MyView(this);
        ll = (LinearLayout) findViewById(R.id.pic);
        ll.addView(mv);

    }

    public void onClick(View view) {
        //Toast.makeText(getApplicationContext(),"버튼클릭",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Multitest9521.this,Multitest9521.class);
        startActivity(intent);
    }

    public void onClick1(View view) {
        Intent intent = new Intent(Multitest9521.this,Multitest9522.class);
        startActivity(intent);
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
}