package com.example.springFrameWorkConfigurations.Bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

record Address(String Vname, String Dname) {}
record Person(String name, int age,Address address) {}

public class Configuration_Beans
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
			return new Person("Reddy", 23,new Address("PSP", "KDP"));
	}
	@Bean
	public Person person2MethodCall()
	{
			return new Person(name(),age(),address());
	}
	@Bean
	public Person person3Parameters(String name, int age, Address address3)
	{
			return new Person(name,age, address3);
	}
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address)
	{
			return new Person(name,age, address);
	}
	
	@Bean
	public Person person5Parameters(String name, int age, @Qualifier("address3qualifier")Address address)
	{
			return new Person(name,age, address);
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address()
	{
			return new Address("PSP", "KDP");
	}
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3()
	{
			return new Address("Vellatur", "KDP......");
	}
	
}
