package com.ramesh9705.LoginAndRegistration.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Login_Registration")
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeid;
	private String employeename;
	private String email;
	private String password;
	public Employee(int employeeid, String employeename, String email, String password) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.email = email;
		this.password = password;
	}
	public Employee() {
		super();
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
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
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
}
