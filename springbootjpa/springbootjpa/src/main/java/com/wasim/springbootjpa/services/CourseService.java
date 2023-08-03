package com.wasim.springbootjpa.services;


import com.wasim.springbootjpa.entity.Course;

import java.util.List;

public interface CourseService{
    public List<Course> getAllCourses();
    public Course getCourse(Long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(long parseLong);


}
