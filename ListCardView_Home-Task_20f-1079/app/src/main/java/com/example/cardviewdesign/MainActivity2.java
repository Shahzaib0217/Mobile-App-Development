package com.example.cardviewdesign;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //EditText
        final EditText mEmail = findViewById(R.id.email);
        final EditText mPass = findViewById(R.id.pass);
        //Button
        Button mSaveBtn = findViewById(R.id.loginBtn);

        //button click listener
        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from edit text
                String email = mEmail.getText().toString();
                String pass = mPass.getText().toString();
                String email1="sk@gmail.com";
                String pass1="sk";
                //activity intent
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                if ( email.equals(email1) &&  pass.equals(pass1)){
                    startActivity(intent);
                }
            }
        });
    }
}