package org.ramesh9705.repository;

import java.util.Optional;

import org.ramesh9705.model.CurrentUserSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SessionRepo extends JpaRepository<CurrentUserSession, Integer>
{

	CurrentUserSession findByUserUniqueId(String key);

	
}
