package ramesh9705.springDataJpa.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class PersonJpaCommandLineRunner implements CommandLineRunner
{
	@Autowired
	private SpringDataJpa jpaRepository;

	@Override
	public void run(String... args) throws Exception
	{
		jpaRepository.save(new Person(1, "Ramesh", "Reddy"));
		jpaRepository.save(new Person(2, "Ramesh", "Reddy"));
		jpaRepository.save(new Person(3, "Ramesh", "Reddy"));
		jpaRepository.save(new Person(4, "Ramesh", "Reddy"));
		jpaRepository.save(new Person(5, "Ramesh", "Reddy"));
		jpaRepository.deleteById(3);
		System.out.println(jpaRepository.findById(1));
		System.out.println(jpaRepository.findById(3));
	}
	
	
}
