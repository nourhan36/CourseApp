package com.example.courseapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

public class Course implements Parcelable {
    @DrawableRes
    int courseImage;
    int content;

    public Course(int courseImage, int content) {
        this.courseImage = courseImage;
        this.content = content;
    }

    protected Course(Parcel in) {
        courseImage = in.readInt();
        content = in.readInt();
    }

    public static final Creator<Course> CREATOR = new Creator<Course>() {
        @Override
        public Course createFromParcel(Parcel in) {
            return new Course(in);
        }

        @Override
        public Course[] newArray(int size) {
            return new Course[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(courseImage);
        dest.writeInt(content);
    }
}