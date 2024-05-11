package org.docNmeds.ramesh.docNmedsBackEndRestApi.Service.Imp;

import java.util.Optional;

import org.docNmeds.ramesh.docNmedsBackEndRestApi.Controller.LogInResponse;
import org.docNmeds.ramesh.docNmedsBackEndRestApi.Dto.DocNmedsUserDto;
import org.docNmeds.ramesh.docNmedsBackEndRestApi.Dto.LogInDto;
import org.docNmeds.ramesh.docNmedsBackEndRestApi.Entity.DocNmedsUser;
import org.docNmeds.ramesh.docNmedsBackEndRestApi.Repo.UserRepo;
import org.docNmeds.ramesh.docNmedsBackEndRestApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService
{
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addUser(DocNmedsUserDto docNmedsUserDto) 
	{
		DocNmedsUser docNmedsUser = new DocNmedsUser(
				docNmedsUserDto.getId(),
				docNmedsUserDto.getFullName(),
				docNmedsUserDto.getMobileNumber(),
				docNmedsUserDto.getGender(),
				docNmedsUserDto.getEmail(),
				this.passwordEncoder.encode(docNmedsUserDto.getPassword())
				);
		userRepo.save(docNmedsUser);
		return docNmedsUser.getFullName();
	}

	@Override
	public LogInResponse logInUser(LogInDto logInDto)
	{
		String msg ="";
		DocNmedsUser docNmedsUser = userRepo.findByEmail(logInDto.getEmail());
		if(docNmedsUser!=null)
		{
			String password = logInDto.getPassword();
			String encodedPassword = docNmedsUser.getPassword();
			boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			if(isPwdRight)
			{
				Optional<DocNmedsUser> docNmedsUser1 = userRepo.findByEmailAndPassword(logInDto.getEmail(),encodedPassword);
				if(docNmedsUser1.isPresent())
				{
					return new LogInResponse("Log IN Success", true);
				}
				else {
					return new LogInResponse("Log IN Failed",false);
				}
			}
			else {
				return new LogInResponse("Password Not Match", false);
			}
		}else {
			return new LogInResponse("Email Not Exist...",false);
		}
		
	}
	
}
