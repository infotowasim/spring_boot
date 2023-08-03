package com.wasim;

import com.wasim.model.Location;
import com.wasim.repository.LocationRepository;
import com.wasim.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}


}
