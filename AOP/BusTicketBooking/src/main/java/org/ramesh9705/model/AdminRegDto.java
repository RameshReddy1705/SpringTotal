package org.ramesh9705.model;

public class AdminRegDto
{
	private Integer adminId;
	private String adminName;
	private long adminPhoneNumber;
	private String adminGmail;
	private String userName;
	private String password;
	public AdminRegDto() {
		super();
	}
	public AdminRegDto(Integer adminId, String adminName, long adminPhoneNumber, String adminGmail, String userName,
			String password) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPhoneNumber = adminPhoneNumber;
		this.adminGmail = adminGmail;
		this.userName = userName;
		this.password = password;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public long getAdminPhoneNumber() {
		return adminPhoneNumber;
	}
	public void setAdminPhoneNumber(long adminPhoneNumber) {
		this.adminPhoneNumber = adminPhoneNumber;
	}
	public String getAdminGmail() {
		return adminGmail;
	}
	public void setAdminGmail(String adminGmail) {
		this.adminGmail = adminGmail;
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
		return "AdminReg [adminId=" + adminId + ", adminName=" + adminName + ", adminPhoneNumber=" + adminPhoneNumber
				+ ", adminGmail=" + adminGmail + ", userName=" + userName + ", password=" + password + "]";
	}
}
