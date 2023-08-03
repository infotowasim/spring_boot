package com.wasim.springbootjpa.controller;

import com.wasim.springbootjpa.entity.Course;
import com.wasim.springbootjpa.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
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


    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }


    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
