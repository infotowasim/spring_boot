package com.mithu.services;

import com.mithu.dao.CourseDao;
import com.mithu.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;
    @Override
    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {

        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course deleteCourse(long parseLong) {
        Course entity=courseDao.getOne(parseLong);
        return entity;
    }
}
