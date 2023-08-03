package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.modelentities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	

}
