package com.wasim.crud.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wasim.crud.exam.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	Product findByName(String name);
}
