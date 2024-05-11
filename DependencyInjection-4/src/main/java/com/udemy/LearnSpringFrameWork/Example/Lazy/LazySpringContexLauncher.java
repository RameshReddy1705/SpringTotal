package com.udemy.LearnSpringFrameWork.Example.Lazy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
class ClassA
{
	
}
@Component
@Lazy
class ClassB
{
	private ClassA classA;

	public ClassB(ClassA classA) {
		super();
		System.out.println("Lazy Spring started late....................");
		this.classA = classA;
	}
	public void dosome()
	{
		System.out.println("DO SOME");
	}	
}
@Configuration
@ComponentScan
public class LazySpringContexLauncher {	
	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(LazySpringContexLauncher.class);)
		{
			System.out.println("Started ..........");
			System.out.println(context.getBean(ClassB.class));
		} 
		
	}

}
