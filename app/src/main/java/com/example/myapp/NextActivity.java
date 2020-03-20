package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class NextActivity extends AppCompatActivity {
    TextView readyText, sleepText, runText;
    EditText infoText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        infoText = findViewById(R.id.info);

        Intent Here = getIntent();
        String info= Here.getExtras().getString("message");
        infoText.setText(info);

    }
}
