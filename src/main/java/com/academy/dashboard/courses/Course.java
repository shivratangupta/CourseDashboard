package com.academy.dashboard.courses;

import com.academy.dashboard.topics.Topic;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String title;
    private List<Topic> topics;

    public Course(String id, String title) {
        this.id = id;
        this.title = title;
        topics = new ArrayList<>();
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

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }
}
