package com.akram.services;

import com.akram.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseId);
    public Course addCourses(Course course);
    public Course updateCourse(Course course);
//    public Course deleteCourse(long parseLong);
    public void deleteCourse(long parseLong);
}
