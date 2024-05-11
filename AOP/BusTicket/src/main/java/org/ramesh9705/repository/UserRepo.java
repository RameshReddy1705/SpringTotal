package org.ramesh9705.repository;

import org.ramesh9705.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>
{

	User findByUserName(String userName);

}
