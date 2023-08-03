package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.entity.Student;
import com.javatechie.crud.example.service.ProductService;
import com.javatechie.crud.example.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentproducts")
	public List<Student> findAllStudProducts() {
		return studentService.getStudents();
	}


	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}

	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return service.getProducts();
	}

	@GetMapping("/productById/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}

	@GetMapping("/product/{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
}
