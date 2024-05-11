package com.example.springFrameWorkConfigurations.componenets.Game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CarGame")
public class CarGame implements GameConsole
{
	public void level01()
	{
		System.out.println("Level  - 1 - Completed ");
	}
	public void level02()
	{
		System.out.println("Level  - 2 - Completed ");
	}
	public void level03()
	{
		System.out.println("Level  - 3 - Completed ");
	}
	public void level04()
	{
		System.out.println("Level  - 4 - Completed ");
	}
	public void level05()
	{
		System.out.println("Level  - 5 - Completed ");
	}
}
