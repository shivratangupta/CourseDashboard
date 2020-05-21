package com.academy.dashboard.topics;

import com.academy.dashboard.courses.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    CourseService courseService;

    public TopicService() {
    }

    public List<Topic> getTopics(String courseId) {
        return courseService.getTopics(courseId);
    }

    public Topic getTopic(String courseId, String topicId) {
        List<Topic> topics = courseService.getTopics(courseId);
        for(Topic topic: topics) {
            if(topic.getId().equals(topicId))
                return topic;
        }
        return null;
    }

    public void addTopic(String courseId, Topic topic) {
        List<Topic> topics = courseService.getTopics(courseId);
        topics.add(topic);
    }

    public void editTopic(String courseId, String topicId, Topic topic) {
        List<Topic> topics = courseService.getTopics(courseId);
        for(int i=0; i<topics.size(); i++) {
            Topic topic1 = topics.get(i);
            if(topic1.getId().equals(topicId)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void removeAllTopics(String courseId) {
        List<Topic> topics = courseService.getTopics(courseId);
        topics.clear();
    }

    public void removeTopic(String courseId, String topicId) {
        List<Topic> topics = courseService.getTopics(courseId);
        for(Topic topic: topics) {
            if(topic.getId().equals(topicId)) {
                topics.remove(topic);
                return;
            }
        }
    }
}
