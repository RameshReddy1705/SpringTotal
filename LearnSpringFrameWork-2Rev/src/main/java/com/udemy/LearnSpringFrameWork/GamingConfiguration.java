package com.udemy.LearnSpringFrameWork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemy.LearnSpringFrameWork.game.GameConsole;
import com.udemy.LearnSpringFrameWork.game.GameRunner;
import com.udemy.LearnSpringFrameWork.game.PacMan;
@Configuration
public class GamingConfiguration
{
	@Bean
	public GameConsole game()
	{
		PacMan game=new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GameConsole game)
	{
		GameRunner gameRunner=new GameRunner(game);
		return gameRunner;
	}
	
	

}
