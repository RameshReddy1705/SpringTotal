package org.ramesh9705.service;

import org.ramesh9705.exception.LogInException;
import org.ramesh9705.model.AdminDto;

public interface AdminLogInService {

	public String logInAdmin(AdminDto adminDto) throws LogInException;

	public String logOutAdmin(String key) throws LogInException;

}
