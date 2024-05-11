package com.ramesh9705.LoginAndRegistration.EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramesh9705.LoginAndRegistration.Dto.EmployeeDto;
import com.ramesh9705.LoginAndRegistration.Dto.LoginDto;
import com.ramesh9705.LoginAndRegistration.Service.EmployeeService;
import com.ramesh9705.LoginAndRegistration.response.LoginResponse;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")

public class EmployeeCotroller
{
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path = "/save")
	public String saveEmployee(@RequestBody EmployeeDto employeeDto)
	{
		String id=employeeService.addEmployee(employeeDto);
		return id;
		
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<?> loginEmployee(@RequestBody LoginDto loginDto)
	{
		LoginResponse loginResponse =employeeService.loginEmployee(loginDto);
		return ResponseEntity.ok(loginResponse);
		
	}
	
	
	

}
