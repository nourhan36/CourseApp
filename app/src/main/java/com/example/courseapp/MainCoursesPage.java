package com.example.courseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.TextView;

public class MainCoursesPage extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses_page);
        Button androidButton = findViewById(R.id.btn_android);
        Button iosButton = findViewById(R.id.btn_ios);
        Button fullstackButton = findViewById(R.id.btn_fullStack);

        androidButton.setOnClickListener(v -> courseActivity(getString(R.string.androidCourse) , R.drawable.android));
        iosButton.setOnClickListener(v -> courseActivity(getString(R.string.iosCourse) , R.drawable.ios));
        fullstackButton.setOnClickListener(v -> courseActivity(getString(R.string.fullStackCourse) , R.drawable.full_stack));

    }

    private void courseActivity(String courseContent, int courseImage) {
        Intent intent = new Intent(this, CoursePage.class);
        intent.putExtra("content", courseContent);
        intent.putExtra("image", courseImage);
        startActivity(intent);
    }
}