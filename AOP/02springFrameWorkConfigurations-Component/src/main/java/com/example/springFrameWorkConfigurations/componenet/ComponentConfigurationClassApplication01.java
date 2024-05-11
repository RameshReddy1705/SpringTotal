package com.example.springFrameWorkConfigurations.componenet;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.springFrameWorkConfigurations.componenets.Game.GameConsole;
import com.example.springFrameWorkConfigurations.componenets.Game.GameRunner;
@Configuration
@ComponentScan("com.example.springFrameWorkConfigurations")
public class ComponentConfigurationClassApplication01 {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(ComponentConfigurationClassApplication01.class);
		context.getBean(GameConsole.class).level01();
		context.getBean(GameRunner.class).run();;
		
	}

}
