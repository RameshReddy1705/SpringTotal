package com.udemy.LearnSpringFrameWork.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.udemy.LearnSpringFrameWork.game")

public class App03SpringBeans {
	
	
	
	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(App03SpringBeans.class);)
		{

			context.getBean(GameConsole.class).up();
			context.getBean(GameRunner.class).run();
		} 
		
	}

}
