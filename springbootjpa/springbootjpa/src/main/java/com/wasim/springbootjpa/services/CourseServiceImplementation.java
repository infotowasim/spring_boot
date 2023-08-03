package com.wasim.springbootjpa.services;

import com.wasim.springbootjpa.dao.CourseDao;
import com.wasim.springbootjpa.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService{

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(Long courseId) {
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        Course entity = courseDao.getOne(parseLong);
        courseDao.delete(entity);

    }
}
