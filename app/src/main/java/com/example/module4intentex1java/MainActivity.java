package com.example.module4intentex1java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    void initView() {
        String name = "Jakhongir";
        String surname = "Gaffarov";
        Button b_openSecond = findViewById(R.id.b_openSecond);
        b_openSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(name, surname);
            }
        });
    }

    void openSecondActivity(String name, String surname) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("surname", surname);
        startActivity(intent);
    }
}