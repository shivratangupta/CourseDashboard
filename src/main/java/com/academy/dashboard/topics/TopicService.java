package com.academy.dashboard.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public TopicService() {
    }

    public List<Topic> getTopics(String courseId) {
        return topicRepository.findByCourseId(courseId);
    }

    public Optional<Topic> getTopic(String topicId) {
        return topicRepository.findById(topicId);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void editTopic(String topicId, Topic topic) {
        topicRepository.save(topic);
    }

    public void removeAllTopics(String courseId) {
        topicRepository.deleteByCourseId(courseId);
    }

    public void removeTopic(String topicId) {
        topicRepository.deleteById(topicId);
    }
}
