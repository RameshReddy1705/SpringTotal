package org.ramesh9705.repository;

import org.ramesh9705.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RouteRepo extends JpaRepository<Route, Integer>
{

	public Route findByRouteFromAndRouteTo(String routeFrom, String routeTo);

}
