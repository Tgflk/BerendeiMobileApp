package com.example.bazaberendei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ActivityRegistr extends AppCompatActivity {

    private Button btn_register;

    private TextView log_txt;

    private ImageButton logoregistr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);

        btn_register = findViewById(R.id.btn_register);
        log_txt = findViewById(R.id.log_txt);
        logoregistr= findViewById(R.id.logoregistr);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityRegistr.this, ActivityLK.class);
                startActivity(intent);
            }
        });
        log_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityRegistr.this, ActivityLogin.class);
                startActivity(intent);
            }
        });
        logoregistr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityRegistr.this, ActivityMenu.class);
                startActivity(intent);
            }
        });
    }
}