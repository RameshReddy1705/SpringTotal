package com.ramesh9705.Reservation.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ramesh9705.Reservation.Dto.User;
import com.ramesh9705.Reservation.Repository.UserRepository;

@Repository
public class UserDao
{
	@Autowired
	public UserRepository userRepository;
	
	public User saveUser(User user)
	{
		return userRepository.save(user);
	}

	public Optional<User> findById(int id)
	{
		return userRepository.findById(id);
	}

	public Optional<User> verifyByEmail(String email, String password)
	{
		return userRepository.verifyByEmail(email, password);
	}

	public User updateUser(User user)
	{
		return userRepository.save(user);
	}

}
