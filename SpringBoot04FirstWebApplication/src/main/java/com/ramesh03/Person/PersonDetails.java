package com.ramesh03.Person;

public class PersonDetails
{
	private int id;
	private String name;
	private String surName;
	private long phone;
	private String address;
	public PersonDetails(int id, String name, String surName, long phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.phone = phone;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PersonDetails [id=" + id + ", name=" + name + ", surName=" + surName + ", phone=" + phone + ", address="
				+ address + "]";
	}
	
	
}
