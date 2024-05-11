package com.udemy.LearnSpringFrameWork.XML.Configuration;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.udemy.LearnSpringFrameWork.game.GameRunner;


public class XmlConfigurationSipmleSpringContexLauncher {
	
	
	
	public static void main(String[] args)
	{
		try(var context=new ClassPathXmlApplicationContext("Config.xml");)
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println(context.getBean("name"));
		} 
		
	}

}
