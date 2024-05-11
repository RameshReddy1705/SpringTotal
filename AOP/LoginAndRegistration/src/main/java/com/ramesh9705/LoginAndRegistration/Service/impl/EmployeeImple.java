package com.ramesh9705.LoginAndRegistration.Service.impl;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ramesh9705.LoginAndRegistration.Dto.EmployeeDto;
import com.ramesh9705.LoginAndRegistration.Dto.LoginDto;
import com.ramesh9705.LoginAndRegistration.Entity.Employee;
import com.ramesh9705.LoginAndRegistration.Repo.EmployeeRepo;
import com.ramesh9705.LoginAndRegistration.Service.EmployeeService;
import com.ramesh9705.LoginAndRegistration.response.LoginResponse;
@Service
public class EmployeeImple implements EmployeeService
{
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addEmployee(EmployeeDto employeeDto)
	{
		Employee employee = new Employee(
				employeeDto.getEmployeeid(),
				employeeDto.getEmployeename(),
				employeeDto.getEmail(),
				this.passwordEncoder.encode(employeeDto.getPassword())
		);
		
		employeeRepo.save(employee);
		return employee.getEmployeename();
	}

	@Override
	public LoginResponse loginEmployee(LoginDto loginDto)
	{ 
		String msg="";
		Employee employee1 = employeeRepo.findByEmail(loginDto.getEmail());
		if(employee1 !=null)
		{
			String password = loginDto.getPassword();
			String encodedPassword = employee1.getPassword();
			Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			
			if(isPwdRight)
			{
				Optional<Employee> employee = employeeRepo.findOneByEmailAndPassword(loginDto.getEmail(),encodedPassword);
				if(employee.isPresent())
				{
					return new LoginResponse("Log In Success", true);
					
				}
				else
				{
					return new LoginResponse("Log In Failed", false);
				}
			}
			else
			{
				return new LoginResponse("Password Not Match", false);
			}
		}
		else
		{
			return new LoginResponse("Email Not Exist", false);
		}
		
		

	}

}
