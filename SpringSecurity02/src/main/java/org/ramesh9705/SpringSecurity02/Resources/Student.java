package org.ramesh9705.SpringSecurity02.Resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Student
{
	private Logger logger = LoggerFactory.getLogger(getClass());
	private static final List<Employee> Employee_List = List.of(
			new Employee("Ramesh", "Gangannagari"),
			new Employee("Ramesh", "Gangannagari"),
			new Employee("Reddy", "Gangannagari")
			);
	@GetMapping("/employee")
	public List<Employee> retriveAllEmployees()
	{
		return Employee_List;
	}
	@GetMapping("/users/{username}/employee")
	public Employee retriveSpecificEmployees(@PathVariable("username") String username)
	{
		return Employee_List.get(0);
	}
	@PostMapping("/users/{username}/employee")
	public void createEmployee(@PathVariable("username") String username,
				@RequestBody Employee employee)
	{
		logger.info("create {} for {} ",employee, username);
	}
}
record Employee(String username, String lastname) {}

