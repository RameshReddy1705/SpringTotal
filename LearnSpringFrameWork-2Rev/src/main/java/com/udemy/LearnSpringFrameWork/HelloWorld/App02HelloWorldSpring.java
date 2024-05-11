package com.udemy.LearnSpringFrameWork.HelloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;import ch.qos.logback.core.net.SyslogOutputStream;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1: Launch aspring context
		try (var context= new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);)
		{
			
			
			//2: Configuration the spring that we want spring to manage -@Configuration
			
			//Hello world configuration - @Configuration
			//name - @Bean
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCal"));
			System.out.println(context.getBean("RameshAddress"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person4Qualifier"));
			
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println );
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
