package com.ramesh9705.learnOAuth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld
{
	@GetMapping("/")
	public String HelloWorld(Authentication authentication)
	{
		System.out.println(authentication);
		System.out.println(authentication.getPrincipal());
		return "Ramesh Reddy";
	}
}
