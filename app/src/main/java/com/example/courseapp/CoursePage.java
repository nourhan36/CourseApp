package com.example.courseapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CoursePage extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

        ImageView courseImageView = findViewById(R.id.img_course);
        TextView courseTitleTextView = findViewById(R.id.tv_show);

        String courseContent = getIntent().getStringExtra("content");
        int courseImage = getIntent().getIntExtra("image", R.drawable.android);

        courseTitleTextView.setText(courseContent);
        courseImageView.setImageResource(courseImage);
    }
}
