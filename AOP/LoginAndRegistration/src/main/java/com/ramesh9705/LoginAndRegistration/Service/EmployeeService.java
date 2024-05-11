package com.ramesh9705.LoginAndRegistration.Service;

import com.ramesh9705.LoginAndRegistration.Dto.EmployeeDto;

import com.ramesh9705.LoginAndRegistration.Dto.LoginDto;
import com.ramesh9705.LoginAndRegistration.response.LoginResponse;

public interface EmployeeService
{

	String addEmployee(EmployeeDto employeeDto);

	LoginResponse loginEmployee(LoginDto loginDto);
	
}
