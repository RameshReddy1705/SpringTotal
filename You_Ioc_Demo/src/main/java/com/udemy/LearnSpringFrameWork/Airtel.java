package com.udemy.LearnSpringFrameWork;

public class Airtel implements Sim
{
	@Override
	public void insert()
	{
		System.out.println("insert sim Airtel");
	}
	@Override
	public void calling()
	{
		System.out.println("Calling in Airtel");
	}
	@Override
	public void Data()
	{
		System.out.println("Data using in Airtel");
	}
}
