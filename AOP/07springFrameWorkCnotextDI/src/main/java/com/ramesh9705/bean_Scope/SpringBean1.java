package com.ramesh9705.bean_Scope;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class SpringBean1
{
	SpringBean2 bean2;

	public SpringBean1(SpringBean2 bean2) {
		super();
		this.bean2 = bean2;
		System.out.println("All dependency Are done....");
		
	}
	@PostConstruct
	public void dep()
	{
		bean2.Alldone();
	}
	@PreDestroy
	public void clean()
	{
		System.out.println("CleanUp");
	}
	
}
