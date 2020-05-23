package com.academy.dashboard.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CourseService() {
    }

    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    public Optional<Course> getCourse(String id) {
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void editCourse(String id, Course course) {
        courseRepository.save(course);
    }

    public void removeAllCourses() {
        courseRepository.deleteAll();
    }

    public void removeCourse(String id) {
        courseRepository.deleteById(id);
    }
}
