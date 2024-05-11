package org.ramesh9705.serviceImp;

import java.time.LocalDateTime;
import java.util.Optional;

import org.ramesh9705.exception.LogInException;
import org.ramesh9705.model.CurrentUserSession;
import org.ramesh9705.model.LogInDto;
import org.ramesh9705.model.User;
import org.ramesh9705.repository.SessionRepo;
import org.ramesh9705.repository.UserRepo;
import org.ramesh9705.service.UserLogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.utility.RandomString;

@Service
public class UserLogInServiceImpl implements UserLogInService
{
	@Autowired
	private UserRepo userRepo;
	
//	@Autowired
//	private CustomerSessionRepo customerSessionRepo;
	@Autowired
	private SessionRepo sessionRepo;

	@Override
	public String logInHandle(LogInDto logInDto) throws LogInException
	{
		User u = userRepo.findByUserName(logInDto.getUserName());
		if(u == null)
		{
			throw new LogInException("Please Enter a valid username.");
		}
		Optional<CurrentUserSession> validSession = sessionRepo.findById(u.getUserLoginId());
		if(validSession.isPresent())
		{
			throw new LogInException("User already Logged in with this username.");
			
		}
		if(u.getPassword().equals(logInDto.getPassword()))
		{
			String key = RandomString.make(6);
			CurrentUserSession currentSession = new CurrentUserSession(u.getUserLoginId(), "User", key, LocalDateTime.now());
			sessionRepo.save(currentSession);
			return currentSession.toString();
		}
		else {
			throw new LogInException("Please Enter a valid password");
		}
	}

	@Override
	public String logOutHandle(String key) throws LogInException
	{
		CurrentUserSession validSession = sessionRepo.findByUserUniqueId(key);
		if(validSession == null)
		{
			throw new LogInException("User not logged in with this username.");
		}
		sessionRepo.delete(validSession);
		return "Log Out SuccessFully Done";
	}

}
