package org.Ramesh.Reddy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployees
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Employee.xml");
		Employees emps=context.getBean("emps",Employees.class);
		System.out.println(emps.getNames());
		System.out.println(emps.getNumber());
		System.out.println(emps.getDetails());
	}
}
