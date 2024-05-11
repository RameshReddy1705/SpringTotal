package com.Ramesh.Jpa;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;

public class Jparepository
{
	@Autowired
	private EntityManager entityManager;
	
	public void insert(PersonData data)
	{
		entityManager.merge(data);
	}
	public PersonData findById(long id)
	{
		return entityManager.find(PersonData.class, id);
	}
	public void deleteById(long id)
	{
		PersonData personData=entityManager.find(PersonData.class, id);
		entityManager.remove(id);
	}
}
