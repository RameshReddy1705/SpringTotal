package com.udemy.LearnSpringFrameWork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class You_Ioc_Container {

	public static void main(String[] args) {
		System.out.println(".....");
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		System.out.println("----");
		Sim s=context.getBean("sim", Sim.class);
		s.insert();
		s.calling();
		s.Data();
	}

}
