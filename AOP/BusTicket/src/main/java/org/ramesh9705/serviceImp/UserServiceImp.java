package org.ramesh9705.serviceImp;

import java.util.Optional;

import org.ramesh9705.exception.UserException;
//import org.ramesh9705.model.CustomerCurrentSession;
import org.ramesh9705.model.User;
//import org.ramesh9705.repository.CustomerSessionRepo;
import org.ramesh9705.repository.UserRepo;
import org.ramesh9705.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService
{
	@Autowired
	private UserRepo userRepo;
	
//	@Autowired
//	private CustomerSessionRepo customerSessionRepo;
	
	@Override
	public User addUser(User user) throws UserException
	{
		User u = userRepo.findByUserName(user.getUserName());
		if(u != null)
		{
			throw new UserException("User already exist with this username.");
		}
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user, String key) throws UserException
	{
		return user;
//		CustomerCurrentSession validSession = customerSessionRepo.findByUserUniqueId(key);
//		if(validSession == null)
//		{
//			throw new UserException("Please Provide a valid session key to update ...");
//		}
//		User cur = userRepo.findById(user.getUserLoginId())
//				.orElseThrow(()->new UserException("User with User Id "+user.getUserLoginId()+" does not exist"));
////		if(cur.isEmpty())
////		{
////			throw new UserException("User with User Id "+user.getUserLoginId()+" does not exist");
////			
////		}
//		if(validSession.getType().equalsIgnoreCase("User"))
//		{
//			if(user.getContact() !=null)
//			{
//				cur.setContact(user.getContact());
//			}
//			if(user.getEmail()!=null)
//			{
//				cur.setEmail(user.getEmail());
//			}
//			if(user.getFirstName()!=null)
//			{
//				cur.setFirstName(user.getFirstName());
//			}
//			if (user.getLastName() != null) cur.setLastName(user.getLastName());
//			if (user.getPassword() != null) cur.setPassword(user.getPassword());
//			if (user.getUserName() != null) cur.setUserName(user.getUserName());
//			User saved = userRepo.save(cur);
//			return saved;
//		}
//		if(user.getUserLoginId() == validSession.getUserId())
//		{
//			if (user.getContact() != null) cur.setContact(user.getContact());
//			if (user.getEmail() != null) cur.setEmail(user.getEmail());
//			if (user.getFirstName() != null) cur.setFirstName(user.getFirstName());
//			if (user.getLastName() != null) cur.setLastName(user.getLastName());
//			if (user.getPassword() != null) cur.setPassword(user.getPassword());
//			if (user.getUserName() != null) cur.setUserName(user.getUserName());
//			User saved = userRepo.save(cur);
//			return saved;
//		}
//		else throw new UserException("Access denied.");
	}

}
