package com.example.ability_new;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;

public class CheckGrape extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_grape);
        int days = 3;

        this.PrepareLineChart((BarChart)findViewById(R.id.chart_part1), "1", days);
        //this.PrepareLineChart((BarChart)findViewById(R.id.chart_part2), "2", days);
        this.PrepareLineChart((BarChart)findViewById(R.id.chart_part3), "3", days);
        this.PrepareLineChart((BarChart)findViewById(R.id.chart_part4), "4", days);
        this.PrepareLineChart((BarChart)findViewById(R.id.chart_part5), "5", days);
        this.PrepareLineChart((BarChart)findViewById(R.id.chart_part6), "6", days);
        this.PrepareLineChart((BarChart)findViewById(R.id.chart_part7), "7", days);
        this.PrepareLineChart((BarChart)findViewById(R.id.chart_part8), "8", days);
        this.PrepareLineChart((BarChart)findViewById(R.id.chart_part9), "9", days);
        this.PrepareLineChart((BarChart)findViewById(R.id.chart_part10), "10", days);

    }

    private void PrepareLineChart(BarChart chart, String part, int days) {
        chart.setNoDataText("점수 없음");
        chart.setNoDataTextColor(0xFF000000);
        Paint p = chart.getPaint(Chart.PAINT_INFO);
        if(p != null) p.setTextSize(72);

        CorrectDatabase db = CorrectDatabase.getInstance();
        BarData data = db.getBarData(chart, part, days, 20);
        if(data != null) {
            chart.setData(data);
            XAxis xAxis = chart.getXAxis();
            YAxis yLeft = chart.getAxisLeft();
            YAxis yRight = chart.getAxisRight();
            xAxis.setTextSize(20);
            yLeft.setTextSize(20);
            yRight.setTextSize(20);
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
            chart.getDescription().setEnabled(false);
            chart.getLegend().setEnabled(false);
            chart.setExtraBottomOffset(10);
        }
        chart.animateY(3000);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(CheckGrape.this,home.class);
        startActivity(intent);//통계연결로 바꿔야함
    }
}
