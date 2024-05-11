package com.ramesh9705.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userLoginId;
	
	private String userName;
	
	private String password;

	private String firstName;
	
	private String lastName;
	
	private Long contact;
	
//	@Email(message = "Please enter valid email Id")
	private String email;
	
	
}
