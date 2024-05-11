package com.ramesh9705.classDependency;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class DependencyInjectionClassApplication {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(DependencyInjectionClassApplication.class);
			
		Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		System.out.println(context.getBean(MainDependency.class));
	}

}
