package com.example.bazaberendei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityHome extends AppCompatActivity {
    private ImageButton ib_userhome;
    private ImageButton logohome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ib_userhome = findViewById(R.id.ib_userhome);
        logohome = findViewById(R.id.logohome);

        ib_userhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHome.this, ActivityCabBron.class);
                startActivity(intent);
            }
        });
        logohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHome.this, ActivityMenu.class);
                startActivity(intent);
            }
        });
    }
}