package com.ramesh9705.bean_Scope;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class SpringBean
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBean.class);
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
//		System.out.println(context.getBean(SpringBean1.class));
		
		
	}
}
