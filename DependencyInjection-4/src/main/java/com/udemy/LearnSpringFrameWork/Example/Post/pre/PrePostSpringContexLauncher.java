package com.udemy.LearnSpringFrameWork.Example.Post.pre;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class Ramesh
{
	private Siva siva;

	public Ramesh(Siva siva) {
		super();
		this.siva = siva;
		System.out.println("All dependencies are done");
	}
	@PostConstruct
	public void initilize()
	{
		siva.getReady();
	}
	@PreDestroy
	public void cleanUp()
	{
		System.out.println("CleanUp");
	}
}
@Component
class Siva
{

	public void getReady()
	{
		System.out.println("SomeLogic");
	}
	
}


@Configuration
@ComponentScan

public class PrePostSpringContexLauncher {
	
	
	
	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(PrePostSpringContexLauncher.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		} 
		
	}

}
