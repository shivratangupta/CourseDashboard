package com.academy.dashboard.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/Courses/{courseId}/topics")
    public List<Topic> getTopics(@PathVariable String courseId) {
        return topicService.getTopics(courseId);
    }

    @RequestMapping("/courses/{courseId}/topics/{topicId}")
    public Topic getTopic(@PathVariable String courseId, @PathVariable String topicId) {
        return topicService.getTopic(courseId, topicId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses/{courseId}/topics")
    public void addTopic(@PathVariable String courseId, @RequestBody Topic topic) {
        topicService.addTopic(courseId, topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{courseId}/topics/{topicId}")
    public void editTopic(@PathVariable String courseId, @PathVariable String topicId, @RequestBody Topic topic) {
        topicService.editTopic(courseId, topicId, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{courseId}/topics")
    public void removeAllTopics(@PathVariable String courseId) {
        topicService.removeAllTopics(courseId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{courseId}/topics/{topicId}")
    public void removeTopic(@PathVariable String courseId, @PathVariable String topicId) {
        topicService.removeTopic(courseId, topicId);
    }
}
