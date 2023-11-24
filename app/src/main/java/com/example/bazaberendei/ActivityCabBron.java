package com.example.bazaberendei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityCabBron extends AppCompatActivity {

    private ImageButton logocab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cab_bron);

        logocab = findViewById(R.id.logocab);

        logocab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCabBron.this, ActivityMenu.class);
                startActivity(intent);
            }
        });
    }
}