package com.wasim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo1Application.class, args);


		ApplicationContext context=new ClassPathXmlApplicationContext();

		Vehicle obj= (Vehicle) context.getBean("vehicle");
		obj.drive();
	}

}
