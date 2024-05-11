package org.ramesh9705.serviceImp;

import java.time.LocalDateTime;
import java.util.Optional;

import org.ramesh9705.exception.LogInException;
import org.ramesh9705.model.Admin;
import org.ramesh9705.model.AdminDto;
import org.ramesh9705.model.CurrentUserSession;
import org.ramesh9705.repository.SessionRepo;
import org.ramesh9705.service.AdminLogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.utility.RandomString;
@Service
public class AdminLonInServiceImp implements AdminLogInService
{
	@Autowired
	private SessionRepo sessionRepo;

	@Override
	public String logInAdmin(AdminDto adminDto) throws LogInException
	{
		Admin admin = new Admin();
		if(!admin.userName.equalsIgnoreCase(adminDto.getUserName()))
		{
			throw new LogInException("Please Enter a Valid User Name");
		}
		Optional<CurrentUserSession> validUserSessionOpt = sessionRepo.findById(admin.id);
		if(validUserSessionOpt.isPresent())
		{
			throw new LogInException("Admin already Logged in with this Username");
		}
		if(admin.password.equals(adminDto.getPassword()))
		{
			String key = RandomString.make(6);
			CurrentUserSession currentUserSession = new CurrentUserSession(admin.id,"admin",key,LocalDateTime.now());
			sessionRepo.save(currentUserSession);
			return currentUserSession.toString();
		}
		else {
			throw new LogInException("Please Enter a valid Password");
		}
	}

	@Override
	public String logOutAdmin(String key) throws LogInException
	{
		CurrentUserSession validUserSession = sessionRepo.findByUserUniqueId(key);
		
		if(validUserSession==null)
		{
			throw new LogInException("Admin not logged in with this Username.");
		}
		sessionRepo.delete(validUserSession);
		return "LogOut Successfully Done";
	}
	
}
