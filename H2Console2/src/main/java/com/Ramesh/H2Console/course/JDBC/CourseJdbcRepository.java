package com.Ramesh.H2Console.course.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CourseJdbcRepository
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT_QUERY=
			"""
				insert into course1(id, name, author)
				values(?,?,?);
			""";
	public void insert()
	{
		jdbcTemplate.update(INSERT_QUERY);
	}
	
	private static String DELETE_QUERY=
			"""
				select * from course
				where id=?
			""";
	public void delete()
	{
		jdbcTemplate.update(DELETE_QUERY);
	}
	private static String SELECT_QUERY=
			"""
				select * from course
				where id=?
			""";
	public void findById()
	{
		jdbcTemplate.update(SELECT_QUERY);
	}
}
