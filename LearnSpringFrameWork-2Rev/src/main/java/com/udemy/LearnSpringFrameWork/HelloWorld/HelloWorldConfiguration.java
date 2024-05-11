package com.udemy.LearnSpringFrameWork.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address adress) {};
record Address (String dist, String dono) {};
@Configuration
public class HelloWorldConfiguration
{
	@Bean
	public String name()
	{
		return "Ramesh";
	}
	
	@Bean
	public int age()
	{
		return 25;
	}
	
	@Bean
	public Person person()
	{
		var person= new Person("Ravi",20,new Address("Kadapa","1*72"));
		return person;
	}
	
	@Bean
	public Person person2MethodCal()
	{
		return new Person(name(),age(),address());
		
	}
	
	@Bean
	public Person person3Parameter(String name, int age, Address RameshAddress)
	{
		return new Person(name,age,RameshAddress);
		
	}
	
	@Bean
	public Person person4Qualifier(String name, int age,@Qualifier("RameshAddressQuualifier") Address RameshAddress)
	{
		return new Person(name,age,RameshAddress);
		
	}
	
	
	
	@Bean(name = "RameshAddress")
	public Address address()
	{
		var address= new Address("Kadapa","1/72");
		return address;
	}

	@Bean(name = "RameshAddress1")
	@Qualifier("RameshAddressQuualifier")
	public Address address1()
	{
		var address= new Address("Kadapa....","1/72...");
		return address;
	}
}
