package org.ramesh9705.controller;

import org.ramesh9705.model.AdminReg;
import org.ramesh9705.model.AdminRegDto;
import org.ramesh9705.service.AdminRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/adminreg")
public class AdminRegister
{
	@Autowired
	private AdminRegService adminRegService;
	
	@PostMapping("/add")
	public ResponseEntity<AdminReg> addAdmin(@RequestBody AdminRegDto adminRegDto)
	{
		AdminReg msg = adminRegService.addAdmin(adminRegDto);
		return new ResponseEntity<AdminReg>(msg, HttpStatus.CREATED);	
	}
}
