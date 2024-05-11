package com.ramesh9705.Lazy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class LazyAnnotationApplication {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(LazyAnnotationApplication.class);
			
		Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		context.getBean(ClassA.class).Reddy();
	}

}
