package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Primary;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	
	private String name;
	private String city;
	private String status;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int iD, String name, String city, String status) {
		super();
		ID = iD;
		this.name = name;
		this.city = city;
		this.status = status;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [ID=" + ID + ", name=" + name + ", city=" + city + ", status=" + status + "]";
	}
	
	
}
