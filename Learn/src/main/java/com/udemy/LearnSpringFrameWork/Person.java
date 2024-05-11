package com.udemy.LearnSpringFrameWork;

import com.udemy.Learn.simple.Bike;
import com.udemy.Learn.simple.Car;
import com.udemy.Learn.simple.Ride;

public class Person
{
	public static void main(String[] args)
	{
		Bike p=new Bike();
		//Car p=new Car();
		Ride r=new Ride(p);
		r.run();
	}
}
