package com.udemy.Learn.simple;

public class Ride
{
	BikeCar_Console cb;
	public Ride(BikeCar_Console cb)
	{
		this.cb=cb;
	}
	public void run()
	{
		System.out.println(cb+" has been Started........");
		cb.Brand();
		cb.color();
		cb.cc();
		cb.roof();
	}
	
}
