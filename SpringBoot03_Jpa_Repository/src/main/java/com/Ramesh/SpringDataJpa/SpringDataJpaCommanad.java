package com.Ramesh.SpringDataJpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SpringDataJpaCommanad implements CommandLineRunner
{
	private SparingDataJpa sparingDataJpa;
	@Override
	public void run(String... args) throws Exception {
		sparingDataJpa.save(new PersonData(1,"Ramesh","Kdp","AP"));
//		sparingDataJpa.deleteById(1);
//		System.out.println(sparingDataJpa.findAllById(1));
		
	}
	
}
