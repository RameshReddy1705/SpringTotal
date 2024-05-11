package org.ramesh9705.service;

import org.ramesh9705.exception.LogInException;
import org.ramesh9705.model.LogInDto;

public interface UserLogInService {

	String logInHandle(LogInDto logInDto) throws LogInException;

	String logOutHandle(String key) throws LogInException;

}
