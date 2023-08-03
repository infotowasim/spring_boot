package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springrest.entities.Course;

public class CourseServiceImpl implements CourseService {
	
	List<Course> list;

	 public CourseServiceImpl() {
		 
		 list=new ArrayList<>();
		 list.add(new Course(145,"Jva Core Course","This Course Contains Basic Java"));
		 list.add(new Course(146,"Spring Boot Course","Creating REST API"));
		 
	 }
	 
	@Override
	public List<Course> getCourses() {
		return list;
	}

}
