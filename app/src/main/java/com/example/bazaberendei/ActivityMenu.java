package com.example.bazaberendei;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityMenu extends AppCompatActivity {
    private Button btn_mainhome;
    private Button button_bitch;
    private Button button_besedka;
    private Button btn_mainbanya;
    private Button button_onas;
    private ImageButton btn_user_main1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_mainhome = findViewById(R.id.btn_mainhome);
        button_bitch = findViewById(R.id.button_bitch);
        button_besedka = findViewById(R.id.button_besedka);
        btn_mainbanya = findViewById(R.id.btn_mainbanya);
        button_onas = findViewById(R.id.button_onas);
        btn_user_main1 = findViewById(R.id.btn_user_main1);


        btn_mainhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ActivityHome.class);
                startActivity(intent);
            }
        });
        button_bitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ActivityBitch.class);
                startActivity(intent);
            }
        });
        button_besedka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ActivityBesedka.class);
                startActivity(intent);
            }
        });
        btn_mainbanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ActivityBany.class);
                startActivity(intent);
            }
        });
        button_onas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ActivityInfa.class);
                startActivity(intent);
            }
        });
        btn_user_main1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ActivityRegistr.class);
                startActivity(intent);
            }
        });
    }
}