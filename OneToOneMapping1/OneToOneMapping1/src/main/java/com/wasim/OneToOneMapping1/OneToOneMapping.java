package com.wasim.OneToOneMapping1;

import com.wasim.OneToOneMapping1.entity.Student;
import com.wasim.OneToOneMapping1.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class OneToOneMapping {

    private static Logger logger= LoggerFactory.getLogger(OneToOneMapping1Application.class);

    @Autowired
    StudentRepository studentRepository;

    public static void main(String[] args) {
        new OneToOneMapping().test();
    }
    public  void test () {


        Student student=new Student();
        student.setStudentId(101);
        student.setStudentName("Amin");
        student.setStudentAbout("He is a good guy");
        Student save =studentRepository.save(student);
        logger.info("saved student : {}",save.getStudentName());
    }
}
