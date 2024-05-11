package org.ramesh.user__app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.ramesh.user__app.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao
{
	@Autowired
	EntityManager manager;
	
	public User SaveUser(User user)
	{
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
		return user;
		
	}
	public User UpdateUser(User user)
	{
		return user;
		
	}
	public User getUserById(int id)
	{
		return null;
		
	}
	public boolean deleteUser(int id)
	{
		return false;
		
	}
	public List<User> findAllUsers()
	{
		return null;
		
	}
	public User verifyUser(long Phone,String password)
	{
		return null;
		
	}
}
