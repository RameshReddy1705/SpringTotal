package ramesh9705.springDataJpaandHibernate.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class PersonJdbcRepository
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	private static String INSERT_QUERY=
//			"""
//				insert into person(id,name,surname)
//				values (1,'Ramesh','Reddy');
//			""";
//	
//	public void insert()
//	{
//		jdbcTemplate.update(INSERT_QUERY);
//	}

	
	private static String INSERT_QUERY=
			"""
				insert into person(id,name,surname)
				values (?,?,?);
			""";
	
	public void insert(Person person)
	{
		jdbcTemplate.update(INSERT_QUERY,person.getId(),person.getName(),person.getSurname());
	}
	
	private static String DELETE_QUERY=
			"""
				delete from person
				where id=?
			""";
	
	public void delete(long id)
	{
		jdbcTemplate.update(DELETE_QUERY, id);
	}
	private static String SELECT_QUERY=
			"""
				select * from person
				where id=?
			""";
	
	public Person findById(long id)
	{
		
		return jdbcTemplate.queryForObject(SELECT_QUERY,
				new BeanPropertyRowMapper<>(Person.class), id);
	}
}
