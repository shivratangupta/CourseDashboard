package com.academy.dashboard.topics;

import com.academy.dashboard.courses.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Topic {

    @Id
    private String id;
    private String title;
    private String difficulty;
    @ManyToOne
    private Course course;

    public Topic() {
    }

    public Topic(String id, String title, String difficulty, String courseId) {
        this.id = id;
        this.title = title;
        this.difficulty = difficulty;
        this.course = new Course(courseId, "");
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
