package com.akram.services;

import com.akram.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(1L,"Java","Java Course"));
        list.add(new Course(2L,"Python","Python Course"));
        list.add(new Course(3L,"DotNet","Dot Net Course"));
    }

    //Get All Courses
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId){
        Course c=null;
        for (Course course:list){
            if (course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

//    @Override
//    public Course addCourses(Course course){
//        list.add(course);
//        return course;
//
//    }

    @Override
    public Course addCourses(Course course){
        list.add(course);
        return course;
    }

//    @Override
//    public Course updateCourse(Course course){
//        list.forEach(e->{
//            if (e.getId()==course.getId()){
//                e.setDescription(course.getDescription());
//                e.setTitle(course.getTitle());
//            }
//        });
//        return course;
//    }

//    @Override
//    public Course updateCourse(Course course){
//        list.forEach(e-> {
//            if (e.getId()==course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
//        return course;
//    }

    @Override
    public Course updateCourse(Course course){
        list.forEach(e-> {
            if (e.getId()== course.getId()){
                e.setTitle(course.getTitle());
                e.setDescription(course.getDescription());
            }
        });
        return course;
    }

//    @Override
//    public Course deleteCourse(long parseLong) {
//        list=this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
//        return list;
//    }

    @Override
    public void deleteCourse(long parseLong){
        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    }


}
