package com.example.bazaberendei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityLK extends AppCompatActivity {

    private ImageButton logolk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lk);

        logolk = findViewById(R.id.logolk);

        logolk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLK.this, ActivityMenu.class);
                startActivity(intent);
            }
        });
    }
}