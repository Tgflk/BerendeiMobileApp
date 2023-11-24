package com.example.bazaberendei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ActivityLogin extends AppCompatActivity {

    private Button btn_log;
    private TextView reg_txt;

    private ImageButton logologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_log = findViewById(R.id.btn_log);
        reg_txt = findViewById(R.id.reg_txt);
        logologin = findViewById(R.id.logologin);

        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLogin.this, ActivityLK.class);
                startActivity(intent);
            }
        });
        reg_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLogin.this, ActivityRegistr.class);
                startActivity(intent);
            }
        });
        logologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLogin.this, ActivityMenu.class);
                startActivity(intent);
            }
        });
    }
}