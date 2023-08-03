package com.mithu.services;

import com.mithu.dao.CourseRepository;
import com.mithu.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(long courseId){
        return courseRepository.getReferenceById(courseId);
    }

    @Override
    public Course addCourse(Course course){
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course){
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(long parseLong){
        Course entity = courseRepository.getOne(parseLong);
        courseRepository.delete(entity);
    }
}
