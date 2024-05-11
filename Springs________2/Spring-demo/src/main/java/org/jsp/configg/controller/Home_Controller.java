package org.jsp.configg.controller;

import org.jsp.configg.dto.User;
import org.jsp.configg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes({"u"})
public class Home_Controller 
{
	@Autowired
	public UserService service ;
	
	@RequestMapping("/load")
	public ModelAndView loadd(ModelAndView view,int choice)
	{
		if(choice==1)
		{
			view.setViewName("register");
			
		}
		if(choice==2)
		{
			view.setViewName("edit");
		}
		
		view.addObject("user",new User());
		return view;
	}
	
	@RequestMapping("/reg")
	public String Save(@ModelAttribute User user,ModelAndView view)
	{
		
	      User us=service.SaveUser(user);
	      view.addObject("message","user saved with ID:-"+us.getId());
	      
		return "dispaly";
		
	}
	
	@RequestMapping("/loginpage")
	public String Login(@RequestParam long phone,@RequestParam String password,Model m)
	{
		
		User user=service.verifyUser(phone, password);
		
		if(user!=null)
		{
			m.addAttribute("u",user);           //500 users  -> A login 
			return "home";
		}
		else {
			return "ifailed";
		}
		
	}
	
	@RequestMapping("/relogin")
	public String relog()
	{
		return "login";
	}
	
	
	@RequestMapping("/editt")
	public String Updateuser(@ModelAttribute User user, ModelAndView view)
	{
		
	user=service.UpdateUser(user);
		view.addObject("message","user updated with id:-"+user.getId());
		
		return "dispaly";
		
	}
	
	@RequestMapping("/profile")
	public String profieuser()
	{
		return "details";
		
	}
	
	
	

}
