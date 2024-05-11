package com.example.springFrameWorkConfigurations.componenetsBean;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springFrameWorkConfigurations.componenets.Game.GameConsole;
import com.example.springFrameWorkConfigurations.componenets.Game.GameRunner;

public class ComponentConfigurationClassApplication {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Configuration_Beans.class);
		context.getBean(GameConsole.class).level01();;
		context.getBean(GameRunner.class).run();;

	}

}
