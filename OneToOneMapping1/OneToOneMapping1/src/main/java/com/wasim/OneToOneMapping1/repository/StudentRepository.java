package com.wasim.OneToOneMapping1.repository;

import com.wasim.OneToOneMapping1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student,Integer> {
}
