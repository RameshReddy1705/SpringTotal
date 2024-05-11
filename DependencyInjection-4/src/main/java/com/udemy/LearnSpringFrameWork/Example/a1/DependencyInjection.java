package com.udemy.LearnSpringFrameWork.Example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class YourBusinessClass
{
	Dependency01 dependency01;
	Dependency02 dependency02;
	//@Autowired
	public YourBusinessClass(Dependency01 dependency01, Dependency02 dependency02) {
		super();
		System.out.println("Set constructor -01");
		this.dependency01 = dependency01;
		this.dependency02 = dependency02;
	}
//	@Autowired
//	public void setDependency01(Dependency01 dependency01) {
//		System.out.println("Set dependency -01");
//		this.dependency01 = dependency01;
//	}
//	@Autowired
//	public void setDependency02(Dependency02 dependency02) {
//		System.out.println("Set dependency -02");
//		this.dependency02 = dependency02;
//	}
	public String toString()
	{
		return "Using"+dependency01+"And"+dependency02;
	}
}
@Component 
class Dependency01
{
	
}
@Component
class Dependency02
{
	
}

@Configuration
@ComponentScan

public class DependencyInjection {
	
	
	
	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(DependencyInjection.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
		} 
		
	}

}
