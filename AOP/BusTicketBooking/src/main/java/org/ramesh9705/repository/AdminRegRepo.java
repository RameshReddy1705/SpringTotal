package org.ramesh9705.repository;

import org.ramesh9705.model.AdminReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRegRepo extends JpaRepository<AdminReg, Integer> {

}
