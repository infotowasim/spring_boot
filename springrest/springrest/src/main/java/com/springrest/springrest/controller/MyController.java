package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	private CourseService courseServise;
	
    @GetMapping ("/home")
	public String home() {
		return "welcome to courses application";
		
	//get the courses
		
		@GetMapping("/Courses")
		public List<Course> getCourses()
		{
			return this.courseServise.getCourses();
			
			
		}
		
		
	}
}
