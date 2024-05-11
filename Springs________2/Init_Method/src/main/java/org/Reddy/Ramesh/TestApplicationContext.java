package org.Reddy.Ramesh;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("Demo.xml");
		context.close();
	}
}
