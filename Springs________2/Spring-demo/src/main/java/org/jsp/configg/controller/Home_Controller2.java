package org.jsp.configg.controller;

import javax.servlet.http.HttpSession;

import org.jsp.configg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home_Controller2 {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/Logout")
	public String Logout(HttpSession session,Model m)
	{
		session.invalidate();
		return "login";
		
	}
	
	@RequestMapping("/delete")
	public String Delete(HttpSession session,Model m, @RequestParam int id)
	{
		service.deleteUser(id);
		session.invalidate();
		m.addAttribute("message","user deleted");
		return "dispaly";
		
	}

}
