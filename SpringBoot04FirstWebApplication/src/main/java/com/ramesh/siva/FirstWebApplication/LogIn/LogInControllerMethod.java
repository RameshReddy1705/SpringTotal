package com.ramesh.siva.FirstWebApplication.LogIn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
//@SessionAttributes("name")
public class LogInControllerMethod
{
	private AuthenticationLogin authentication;
	public LogInControllerMethod(AuthenticationLogin authentication) {
		super();
		this.authentication = authentication;
	}
	@RequestMapping(value="LogIn",method = RequestMethod.GET)
	public String logInPage()
	{
		return"LogInPage";
	}
	
	@RequestMapping(value="LogIn",method = RequestMethod.POST)
	//login?name=Ramesh RequestParam
	public String WelcomePage(@RequestParam String name,
			@RequestParam String password,ModelMap model)
	{
		if(authentication.auth(name, password))
		{
			model.put("name", name);
			model.put("password", password);

			return"WelcomePage";
		}
		model.put("errormessage", "Inavalid Credentials please LogIn in agaian");
		return "LogInPage";
	}
}
