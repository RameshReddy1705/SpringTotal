package com.example.springFrameWorkConfigurations.componenets.Game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner
{
	private GameConsole game;

	public GameRunner(@Qualifier("CarGame") GameConsole game)
	{
		super();
		this.game = game;
	}
	
	public void run()
	{
		System.out.println(game);
		game.level01();
		game.level02();
		game.level03();
		game.level04();
		game.level05();
	}
	
}
