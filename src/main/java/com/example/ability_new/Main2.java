package com.example.ability_new;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseError;


public class Main2 extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        // 화면을 portrait(세로) 화면으로 고정하고 싶은 경우

        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();
        setContentView(R.layout.activity_signcheck);
        //setToolbarTitle("로그인");
        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.loginButton).setOnClickListener(onClickListener);
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.loginButton:
                    login();
                    break;
            }
        }
    };

    private void login() {
        //String email = ((EditText) findViewById(R.id.loginEmail)).getText().toString();
        String email = ((EditText)findViewById(R.id.loginEmail)).getText().toString()+"@naver.com";
        String password = ((EditText) findViewById(R.id.loginPassword)).getText().toString();

        if (email.length() > 0 && password.length() > 0) {
            startToast("사용자 확인중입니다. 잠시만 기다려주십시오.");
            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            //loaderLayout.setVisibility(View.GONE);
                            Log.d("signin", "onComplete fired");
                            if (task.isSuccessful()) {
                                FirebaseUser user = mAuth.getCurrentUser();
                                startToast("사용자 확인에 성공하였습니다.");
                                startToast("데이터를 불러오는 중입니다...");
                                UserCorrects.setDataRetrivedCallback(new UserCorrects.CorrectLoadCallback() {
                                    @Override
                                    public void onLoadSuccess(UserCorrects corrects) {
                                        startToast("데이터를 불러왔습니다.");
                                        startMainActivity();
                                    }

                                    @Override
                                    public void onLoadFailed(DatabaseError error) {
                                        startToast("데이터를 불러오는중 에러가 발생했습니다.");
                                    }
                                });
                                CorrectDatabase.getInstance();
                            } else {
                                if (task.getException() != null) {
                                    startToast("이름과 비밀번호가 일치하지 않습니다.");
                                }
                            }
                        }
                    });
        } else {
            startToast("이름 또는 비밀번호를 입력해 주세요.");
        }
    }

    public void startMainActivity() {
        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }
    private void startToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        Intent intent = new Intent(Main2.this,SignUpActivity.class);
        startActivity(intent);
    }


    public void onClick2(View view) {
       // Intent intent = new Intent(MainActivity.this,Signcheck.class);
      //  startActivity(intent);
       //테스트 인텐트 연결
        Intent intent = new Intent(Main2.this,Multi15.class);
        startActivity(intent);

    }

}


