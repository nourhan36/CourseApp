package com.example.courseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.TextView;

public class MainCoursesPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses_page);
        Button androidButton = findViewById(R.id.btn_android);
        Button iosButton = findViewById(R.id.btn_ios);
        Button fullstackButton = findViewById(R.id.btn_fullStack);

        androidButton.setOnClickListener(v -> {
            Course android = new Course(R.drawable.android, R.string.androidCourse);
            courseActivity(android);
        });
        iosButton.setOnClickListener(v -> {
            Course android = new Course(R.drawable.ios, R.string.iosCourse);
            courseActivity(android);
        });
        fullstackButton.setOnClickListener(v -> {
            Course android = new Course(R.drawable.full_stack, R.string.fullStackCourse);
            courseActivity(android);
        });

    }

    private void courseActivity(Course course) {
        Intent intent = new Intent(this, CoursePage.class);
        intent.putExtra("course", course);
        startActivity(intent);
    }
}