package org.docNmeds.ramesh.docNmedsBackEndRestApi.Dto;

public class DocNmedsUserDto
{
	private int id;
	
	private String fullName;
	private long mobileNumber;
	private String gender;
	private String email;
	private String password;
	
	public DocNmedsUserDto() {
		super();
	}

	public DocNmedsUserDto(int id, String fullName, long mobileNumber, String gender, String email, String password) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
		return "DocNmedsUserDto [id=" + id + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber + ", gender="
				+ gender + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
}
