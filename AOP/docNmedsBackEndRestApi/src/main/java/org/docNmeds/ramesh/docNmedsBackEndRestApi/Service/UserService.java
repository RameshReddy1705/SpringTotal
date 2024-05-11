package org.docNmeds.ramesh.docNmedsBackEndRestApi.Service;

import org.docNmeds.ramesh.docNmedsBackEndRestApi.Controller.LogInResponse;
import org.docNmeds.ramesh.docNmedsBackEndRestApi.Dto.DocNmedsUserDto;
import org.docNmeds.ramesh.docNmedsBackEndRestApi.Dto.LogInDto;

public interface UserService
{

	String addUser(DocNmedsUserDto docNmedsUserDto);

	LogInResponse logInUser(LogInDto logInDto);
	
}
