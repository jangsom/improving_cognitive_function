package com.example.ability_new;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

@IgnoreExtraProperties
public class UserCorrects implements ChildEventListener {
    public interface CorrectLoadCallback {
        void onLoadSuccess(UserCorrects corrects);
        void onLoadFailed(DatabaseError error);
    }
    public String UID = "";

    public boolean DataRetrieved = false;
    public static final String STR_DATE_FORMAT = "yyyy-MM-dd";
    public static final String STR_DISP_DATE_FORMAT = "MM-dd";
    public static final SimpleDateFormat FORMAT_DATE = new SimpleDateFormat(STR_DATE_FORMAT);
    public static final SimpleDateFormat FORMAT_DISP_DATE = new SimpleDateFormat(STR_DISP_DATE_FORMAT);
    public HashMap<String, HashMap<String, Integer>> Parts = new HashMap<>();
    private static CorrectLoadCallback DataRetrivedCallback = null;

    public static void setDataRetrivedCallback(CorrectLoadCallback cb) {
        DataRetrivedCallback = cb;
    }
    private static UserCorrects instance = null;
    public static UserCorrects getInstance() {
        if(instance == null) instance = new UserCorrects();
        else if(!instance.UID.equals(FirebaseAuth.getInstance().getCurrentUser().getUid())) instance = new UserCorrects();
        return instance;
    }

    private UserCorrects() {
        Log.d("Firebase", "before parse");
        this.UID = FirebaseAuth.getInstance().getCurrentUser().getUid();
        this.RetrieveData();
    }

    public void RetrieveData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                CorrectDatabase.getInstance().reference.child(CorrectDatabase.getInstance().getCurrentUID()).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        Log.d("Firebase", "before parse");
                        ParseSnapshot(snapshot);
                        Log.d("Firebase", "Data retrieved from firebase");
                        DataRetrieved = true;
                        if(UserCorrects.DataRetrivedCallback != null) DataRetrivedCallback.onLoadSuccess(UserCorrects.getInstance());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Log.d("error", "Firebase error : " + error.getMessage());
                        if(UserCorrects.DataRetrivedCallback != null) DataRetrivedCallback.onLoadFailed(error);
                    }
                });
            }
        }).start();
    }

    public void waitForDataRetrieved() {
        //while(!this.DataRetrieved) { Thread.sleep(100); }
    }

    public int GetCorrectCount(String part, Date date) {
        this.waitForDataRetrieved();
        if(this.Parts.containsKey(part)) {
            Integer ret = this.Parts.get(part).get(FORMAT_DATE.format(date));
            if(ret != null) return ret;
        }
        return 0;
    }

    public int IncreaseCorrectCount(String part, Date date) {
        int count = this.GetCorrectCount(part, date) + 1;
        CorrectDatabase.getInstance().setValue(part, date, count);
        return count;
    }

    public void SetCorrectCount(String part, Date date, int value) {
        if(!this.Parts.containsKey(part) || this.Parts.get(part) == null) this.Parts.put(part, new HashMap<String, Integer>());
        this.Parts.get(part).put(FORMAT_DATE.format(date), value);
    }

    public void ParseSnapshot(DataSnapshot snapshot) {
        Iterator<DataSnapshot> iter = snapshot.getChildren().iterator();
        while (iter.hasNext()) {
            DataSnapshot data = iter.next();
            String part = data.getKey();
            HashMap<String, Integer> correct_data = this.Parts.containsKey(part) ? this.Parts.get(part) : this.Parts.put(part, new HashMap<String, Integer>());
            if (correct_data == null) {
                correct_data = this.Parts.put(part, new HashMap<String, Integer>());
            }
            Iterator<DataSnapshot> cd = data.child("correct_data").getChildren().iterator();
            while (cd.hasNext()) {
                DataSnapshot cdd = cd.next();
                Integer count = ((Long) cdd.getValue()).intValue();
                this.Parts.get(part).put(cdd.getKey(), count);
            }
        }
        DataRetrieved = true;
    }

    @Override
    public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
        this.ParseSnapshot(snapshot);
    }

    @Override
    public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
        this.ParseSnapshot(snapshot);
    }

    @Override
    public void onChildRemoved(@NonNull DataSnapshot snapshot) {

    }

    @Override
    public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {
        Log.d("error", "Firebase error : " + error.getMessage());
    }
}
