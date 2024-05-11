package org.ramesh9705.controller;

import org.ramesh9705.exception.UserException;
import org.ramesh9705.model.User;
import org.ramesh9705.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<User> addUserHandle(@RequestBody User user) throws UserException
	{
		User u = userService.addUser(user);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
		
	}
	@PutMapping("/update")
	public ResponseEntity<User> updateUserHandle(@RequestBody User user, @RequestParam String key) throws UserException
	{
		User u = userService.updateUser(user,key);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
		
	}
}
