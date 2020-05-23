package com.academy.dashboard.topics;

import com.academy.dashboard.courses.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/courses/{courseId}/topics")
    public List<Topic> getTopics(@PathVariable String courseId) {
        return topicService.getTopics(courseId);
    }

    @RequestMapping("/courses/{courseId}/topics/{topicId}")
    public Optional<Topic> getTopic(@PathVariable String topicId) {
        return topicService.getTopic(topicId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses/{courseId}/topics")
    public void addTopic(@PathVariable String courseId, @RequestBody Topic topic) {
        topic.setCourse(new Course(courseId, ""));
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{courseId}/topics/{topicId}")
    public void editTopic(@PathVariable String courseId, @PathVariable String topicId, @RequestBody Topic topic) {
        topic.setCourse(new Course(courseId, ""));
        topicService.editTopic(topicId, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{courseId}/topics")
    public void removeAllTopics(@PathVariable String courseId) {
        topicService.removeAllTopics(courseId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{courseId}/topics/{topicId}")
    public void removeTopic(@PathVariable String courseId, @PathVariable String topicId) {
        topicService.removeTopic(topicId);
    }
}
