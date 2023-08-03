package com.wasim.springbootjpa.dao;

import com.wasim.springbootjpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {

}
