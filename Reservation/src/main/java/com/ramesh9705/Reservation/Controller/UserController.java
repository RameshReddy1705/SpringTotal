package com.ramesh9705.Reservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ramesh9705.Reservation.Dto.ResponseStructure;
import com.ramesh9705.Reservation.Dto.User;
import com.ramesh9705.Reservation.Service.UserService;

@RestController
@CrossOrigin
public class UserController
{
	@Autowired
	public UserService userService;
	@PostMapping("/user")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	@PutMapping("/user")
	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestBody User user)
	{
		return userService.updateUser(user);
	}
	@GetMapping("/user/{id}")
	public ResponseEntity<ResponseStructure<User>> findById(@PathVariable int id)
	{
		return userService.findById(id);
	}
	@PostMapping("/user/verify-by-phone")
	public ResponseEntity<ResponseStructure<User>> verifyByEmail(@RequestParam String email, @RequestParam String password)
	{
		return userService.verifyByEmail(email,password);
	}
}
