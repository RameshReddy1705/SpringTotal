package ramesh9705.springBootWebApplication.LogIncontroller;

import org.springframework.stereotype.Service;

@Service
public class Auth
{
	public boolean authenticate(String username,String password)
	{
		boolean isusernameValid=username.equalsIgnoreCase("Ramesh");
		boolean ispasswordValid=password.equalsIgnoreCase("9705");
		return isusernameValid&&ispasswordValid;
		
	}
}
