package com.example.module4intentex1java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    static final String TAG = SecondActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    void initView() {
        TextView tv_second = findViewById(R.id.tv_second);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");

        Log.d(TAG, name);
        Log.d(TAG, surname);

        tv_second.setText(name +" "+ surname);
    }
}