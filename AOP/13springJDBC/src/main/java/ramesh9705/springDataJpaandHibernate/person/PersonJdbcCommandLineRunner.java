package ramesh9705.springDataJpaandHibernate.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class PersonJdbcCommandLineRunner implements CommandLineRunner
{
	@Autowired
	private PersonJdbcRepository jdbcRepository;

	@Override
	public void run(String... args) throws Exception
	{
		jdbcRepository.insert(new Person(1, "Ramesh", "Reddy"));
		jdbcRepository.insert(new Person(2, "Ramesh", "Reddy"));
		jdbcRepository.insert(new Person(3, "Ramesh", "Reddy"));
		jdbcRepository.delete(2);
		System.out.println(jdbcRepository.findById(1));
		System.out.println(jdbcRepository.findById(3));
	}
	
	
}
