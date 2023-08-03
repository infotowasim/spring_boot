package com.wasim;

import com.wasim.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstHn1JbApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstHn1JbApplication.class, args);

		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(1);
		userDetails.setUserName("First Name");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();

	}

}
