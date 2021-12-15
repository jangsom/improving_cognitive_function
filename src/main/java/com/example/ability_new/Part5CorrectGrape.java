package com.example.ability_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.LineData;

import java.util.Date;

public class Part5CorrectGrape extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part5_correct_grape);
        int num = CorrectDatabase.getInstance().Corrects.GetCorrectCount("5", new Date());
        TextView textView = (TextView)findViewById(R.id.textView1);
        textView.setText(num + "");
        textView.setTextSize(90);
    }

    public void onClick1(View view) {
        Intent intent = new Intent(Part5CorrectGrape.this,Questionsingle.class);
        startActivity(intent);
        finish();
    }

    public void onClick2(View view) {
        Intent intent = new Intent(Part5CorrectGrape.this,Singletest6281.class);
        startActivity(intent);
        finish();
    }
}