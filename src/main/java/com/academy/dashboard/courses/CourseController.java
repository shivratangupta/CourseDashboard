package com.academy.dashboard.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/courses")
    public String getAllCourses(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        return "courses";
    }

    @RequestMapping("/courses/{id}")
    public String getCourse(@PathVariable String id, Model model) {
        courseService.getCourse(id).ifPresent(course -> model.addAttribute("course", course));
        return "course";
    }

    @RequestMapping("/addCourse")
    public String addCourse(Model model) {
        return "addCourse";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public String addCourse(Course course, Model model) {
        courseService.addCourse(course);
        model.addAttribute("courses", courseService.getAllCourses());
        return "courses";
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
