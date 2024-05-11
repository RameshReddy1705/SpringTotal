package com.Ramesh.H2Console.course.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CourseJdbcCommandLineRunner implements CommandLineRunner
{
	@Autowired
	private CourseJdbcRepository jdbcRepository;
	
	public void run(String...argsS) throws Exception
	{
		jdbcRepository.insert();
		jdbcRepository.delete();
		jdbcRepository.findById();
	}
}
