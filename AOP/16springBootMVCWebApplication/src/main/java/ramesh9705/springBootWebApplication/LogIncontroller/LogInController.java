package ramesh9705.springBootWebApplication.LogIncontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LogInController
{
	@Autowired
	private Auth auth;
	
	@RequestMapping(value = "-login", method = RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	@RequestMapping(value = "-login", method = RequestMethod.POST)
	public String gowelcomePage(@RequestParam String name, @RequestParam String password, ModelMap map)
	{
		if(auth.authenticate(name, password))
		{
			map.put("name", name);
			return "welcome";
		}
		map.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login";
	}
}
