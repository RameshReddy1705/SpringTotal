package org.ramesh9705.service;

import org.ramesh9705.exception.UserException;
import org.ramesh9705.model.User;

public interface UserService {

	User addUser(User user) throws UserException;

	User updateUser(User user, String key) throws UserException;

}
