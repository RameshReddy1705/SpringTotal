package com.ramesh9705.SpringSecurity.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResources
{
	@GetMapping("/hello-ramesh")
	public String Hello()
	{
		return "Ramesh";
	}
}
