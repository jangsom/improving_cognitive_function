package com.example.ability_new;

import android.util.Log;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.snapshot.Index;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


@IgnoreExtraProperties
public class CorrectDatabase {
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    public DatabaseReference reference = database.getReference("correct_list");
    public UserCorrects Corrects = UserCorrects.getInstance();

    private static CorrectDatabase _instance = null;
    public static CorrectDatabase getInstance() {
        if(_instance == null) _instance = new CorrectDatabase();
        else if(!_instance.Corrects.UID.equals(FirebaseAuth.getInstance().getCurrentUser().getUid())) _instance.Corrects = UserCorrects.getInstance();
        return _instance;
    }

    public static void IncreaseToday(String part) {
        getInstance().Corrects.IncreaseCorrectCount(part, new Date());
    }

    private CorrectDatabase() {
        this.reference.child(this.getCurrentUID()).addChildEventListener(this.Corrects);
    }

    public FirebaseUser getCurrentUser() {
        return mAuth.getCurrentUser();
    }
    public String getCurrentUID() {
        return getCurrentUser().getUid();
    }
    public void setValue(String part, Date date, int value) {
        this.Corrects.SetCorrectCount(part, date, value);
        this.reference.child(this.getCurrentUID()).child(part).child("correct_data").child(UserCorrects.FORMAT_DATE.format(date)).setValue(value);
    }

    public BarData getBarData(BarChart chart, String part, int days, float font_size) {
        if(!this.Corrects.Parts.containsKey(part)) return null;
        HashMap<String, Integer> part_got = this.Corrects.Parts.get(part);
        if(part_got == null) return null;

        ArrayList<BarEntry> entries = new ArrayList<>();
        List<String> keyList = new ArrayList<>(part_got.keySet());
        ArrayList<String> xAxisLabelList = new ArrayList<>();

        Collections.sort(keyList);
        int ksize = keyList.size();
        int off = ksize < days ? 0 : ksize - days;
        for(int i = off; i < ksize && i >= 0; ++i) {
            String datestr = keyList.get(i);
            try {
                Date date = UserCorrects.FORMAT_DATE.parse(datestr);
                long epoch = date.getTime();
                entries.add(new BarEntry(i - off, part_got.get(datestr)));
                xAxisLabelList.add(UserCorrects.FORMAT_DISP_DATE.format(date));
            }
            catch (ParseException e) { }
        }

        BarDataSet dataset = new BarDataSet(entries, "");
        dataset.setValueFormatter(new IValueFormatter() {
            @Override
            public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
                //String datestr = UserCorrects.FORMAT_DATE.format(new Date((long)entry.getX()));
                return Math.round(value) + "개";
            }
        });
        dataset.setValueTextSize(font_size);

        BarData data = new BarData(dataset);
        chart.getXAxis().setGranularity(1f);
        chart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(xAxisLabelList));
        IAxisValueFormatter yfor = new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return Math.round(value) + "개";
            }
        };
        chart.getAxisLeft().setGranularity(1f);
        chart.getAxisLeft().setValueFormatter(yfor);
        chart.getAxisRight().setGranularity(1f);
        chart.getAxisRight().setValueFormatter(yfor);
        return data;
    }

    public BarData SetLineDataOfLineChart(BarChart chart, String part, int days, float font_size) {
        if(!this.Corrects.Parts.containsKey(part)) return new BarData();
        HashMap<String, Integer> part_got = this.Corrects.Parts.get(part);
        if(part_got == null) return new BarData();

        ArrayList<BarEntry> entries = new ArrayList<>();
        final List<String> keyList = new ArrayList<>(part_got.keySet());

        Collections.sort(keyList);
        int ksize = keyList.size();
        for(int i = ksize < days ? 0 : ksize - days; i < ksize && i >= 0; ++i) {
            String datestr = keyList.get(i);
            try {
                Date date = UserCorrects.FORMAT_DATE.parse(datestr);
                long epoch = date.getTime();
                entries.add(new BarEntry(epoch, part_got.get(datestr)));
            }
            catch (ParseException e) { }
        }

        //LineDataSet dataset = new LineDataSet(entries, "");
        BarDataSet dataset = new BarDataSet(entries, "");
        //chart.value
        dataset.setValueFormatter(new IValueFormatter() {
            @Override
            public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
                //String datestr = UserCorrects.FORMAT_DATE.format(new Date((long)entry.getX()));
                return ((int)value) + "개";
            }
        });
        dataset.setValueTextSize(font_size);

        BarData data = new BarData(dataset);

        XAxis xAxis = chart.getXAxis();
        //xAxis.setDrawAxisLine(true);
        //xAxis.setDrawGridLines(true);
        //xAxis.setDrawLimitLinesBehindData(true);
        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                Date reverted_date = new Date((long)value);
                String t  =UserCorrects.FORMAT_DATE.format(reverted_date);
                long test = reverted_date.getTime();
                Log.d("date", value + "," + UserCorrects.FORMAT_DATE.format(reverted_date) + " : " + test);
                return (keyList.contains(t)) ? UserCorrects.FORMAT_DISP_DATE.format(reverted_date) : "";
            }
        });
        chart.setData(data);

        return data;
    }
}
