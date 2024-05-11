package ramesh9705.springDataJpaandHibernate.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class PersonJpaCommandLineRunner implements CommandLineRunner
{
	@Autowired
	private PersonJpaRepository jpaRepository;

	@Override
	public void run(String... args) throws Exception
	{
		jpaRepository.insert(new Person(1, "Ramesh", "Reddy"));
		jpaRepository.insert(new Person(2, "Ramesh", "Reddy"));
		jpaRepository.insert(new Person(3, "Ramesh", "Reddy"));
		jpaRepository.insert(new Person(4, "Ramesh", "Reddy"));
		jpaRepository.insert(new Person(5, "Ramesh", "Reddy"));
		jpaRepository.delete(3);
		System.out.println(jpaRepository.findById(1));
		System.out.println(jpaRepository.findById(3));
	}
	
	
}
