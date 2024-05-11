package com.ramesh.siva.FirstWebApplication.LogIn;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationLogin
{
	public boolean auth(String username, String password)
	{
		boolean validUserName=username.equalsIgnoreCase("Ramesh");
		boolean validPassword= password.equalsIgnoreCase("123");
		return validUserName&&validPassword;
	}
}
