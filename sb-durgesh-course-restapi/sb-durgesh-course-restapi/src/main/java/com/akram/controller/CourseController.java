package com.akram.controller;

import com.akram.entity.Course;
import com.akram.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "This is my home";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourses(@RequestBody Course course){
        return this.courseService.addCourses(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

//    @DeleteMapping("/courses/{courseId}")
//    public Course deleteCourse(@PathVariable String courseId){
//        return this.courseService.deleteCourse(Long.parseLong(courseId));
//    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpResponse> deleteCourse(@PathVariable String courseId){
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
