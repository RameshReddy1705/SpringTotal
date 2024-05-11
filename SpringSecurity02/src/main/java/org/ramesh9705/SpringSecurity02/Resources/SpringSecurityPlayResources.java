package org.ramesh9705.SpringSecurity02.Resources;

import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class SpringSecurityPlayResources
{
	
	@GetMapping("/csrf-token")
	public CsrfToken csrfToken( HttpServletRequest request)
	{
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
}

