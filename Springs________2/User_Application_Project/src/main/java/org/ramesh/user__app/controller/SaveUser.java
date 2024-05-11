package org.ramesh.user__app.controller;

import org.ramesh.user__app.UserConfig;
import org.ramesh.user__app.dto.User;
import org.ramesh.user__app.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveUser
{
	public static void main(String[] args)
	{
		User u=new User();
		u.setName("Ramesh");
		u.setPassword("Reddy");
		u.setPhone(123456);
		
		ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
		UserService service=context.getBean(UserService.class);
		service.SaveUser(u);
	}
}
