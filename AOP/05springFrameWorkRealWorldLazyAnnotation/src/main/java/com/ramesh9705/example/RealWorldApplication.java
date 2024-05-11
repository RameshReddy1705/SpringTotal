package com.ramesh9705.example;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class RealWorldApplication {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(RealWorldApplication.class);
			
		Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		System.out.println(context.getBean(Business.class).findMax());
	}

}
