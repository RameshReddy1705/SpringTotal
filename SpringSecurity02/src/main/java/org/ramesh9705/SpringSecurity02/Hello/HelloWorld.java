package org.ramesh9705.SpringSecurity02.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld
{
	@GetMapping("/")
	public String hello()
	{
		return "Ramesh Reddy........................";
	}
}
