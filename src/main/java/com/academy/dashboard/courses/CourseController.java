package com.academy.dashboard.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @RequestMapping("/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
    public void editCourse(@PathVariable String id, @RequestBody Course course) {
        courseService.editCourse(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses")
    public void removeAllCourses() {
        courseService.removeAllCourses();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void removeCourse(@PathVariable String id) {
        courseService.removeCourse(id);
    }
}
