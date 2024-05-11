package org.Ramesh.Reddy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "myBike")
@Primary
public class Bike implements Vehicle
{
	public void start()
	{
		System.out.println("Car has been started...........");
	}
}
