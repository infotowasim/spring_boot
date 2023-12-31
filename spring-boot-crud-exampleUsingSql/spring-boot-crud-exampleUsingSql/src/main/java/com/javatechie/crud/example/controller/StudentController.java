package com.javatechie.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.entity.Student;
import com.javatechie.crud.example.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

	@PostMapping("/addStudents")
	public List<Student> addStudents(@RequestBody List<Student> students) {
		return service.saveStudents(students);
	}
	
	
	@GetMapping("/students")
	public List<Student> findAllStudents() {
		return service.getStudents();
	}
	
	
	
	
	
	
	
	
}
