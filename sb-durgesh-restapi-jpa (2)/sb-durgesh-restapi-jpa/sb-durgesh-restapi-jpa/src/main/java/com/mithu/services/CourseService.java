package com.mithu.services;

import com.mithu.entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getAllCourses();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(long parseLong);
}
