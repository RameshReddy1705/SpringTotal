package org.jsp.configg.service;

import java.util.List;

import org.jsp.configg.dao.UserDao;
import org.jsp.configg.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService 
{
	@Autowired
	private UserDao dao;
	
	
	public User SaveUser(User user)
	{
		
		return dao.SaveUer(user);
		
	}
	public User UpdateUser(User user)
	{
		return dao.update(user);
	}
	
	public List<User> FindUser()
	{
		return dao.findAllUSer();
	}
	
	public User verifyUser(long phone,String Password)
	{
		return dao.VerifyUser(phone, Password);
	}
	
	public Boolean deleteUser(int id)
	{
		return dao.DeleteByID(id);
	}
	

}
