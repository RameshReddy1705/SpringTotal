package com.ramesh9705.Reservation.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramesh9705.Reservation.Dto.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	@Query("Select u from User u where u.email=?1 and u.password=?2")
	public Optional<User> verifyByEmail(String email, String password);

	
}
