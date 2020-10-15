package com.example.onlinecourese.model;

public class LecturerPojo {
    String videoNumber;
    String videoTitle;
    String videoUrl;

    public LecturerPojo(String videoNumber, String videoTitle, String videoUrl) {
        this.videoNumber = videoNumber;
        this.videoTitle = videoTitle;
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoNumber() {
        return videoNumber;
    }

    public void setVideoNumber(String videoNumber) {
        this.videoNumber = videoNumber;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }
}
