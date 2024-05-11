package com.Ramesh.SpringDataJpa;

import jakarta.persistence.Entity;

@Entity
public class PersonData
{
	private int id;
	private String name;
	private String dist;
	private String state;
	public PersonData(int id, String name, String dist, String state) {
		super();
		this.id = id;
		this.name = name;
		this.dist = dist;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDist() {
		return dist;
	}
	public String getState() {
		return state;
	}
	@Override
	public String toString() {
		return "PersonData [id=" + id + ", name=" + name + ", dist=" + dist + ", state=" + state + "]";
	}
	
	
}
