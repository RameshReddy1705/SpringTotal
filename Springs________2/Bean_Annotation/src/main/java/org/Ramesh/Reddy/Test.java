package org.Ramesh.Reddy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext("org.Ramesh.Reddy");
		Car c= context.getBean("myCar",Car.class);
		c.start();
		c.pickup();
	}
}
