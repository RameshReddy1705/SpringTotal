package com.udemy.LearnSpringFrameWork.Hello.Configuraion;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main
{
	public static void main(String[] args)
	{
		var context=new AnnotationConfigApplicationContext(HelloConfiguration.class);
		System.out.println(context.getBean("id"));
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("num"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("person3Parameter"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean("person5qualifier"));
		
//		Arrays.stream(context.getBeanDefinitionNames())
//		.forEach(System.out::println);
		
		
		
		
		
		
	}
}
