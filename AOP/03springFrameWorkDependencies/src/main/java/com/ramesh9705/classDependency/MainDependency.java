package com.ramesh9705.classDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDependency
{
	@Autowired
	Dependency1 dependency1;
	@Autowired
	Dependency2 dependency2;
//	Constructor Dependency
//	public MainDependency(Dependency1 dependency1, Dependency2 dependency2) {
//		super();
//		this.dependency1 = dependency1;
//		this.dependency2 = dependency2;
//	}
	//  Setter Injection
//	@Autowired
//	public Dependency1 getDependency1() {
//		return dependency1;
//	}
//	@Autowired
//	public Dependency2 getDependency2() {
//		return dependency2;
//	}
	
	

	@Override
	public String toString() {
		return "MainDependency [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}



	
	
	
	
}
