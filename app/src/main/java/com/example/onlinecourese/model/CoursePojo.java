package com.example.onlinecourese.model;

public class CoursePojo {
    int image;
    String title;
    String totoalCourse;

    public CoursePojo(int image, String title, String totoalCourse) {
        this.image = image;
        this.title = title;
        this.totoalCourse = totoalCourse;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotoalCourse() {
        return totoalCourse;
    }

    public void setTotoalCourse(String totoalCourse) {
        this.totoalCourse = totoalCourse;
    }
}
