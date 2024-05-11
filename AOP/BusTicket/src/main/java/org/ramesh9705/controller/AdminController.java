package org.ramesh9705.controller;

import javax.validation.Valid;

import org.ramesh9705.exception.LogInException;
import org.ramesh9705.model.AdminDto;
import org.ramesh9705.service.AdminLogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/admin")
public class AdminController
{
	@Autowired
	private AdminLogInService adminLogInService;
	
	@PostMapping("/login")
	public ResponseEntity<String> adminLogInHandle(@Valid @RequestBody AdminDto adminDto) throws LogInException
	{
		String msg = adminLogInService.logInAdmin(adminDto);
		return new ResponseEntity<String>(msg, HttpStatus.ACCEPTED);
		
	}
	@PostMapping("/logout")
	public ResponseEntity<String> adminLogoutHandle(@Valid @RequestParam String key) throws LogInException
	{
		String msg = adminLogInService.logOutAdmin(key);
		return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
}
