package org.ramesh9705.repository;

import java.util.List;

import org.ramesh9705.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BusRepo extends JpaRepository<Bus, Integer> {

	List<Bus> findByBusType(String busType);

}
