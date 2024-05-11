package com.ramesh9705.Reservation.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramesh9705.Reservation.Dto.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>
{
	@Query("select a from Admin a where a.phone=?1 and a.password=?2")
	public Optional<Admin> verifyAdmin(long phone, String password);

}
