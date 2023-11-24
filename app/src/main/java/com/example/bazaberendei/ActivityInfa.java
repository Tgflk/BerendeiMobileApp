package com.example.bazaberendei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityInfa extends AppCompatActivity {

    private ImageButton logoinformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infa);

        logoinformation = findViewById(R.id.logoinformation);

        logoinformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityInfa.this, ActivityMenu.class);
                startActivity(intent);
            }
        });
    }
}