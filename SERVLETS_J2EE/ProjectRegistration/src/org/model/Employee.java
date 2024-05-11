package org.model;

public class Employee
{
	private int id;
	private String name,dept;
	private int perc;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getPerc() {
		return perc;
	}
	public void setPerc(int perc) {
		this.perc = perc;
	}
	
}
