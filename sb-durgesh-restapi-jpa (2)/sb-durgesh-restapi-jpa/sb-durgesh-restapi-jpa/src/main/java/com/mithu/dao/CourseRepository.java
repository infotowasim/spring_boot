package com.mithu.dao;

import com.mithu.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

//    public List<Course> findAll();
//    public Course getOne();
//    public Course save();
//   // public Course save(course);


}
