package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String name, dept,institution, info;
    TextView readyText;
    EditText nameText, deptText, institutionText;
    private Button _Ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nameText= findViewById(R.id.name_text);
        deptText= findViewById(R.id.dept_text);
        institutionText=findViewById(R.id.institution_text);
        _Ok = findViewById(R.id.ok_button);

        _Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameText.getText().toString();
                dept = deptText.getText().toString();
                institution = institutionText.getText().toString();
                info= "Hi, "+ name + "\nWelcome to " +dept+" Department in " + institution;
                Welcome();
            }
        });



    }

    private void Welcome(){
        Intent welcome= new Intent(MainActivity.this, NextActivity.class);
        welcome.putExtra("message",info);
        startActivity(welcome);
    }


}