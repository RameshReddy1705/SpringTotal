package org.ramesh9705.SpringSecurity02.JWT;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;


public class JwtAuthenticationResources
{
	@PostMapping("/authenticate")
	public Authentication authentication(Authentication authentication)
	{
		return authentication;
	}
}
