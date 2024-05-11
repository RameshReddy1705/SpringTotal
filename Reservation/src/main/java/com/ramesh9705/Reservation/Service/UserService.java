package com.ramesh9705.Reservation.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ramesh9705.Reservation.Dao.UserDao;
import com.ramesh9705.Reservation.Dto.ResponseStructure;
import com.ramesh9705.Reservation.Dto.User;
import com.ramesh9705.Reservation.Exception.IdNotFoundException;
import com.ramesh9705.Reservation.Exception.InvaildCredentialException;

@Service
public class UserService
{
	@Autowired
	public UserDao userDao;
	public ResponseEntity<ResponseStructure<User>> saveUser(User user)
	{
		ResponseStructure<User> str = new ResponseStructure<User>();
		str.setBody(userDao.saveUser(user));
		str.setMessage("Sucessfully saved");
		str.setCode(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<User>>(str,HttpStatus.ACCEPTED);
	}
	public ResponseEntity<ResponseStructure<User>> updateUser(User user)
	{
		ResponseStructure<User> str = new ResponseStructure<User>();
		str.setBody(userDao.updateUser(user));
		str.setMessage("Successfully Updated");
		str.setCode(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<User>>(str,HttpStatus.ACCEPTED);
	}
	public ResponseEntity<ResponseStructure<User>> findById(int id)
	{
		ResponseStructure<User> str = new ResponseStructure<User>();
		Optional<User> recordData=userDao.findById(id);
		if(recordData.isPresent())
		{
			str.setBody(recordData.get());
			str.setMessage("Successfully Data Fetched");
			str.setCode(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<User>>(str,HttpStatus.FOUND);
		}
		throw new IdNotFoundException();
		
	}
	public ResponseEntity<ResponseStructure<User>> verifyByEmail(String email, String password)
	{
		ResponseStructure<User> str= new ResponseStructure<User>();
		Optional<User> recordData=userDao.verifyByEmail(email, password);
		if(recordData.isPresent())
		{
			str.setBody(recordData.get());
			str.setMessage("Successfully User Verified");
			str.setCode(HttpStatus.ACCEPTED.value());
			return new ResponseEntity<ResponseStructure<User>>(str, HttpStatus.ACCEPTED);
			
		}
		throw new InvaildCredentialException();
	}
	
}
