package com.wasim.services;

import com.wasim.entitymodel.Course;

import java.security.PublicKey;
import java.util.List;

public interface CourseService {

    public List<Course> getAllCourses();
    public Course getCourse(Long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(long parseLong);


}
