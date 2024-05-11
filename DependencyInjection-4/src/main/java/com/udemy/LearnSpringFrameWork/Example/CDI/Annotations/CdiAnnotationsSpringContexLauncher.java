package com.udemy.LearnSpringFrameWork.Example.CDI.Annotations;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;
//@Component
@Named
class Logic
{
	private Business business;

	public Business getBusiness() {
		return business;
	}
	//@Autowired
	@Inject
	public void setBusiness(Business business) {
		System.out.println("Setter Injection");
		this.business = business;
	}
	
}
@Component
class Business
{
	
}


@Configuration
@ComponentScan

public class CdiAnnotationsSpringContexLauncher {
	
	
	
	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(CdiAnnotationsSpringContexLauncher.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		} 
		
	}

}
