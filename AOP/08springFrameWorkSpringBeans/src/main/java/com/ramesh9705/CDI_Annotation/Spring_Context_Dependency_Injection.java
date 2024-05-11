package com.ramesh9705.CDI_Annotation;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class Spring_Context_Dependency_Injection
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring_Context_Dependency_Injection.class);
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		
		System.out.println(context.getBean(BusinessDataService.class).getDataService());

		
		
	}
}
