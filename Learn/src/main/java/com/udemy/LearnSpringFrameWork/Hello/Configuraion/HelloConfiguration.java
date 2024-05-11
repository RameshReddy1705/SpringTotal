package com.udemy.LearnSpringFrameWork.Hello.Configuraion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(int id,String name,int num,Address adress) {};
record Address (String dist, String dono) {};
//record Country (String country) {};
@Configuration
public class HelloConfiguration
{
	@Bean
	public int id()
	{
		return 1;
	}
	@Bean
	public String name()
	{
		return "Ramesh";
	}
	@Bean
	public int num()
	{
		return 9705;
	}
	
	@Bean
	public Person person()
	{
		Person person=new Person(1,"Siva",9666,new Address("Kadapa","Ap"));
		return person;
	}
	
	@Bean
	public Person person2()
	{
		Person person=new Person(id(),name(),num(),address());
		return person;
	}
	
	@Bean
	public Person person3Parameter(int id,String name,int num,Address address3)
	{
		Person person=new Person(id,name,num,address3);
		return person;
	}
	@Primary
	@Bean
	public Person person4Parameter(int id,String name,int num,Address address)
	{
		Person person=new Person(id,name,num,address);
		return person;
	}
	
	@Bean
	public Person person5qualifier(int id,String name,int num,@Qualifier("address2qualifier")Address address)
	{
		Person person=new Person(id,name,num,address);
		return person;
	}
	
	@Bean(name="address2")
	@Qualifier("address2qualifier")
	public Address address()
	{
		Address address=new Address("Siva","1/76");
		return address;
	}
	@Primary
	@Bean(name="address3")
	public Address address3()
	{
		Address address=new Address("....",".....");
		return address;
	}
	
	
	
	
	
	
	


	
	
	
	
}
