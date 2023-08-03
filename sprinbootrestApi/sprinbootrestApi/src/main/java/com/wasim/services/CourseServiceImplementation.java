package com.wasim.services;

import com.wasim.entitymodel.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImplementation implements CourseService{

    List<Course> list;
    public CourseServiceImplementation(){

        list=new ArrayList<>();
        list.add(new Course(111,"Java","Java Course"));
        list.add(new Course(222,"SpringBoot","SpringBoot Course"));
    }

    @Override
    public List<Course> getAllCourses() {
        return list;
    }

    @Override
    public Course getCourse(Long courseId) {
        Course c=null;
        for (Course course:list) {
            if (course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        list.forEach(e->{
            if (e.getId()==course.getId()){
                e.setTitle (course.getTitle());
                e.setDescription(course.getDescription());
            }
        });
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
       list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    }


}
