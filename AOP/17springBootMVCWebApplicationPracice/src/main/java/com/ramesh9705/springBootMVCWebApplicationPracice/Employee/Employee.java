package com.ramesh9705.springBootMVCWebApplicationPracice.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String location;
	private String adminref;
	private String username;
	public Employee() {
		super();
	}
	public Employee(int id, String firstname, String lastname, String location, String adminref, String username) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.adminref = adminref;
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAdminref() {
		return adminref;
	}
	public void setAdminref(String adminref) {
		this.adminref = adminref;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
}
