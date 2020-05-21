package com.academy.dashboard.courses;

import com.academy.dashboard.topics.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    List<Course> courses;

    public CourseService() {
        courses = new ArrayList<>();
        courses.add(new Course("1", "Data Structures"));
        courses.add(new Course("2", "LLD"));
        courses.add(new Course("3", "HLD"));
        courses.add(new Course("4", "DBMS"));
        courses.add(new Course("5", "Computer Networks"));
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCourse(String id) {
        for(Course course: courses) {
            if(course.getId().equals(id))
                return course;
        }
        return null;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void editCourse(String id, Course course) {
        for(int i=0; i<courses.size(); i++) {
            if(courses.get(i).getId().equals(id)) {
                courses.set(i, course);
                return;
            }
        }
    }

    public void removeAllCourses() {
        courses.clear();
    }

    public void removeCourse(String id) {
        for(Course course: courses) {
            if(course.getId().equals(id)) {
                courses.remove(course);
                return;
            }
        }
    }

    public List<Topic> getTopics(String courseId) {
        for(Course course: courses) {
            if(course.getId().equals(courseId))
                return course.getTopics();
        }
        return null;
    }
}
