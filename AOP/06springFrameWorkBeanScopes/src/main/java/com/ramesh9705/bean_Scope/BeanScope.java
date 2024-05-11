package com.ramesh9705.bean_Scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class BeanScope
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanScope.class);
		System.out.println(context.getBean(ProtypeBeanScope.class));
		System.out.println(context.getBean(ProtypeBeanScope.class));
		System.out.println(context.getBean(ProtypeBeanScope.class));
		
		System.out.println(context.getBean(SingleTonOrNormalBeanscope.class));
		System.out.println(context.getBean(SingleTonOrNormalBeanscope.class));
		
	}
}
