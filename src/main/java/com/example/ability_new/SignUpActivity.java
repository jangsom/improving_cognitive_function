package com.example.ability_new;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import com.example.ability_new.R;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
//import static com.example.ability_new.Util.showToast;

public class SignUpActivity extends AppCompatActivity {

    private static final String TAG = "SignUpActivity";
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.signUpButton).setOnClickListener(onClickListener);

        //Drawable alpha = ((ImageView)findViewById(R.id.imageView49)).getDrawable();
        //alpha.setAlpha(170);//뒤로가기 버튼 투명도 설정 불투명 max250임

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
                case R.id.signUpButton:
                    signUp();
                    //Intent intent = new Intent(SignUpActivity.this,MainActivity.class);
                    //startActivity(intent);
                    break;
            }
        }
    };

    private void signUp(){
        //String email = ((EditText)findViewById(R.id.emailEditText)).getText().toString();
        String email = ((EditText)findViewById(R.id.emailEditText)).getText().toString()+"@naver.com";
        String password = ((EditText)findViewById(R.id.passwordEditText)).getText().toString();
        String passwordCheck = ((EditText)findViewById(R.id.passwordCheckEditText)).getText().toString();

        if(email.length() > 0 && password.length() > 0 && passwordCheck.length() > 0) {
            if(password.equals(passwordCheck)){
            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                FirebaseUser user = mAuth.getCurrentUser();
                                startToast("사용자 생성 성공");
                                startMainActivity();
                            } else {
                                if (task.getException() != null) {
                                    startToast(task.getException().toString());
                                }
                            }
                        }
                    });
        }else{
                startToast("비밀번호가 일치하지 않습니다");
            }
    }else {
            startToast("이름 또는 비밀번호를 입력해 주세요");
        }
    }
    private void startToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    public void startMainActivity() {
        Intent intent = new Intent(this,Main2.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
        //뒤로가기
        Intent intent = new Intent(SignUpActivity.this,Main2.class);
        startActivity(intent);

    }
}
