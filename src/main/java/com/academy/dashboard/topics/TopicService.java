package com.academy.dashboard.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics;

    public TopicService() {
        topics = new ArrayList<>();
        topics.add(new Topic("1", "Array", "Easy"));
        topics.add(new Topic("2", "Searching", "Easy"));
        topics.add(new Topic("3", "Sorting", "Easy"));
        topics.add(new Topic("4", "Dynamic Programming", "Hard"));
        topics.add(new Topic("5", "Graphs", "Hard"));
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        for(Topic topic: topics) {
            if(topic.getId().equals(id))
                return topic;
        }
        return null;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(int i=0; i<topics.size(); i++) {
            Topic topic1 = topics.get(i);
            if(topic1.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void removeAllTopics() {
        topics.clear();
    }

    public void removeTopic(String id) {
        for(Topic topic: topics) {
            if(topic.getId().equals(id)) {
                topics.remove(topic);
                return;
            }
        }
    }
}
