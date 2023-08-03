package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.modelentities.User;

@SpringBootApplication
public class SpringbootCurdJpaExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(SpringbootCurdJpaExampleApplication.class, args);
		
//we called UserRepository in main Application using context.getBean
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
// we have created user details using UserRepository in below 
		
		    //User user= new User();
	       //user.setId(id);___ no need to do it will give automatically
		  //user.setName("Wasim");
		 //user.setCity("Bangaluru");
		//user.setStatus("I am Wasim");
	
//User user1 = userRepository.save(user);   //... it was for saving only a single Entities(USER details)
		//System.out.println(user1);
		
		
// Create Object of User in below 
		
		      //User user1= new User();
             //user1.setName("Mithu");
            //user1.setCity("Kolkata");
           //user1.setStatus("I am Mithu");
        
         //User user2= new User();
        //user2.setName("Pervez");
       //user2.setCity("Bommasandra");
      //user2.setStatus("I am Pervez");
        
     //User user3= new User();
    //user3.setName("Shubham");
   //user3.setCity("Jhardkhand");
  //user3.setStatus("I am Shubham");
        		
//It was for saving Multiple Entities or Objects or USER Details
		
         //List<User> listusers = List.of(user1,user2,user3);
        //Iterable<User> result = userRepository.saveAll(listusers);
       //result.forEach(e->{                       
      //	  System.out.println(e);
     // });
		
		
//I wants to Update the user id of 7, u have to do get id 1st step , there are 2 step u have to follow
		
		 //Optional<User> optional = userRepository.findById(7);
		//User userget = optional.get();  // 
		
// I wants to Update the user id of 7 2nd step 
		
	     //userget.setName("Pervez Alom");
		//User result1 = userRepository.save(userget);
	   //System.out.println(result1);
		
// If you want to get data then you have to follow 		
		 // (1)- findById()---return optional containing your data, it will give Single element
		
// If you want to get All data then u have to follow
		
		     // (2)-- findAll()
		    //Iterable<User> findAll = userRepository.findAll();
		   //findAll.forEach(e->{
		  //System.out.println(e);
		 //});
		
		
//If You want to Delete the user element then you have to follow 
		
		   //(1)---Single user detail delete step
		  //userRepository.deleteById(2);
		 //System.out.println("Succesfully Deleted");
		
//If You want to Delete the user element then you have to follow 
		
		  //(2)--- All user details delete step
		 //userRepository.deleteAll();
		//System.out.println("Delete All");
		
//If You want to Delete the user element then you have to follow 
		//(3)--- Multiple user details delete step
		
		
		
		
		
		
		
	}

}
