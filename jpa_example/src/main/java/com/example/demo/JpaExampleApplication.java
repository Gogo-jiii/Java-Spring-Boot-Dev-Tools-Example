package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;

@SpringBootApplication
public class JpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaExampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		// insert data
//		User user1 = new User();
//		user1.setName("Vaibhav 1");
//		user1.setCity("Kalyan 1");
//		user1.setStatus("live");
//
//		User user2 = new User();
//		user2.setName("Vaibhav 2");
//		user2.setCity("Kalyan 2");
//		user2.setStatus("live");
//		
//		User user3 = new User();
//		user3.setName("Vaibhav 3");
//		user3.setCity("Kalyan 3");
//		user3.setStatus("live");
//		
//		List<User> users = List.of(user1, user2, user3);
//		userRepository.saveAll(users);
//		System.out.println("Done");

		// get data
//		Optional<User> optional = userRepository.findById(88);
//		if(optional.isPresent()) {
//			User user = optional.get();
//			System.out.println("Data : " + user);	
//		}else {
//			System.out.println("No data found!");
//		}

		// get all data
//		Iterable<User> iterable = userRepository.findAll();
//		iterable.forEach(user ->{
//			System.out.println(user);
//		});

		// update data
//		Optional<User> optional = userRepository.findById(6);
//		if (optional.isPresent()) {
//			User user = optional.get();
//			user.setStatus("Offline");
//
//			userRepository.save(user);
//			System.out.println("Data updated.");
//		} else {
//			System.out.println("No data found!");
//		}
		
		//delete data
//		Optional<User> optional = userRepository.findById(6);
//		if (optional.isPresent()) {
//			User user = optional.get();
//
//			userRepository.delete(user);
//			System.out.println("Data deleted.");
//		} else {
//			System.out.println("No data found!");
//		}

		//delete all data
		userRepository.deleteAll();
		System.out.println("Deleted all.");
	}

}
