package com.udemy.LearnSpringFrameWork.Example.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan

public class SipmleSpringContexLauncher {
	
	
	
	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(SipmleSpringContexLauncher.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		} 
		
	}

}
