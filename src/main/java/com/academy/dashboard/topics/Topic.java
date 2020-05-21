package com.academy.dashboard.topics;

public class Topic {
    private String id;
    private String title;
    private String difficulty;
    private String courseId;

    public Topic(String id, String title, String difficulty, String courseId) {
        this.id = id;
        this.title = title;
        this.difficulty = difficulty;
        this.courseId = courseId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
