package com.example.sectrainingapp;

public class CourseModel {
    private String title;
    private String category;
    private String description;
    private String videoUrl; // New!
    private String webLink;  // New!

    // Updated Constructor to accept links
    public CourseModel(String title, String category, String description, String videoUrl, String webLink) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.videoUrl = videoUrl;
        this.webLink = webLink;
    }

    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public String getVideoUrl() { return videoUrl; }
    public String getWebLink() { return webLink; }
}