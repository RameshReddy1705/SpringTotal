package com.ramesh03.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService
{
	private static List<PersonDetails> persons = new ArrayList<PersonDetails>();
	static
	{
		persons.add(new PersonDetails(1, "Ramesh", "Gangannagari", 9705582, "Kadapa"));
		persons.add(new PersonDetails(2, "Reddy", "Gangannagari", 9705582, "Kadapa"));
		persons.add(new PersonDetails(3, "Siva", "Gangannagari", 9705582, "Kadapa"));
		persons.add(new PersonDetails(4, "Ramesh Reddy", "Gangannagari", 9705582, "Kadapa"));
	}
	public List<PersonDetails> findByUserName(String username)
	{
		return persons;
		
	}
}
