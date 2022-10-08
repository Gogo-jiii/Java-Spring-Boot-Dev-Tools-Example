package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	public User findByNameAndStatusAndCityNot(String name, String status, String city);
	
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getAllUsers();
	
	@Query(value = "select * from user where user.name=:name", nativeQuery = true)
	public User getUserByName(String name);
}
