package org.Ramesh.Reddy;

import org.springframework.stereotype.Component;

@Component(value = "myCar")
public class Car implements Vehicle
{
	public void start()
	{
		System.out.println("Car has been started..........");
	}
}
