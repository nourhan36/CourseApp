package com.example.courseapp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CoursePage extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

        Course course = getIntent().getParcelableExtra("course");

        ImageView courseImg = findViewById(R.id.img_course);
        TextView courseContentTV = findViewById(R.id.tv_show);

        assert course != null;
        courseImg.setImageResource(course.courseImage);
        courseContentTV.setText(course.content);
    }
}