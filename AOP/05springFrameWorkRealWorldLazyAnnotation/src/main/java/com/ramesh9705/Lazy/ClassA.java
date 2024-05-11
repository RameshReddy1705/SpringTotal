package com.ramesh9705.Lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassA
{
	ClassB bClass;

	public ClassA(ClassB bClass) {
		super();
		System.out.println("Reddy----");
		this.bClass = bClass;
	}
	public void Reddy()
	{
		System.out.println("Ramesh");
	}
}
