package org.Ramesh.Reddy;

import org.springframework.stereotype.Component;

@Component(value="myCar")
public class Car
{
	public void start()
	{
		System.out.println("Caris started................");
		System.out.println("Riding on the way...........");
	}
	public void pickup()
	{
		System.out.println("Pick up passenger..............");
	}
}
