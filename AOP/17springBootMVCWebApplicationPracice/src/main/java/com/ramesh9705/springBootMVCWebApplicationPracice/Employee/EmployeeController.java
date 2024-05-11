package com.ramesh9705.springBootMVCWebApplicationPracice.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class EmployeeController
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("list-employee")
	private String listOfEmployees(ModelMap model)
	{
		String username = getLoggedInUsername(model);
		List<Employee> employees=employeeRepository.findByUsername(username );
		model.addAttribute("employees", employees);
		return "list";
	}

	private String getLoggedInUsername(ModelMap model)
	{
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	@RequestMapping(value = "add-employee", method = RequestMethod.GET)
	public String showEmployeePage(ModelMap model)
	{
		String username = getLoggedInUsername(model);
		Employee employee=new Employee(0, " ", "", "", "", username);
		model.put("employee", employee);
		return "employeecreationpage";
	}
	
	@RequestMapping(value = "add-employee", method = RequestMethod.POST)
	public String addEmployeePage(Employee employee, ModelMap model)
	{
		
		String username = getLoggedInUsername(model);
		employee.setUsername(username);
		employeeRepository.save(employee);
		return "redirect:list-employee";
	}
	@RequestMapping("delete-employee")
	public String deleteEmployee(@RequestParam int id)
	{
		employeeRepository.deleteById(id);
		return "redirect:list-employee";
	}
	@RequestMapping(value = "update-employee", method = RequestMethod.GET)
	public String showUpadatePage( @RequestParam int id, ModelMap model)
	{
		Employee employee2=employeeRepository.findById(id).get();
//		Employee employees= new Employee(employee.getId(), employee.getFirstname(), employee.getLastname(), employee.getLocation(), employee.getAdminref(), employee.getUsername());
		model.put("employee2", employee2);
		return "employeecreationpage";
	}
	@RequestMapping(value = "update-employee", method = RequestMethod.POST)
	public String UpadatePage(ModelMap model, Employee employee)
	{
		String username = getLoggedInUsername(model);
		employee.setUsername(username);
		employeeRepository.save(employee);
		return "redirect:list-employee";
	}


}

/*
 * 
 * 
	
	<div class="container">
	<h1>Employee Details</h1>
	<form:form action="" method="post" modelAttribute="employee">
		<label>First Name :</label>
		<form:input type="text" path="firstname"/>
		
		<label>Last Name :</label>
		<form:input type="text" path="lastname"/>
		
		<label>Location :</label>
		<input type="text" path="location"/>
		
		<input type="submit" class="btn btn-success"/>
	</form:form>
	</div>
 */

