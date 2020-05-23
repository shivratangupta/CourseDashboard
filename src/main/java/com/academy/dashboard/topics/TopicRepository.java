package com.academy.dashboard.topics;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, String> {

    public List<Topic> findByCourseId(String courseId);

    public void deleteByCourseId(String courseId);
}
