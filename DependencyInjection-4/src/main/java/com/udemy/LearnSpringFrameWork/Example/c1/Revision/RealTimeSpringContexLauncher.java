package com.udemy.LearnSpringFrameWork.Example.c1.Revision;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan

public class RealTimeSpringContexLauncher {
	
	
	
	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(RealTimeSpringContexLauncher.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculatorService.class).findMax());
			System.out.println(context.getBean(BusinessCalculatorService.class).findMin());
			
		} 
		
	}

}
