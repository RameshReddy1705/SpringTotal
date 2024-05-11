package org.ramesh.user__app.service;

import java.util.List;

import org.ramesh.user__app.dao.UserDao;
import org.ramesh.user__app.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
	@Autowired
	private UserDao dao;
	
	public User SaveUser(User user)
	{
		return dao.SaveUser(user);
	}
	public User updateUser(User user)
	{
		return dao.UpdateUser(user);
	}
	public User getUserById(int id)
	{
		return dao.getUserById(id);
	}
	public boolean deleteUser(int id)
	{
		return dao.deleteUser(id);
		
	}
	public List<User> finAllUsers()
	{
		return dao.findAllUsers();
	}
	public User verifyUser(long phone, String password)
	{
		return dao.verifyUser(phone, password);
	}
}
