package com.ramesh9705.SpringSecurity.Hello;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class SpringSecurityPlayResourcesCsrf
{
	@GetMapping("/csrf-token")
	public CsrfToken retriveCsrfToken( HttpServletRequest request)
	{
		return (CsrfToken) request.getAttribute("_csrf");
	}
}
