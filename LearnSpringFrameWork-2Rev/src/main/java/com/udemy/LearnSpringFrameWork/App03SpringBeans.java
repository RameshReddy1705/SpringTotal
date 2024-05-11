package com.udemy.LearnSpringFrameWork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemy.LearnSpringFrameWork.game.GameConsole;
import com.udemy.LearnSpringFrameWork.game.GameRunner;
import com.udemy.LearnSpringFrameWork.game.PacMan;

public class App03SpringBeans {

	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(GamingConfiguration.class);)
		{

			context.getBean(GameConsole.class).up();
			context.getBean(GameRunner.class).run();
		} 
		
	}

}
