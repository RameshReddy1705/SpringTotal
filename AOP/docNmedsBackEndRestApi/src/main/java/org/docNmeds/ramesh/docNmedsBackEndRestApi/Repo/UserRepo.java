package org.docNmeds.ramesh.docNmedsBackEndRestApi.Repo;

import java.util.Optional;

import org.docNmeds.ramesh.docNmedsBackEndRestApi.Entity.DocNmedsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository

public interface UserRepo extends JpaRepository<DocNmedsUser, Integer>
{

	DocNmedsUser findByEmail(String email);

	Optional<DocNmedsUser> findByEmailAndPassword(String email, String encodedPassword);


	
}
