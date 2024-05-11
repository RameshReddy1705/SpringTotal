package org.docNmeds.ramesh.docNmedsBackEndRestApi.Controller;

import org.docNmeds.ramesh.docNmedsBackEndRestApi.Dto.DocNmedsUserDto;
import org.docNmeds.ramesh.docNmedsBackEndRestApi.Dto.LogInDto;
import org.docNmeds.ramesh.docNmedsBackEndRestApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class UserController
{
	@Autowired
	private UserService userService;
	
	@PostMapping(path = "/save")
	public String saveUser(@RequestBody DocNmedsUserDto docNmedsUserDto)
	{
		String id = userService.addUser(docNmedsUserDto);
		return id;
		
	}
	@PostMapping(path = "/login")
	public ResponseEntity<?> logInUser(@RequestBody LogInDto logInDto)
	{
		LogInResponse logInResponse = userService.logInUser(logInDto);
		return ResponseEntity.ok(logInResponse);
		
	}
}
