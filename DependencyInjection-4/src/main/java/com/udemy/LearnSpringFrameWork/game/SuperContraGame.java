package com.udemy.LearnSpringFrameWork.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GameConsole
{
	public void up()
	{
		System.out.println("up");
	}
	public void down()
	{
		System.out.println("Go down");
	}
	public void left()
	{
		System.out.println("Go Back");
	}
	public void right()
	{
		System.out.println("Shoot");
	}
}
