package org.docNmeds.ramesh.docNmedsBackEndRestApi.Dto;

public class LogInDto
{
	private String email;
	private String password;
	public LogInDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public LogInDto() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LogInDto [email=" + email + ", password=" + password + "]";
	}
	
	
}
