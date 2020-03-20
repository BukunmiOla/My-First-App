package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private Button _Ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _Ok = findViewById(R.id.ok_button);
        _Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Welcome();
            }
        });

    }

    private void Welcome(){
        Intent welcome= new Intent(MainActivity.this, NextActivity.class);
        startActivity(welcome);
    }


}