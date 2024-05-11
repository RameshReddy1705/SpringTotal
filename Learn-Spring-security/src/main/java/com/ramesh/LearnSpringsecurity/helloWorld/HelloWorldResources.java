package com.ramesh.LearnSpringsecurity.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldResources
{
	@GetMapping("/hello-ramesh")
	public String HelloWorld()
	{
		return "Hello Ramesh";
	}
}
