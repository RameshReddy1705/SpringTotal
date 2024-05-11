package org.ramesh9705.service;

import java.util.List;

import org.ramesh9705.exception.RouteException;
import org.ramesh9705.exception.UserException;
import org.ramesh9705.model.Route;

public interface RouteService {

	public Route addRoute(Route route, String key) throws UserException, RouteException;

	public Route updateRoute(Route route, String key) throws UserException, RouteException;

	public Route deleteRoute(Integer routeid, String key) throws UserException, RouteException;

	public Route viewRouteById(Integer routeid, String key) throws UserException, RouteException;

	public List<Route> viewAllRoutes(String key) throws UserException, RouteException;

}
