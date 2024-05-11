package com.example.springFrameWorkConfigurations.componenetsBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springFrameWorkConfigurations.componenets.Game.BusGame;
import com.example.springFrameWorkConfigurations.componenets.Game.GameConsole;
import com.example.springFrameWorkConfigurations.componenets.Game.GameRunner;

@Configuration
public class Configuration_Beans
{
	@Bean
	public GameConsole game()
	{
		var game=new BusGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GameConsole game)
	{
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}
}
