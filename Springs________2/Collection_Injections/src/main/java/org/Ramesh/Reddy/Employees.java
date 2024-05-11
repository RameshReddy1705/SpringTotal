package org.Ramesh.Reddy;

import java.util.List;

import java.util.Map;
import java.util.Set;

public class Employees
{
	List<String> names;
	Set<Integer> number;
	Map<String, Integer> details;
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Set<Integer> getNumber() {
		return number;
	}
	public void setNumber(Set<Integer> number) {
		this.number = number;
	}
	public Map<String, Integer> getDetails() {
		return details;
	}
	public void setDetails(Map<String, Integer> details) {
		this.details = details;
	}
	
}
