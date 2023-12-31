package com.javatechie.crud.example.service;


import com.javatechie.crud.example.entity.Student;
import com.javatechie.crud.example.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public List<Student> saveStudents(List<Student> students) {
		return repository.saveAll(students);
	}

	public List<Student> getStudents() {
		return repository.findAll();
	}
//
//	public Product getProductById(int id) {
//		return repository.findById(id).orElse(null);
//	}
//
//	public Product getProductByName(String name) {
//		return repository.findByName(name);
//	}
//
//	public String deleteProduct(int id) {
//		repository.deleteById(id);
//		return "product removed !! " + id;
//	}
//
//	public Product updateProduct(Student product) {
//		Product existingProduct = repository.findById(product.getId()).orElse(null);
//		existingProduct.setName(product.getName());
//		existingProduct.setQuantity(product.getQuantity());
//		existingProduct.setPrice(product.getPrice());
//		return repository.save(existingProduct);
//	}

}
