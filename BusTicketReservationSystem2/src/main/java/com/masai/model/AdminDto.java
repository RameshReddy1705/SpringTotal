//package com.masai.model;
//
//import javax.validation.constraints.NotNull;
//
//import lombok.Data;
//
//@Data
//public class AdminDto {
//	@NotNull(message ="Username cannot be null.")
//	private String userName;
//	@NotNull(message ="Password cannot be null.")
//	private String password;
//	public AdminDto(@NotNull(message = "Username cannot be null.") String userName,
//			@NotNull(message = "Password cannot be null.") String password) {
//		super();
//		this.userName = userName;
//		this.password = password;
//	}
//	public AdminDto() {
//		super();
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	@Override
//	public String toString() {
//		return "AdminDto [userName=" + userName + ", password=" + password + "]";
//	}
//	
//	
//}
