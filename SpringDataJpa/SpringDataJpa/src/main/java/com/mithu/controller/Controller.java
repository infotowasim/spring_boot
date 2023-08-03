package com.mithu.controller;

import com.mithu.entity.Course;
import com.mithu.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired(required = true)
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }


    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }


    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }


    @DeleteMapping("/courses/{courseId}")
    public Course deleteCourse(@PathVariable String courseId){
        return this.courseService.deleteCourse(Long.parseLong(courseId));
    }
}
