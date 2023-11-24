package com.example.bazaberendei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityBesedka extends AppCompatActivity {

    private ImageButton logobesedka;
    private ImageButton ib_userbesedka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_besedka);

        logobesedka = findViewById(R.id.logobesedka);
        ib_userbesedka = findViewById(R.id.ib_userbesedka);

        logobesedka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityBesedka.this, ActivityMenu.class);
                startActivity(intent);
            }
        });

        ib_userbesedka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityBesedka.this, ActivityCabBron.class);
                startActivity(intent);
            }
        });
    }
}