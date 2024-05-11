package ramesh9705.springDataJpaandHibernate.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository
{
	@PersistenceContext
	private EntityManager entityManager;
	public void insert(Person person)
	{
		entityManager.merge(person);
	}
	public Person findById(long id)
	{
		return entityManager.find(Person.class, id);
	}
	public void delete(long id)
	{
		Person person=entityManager.find(Person.class, id);
		entityManager.remove(person);
	}
}
