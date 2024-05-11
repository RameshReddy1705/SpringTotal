package com.udemy.LearnSpringFrameWork.Example.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan

public class RealWorldSpringContexLauncher {
	
	
	
	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(RealWorldSpringContexLauncher.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculationSrevice.class).findMax());
		} 
		
	}

}
