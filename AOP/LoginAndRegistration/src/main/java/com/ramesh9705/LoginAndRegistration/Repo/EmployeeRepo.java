package com.ramesh9705.LoginAndRegistration.Repo;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ramesh9705.LoginAndRegistration.Entity.Employee;

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

	Employee findByEmail(String email);

	Optional<Employee> findOneByEmailAndPassword(String email, String password);
	
	
}
