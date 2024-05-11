package org.ramesh9705.controller;

import org.ramesh9705.exception.LogInException;
import org.ramesh9705.model.LogInDto;
import org.ramesh9705.service.UserLogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loginUser")
public class UserLogInController
{
	@Autowired
	private UserLogInService userLogInService;
	
	@PostMapping("/login")
	public ResponseEntity<String> userLogin(@RequestBody LogInDto logInDto) throws LogInException
	{
		String s = userLogInService.logInHandle(logInDto);
		return new ResponseEntity<String>(s,HttpStatus.ACCEPTED);
		
	}
	@PostMapping("/logOut")
	public ResponseEntity<String> userLogOut(@RequestParam String key) throws LogInException
	{
		String s = userLogInService.logOutHandle(key);
		return new ResponseEntity<String>(s,HttpStatus.ACCEPTED);
		
	}
	
}
