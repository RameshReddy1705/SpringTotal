package org.ramesh9705.model;

import javax.validation.constraints.NotNull;

public class AdminDto
{
	@NotNull(message = "UserName cannot be null.")
	private String userName;
	@NotNull(message = "Password cannot be null.")
	private String password;
	public AdminDto() {
		super();
	}
	public AdminDto(@NotNull(message = "UserName cannot be null.") String userName,
			@NotNull(message = "Password cannot be null.") String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminDto [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
