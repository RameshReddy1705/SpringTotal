package com.Ramesh.Jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class JpaCommanad implements CommandLineRunner
{
	private Jparepository jparepository;
	@Override
	public void run(String... args) throws Exception {
		jparepository.insert(new PersonData(1,"Ramesh","Kdp","AP"));
		jparepository.deleteById(1);
		System.out.println(jparepository.findById(1));
		
	}
	
}
