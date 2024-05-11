package org.ramesh9705.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.ramesh9705.exception.RouteException;
import org.ramesh9705.exception.UserException;
import org.ramesh9705.model.Bus;
import org.ramesh9705.model.CurrentUserSession;
import org.ramesh9705.model.Route;
import org.ramesh9705.repository.RouteRepo;
import org.ramesh9705.repository.SessionRepo;
import org.ramesh9705.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RouteServiceImp implements RouteService
{
	@Autowired
	private RouteRepo routeRepo;
	@Autowired
	private SessionRepo sessionRepo;

	@Override
	public Route addRoute(Route route, String key) throws UserException, RouteException
	{
		CurrentUserSession validUserSeession = sessionRepo.findByUserUniqueId(key);
		if(validUserSeession==null)
		{
			throw new UserException("Please provide a valid Admin key to add Route");
		}
		if(validUserSeession.getType().equalsIgnoreCase("Admin"))
		{
			Route newRoute = routeRepo.findByRouteFromAndRouteTo(route.getRouteFrom(), route.getRouteTo());
			if(newRoute!=null)
			{
				throw new RouteException("Route from : " + route.getRouteFrom() + " to " + route.getRouteTo() + " already exists");
			}
//			---------------------------------------
			List<Bus> busList = new ArrayList<Bus>();
			route.setBusList(busList);
//			---------------------------------------
			return routeRepo.save(route);
		}
		else {
			throw new UserException("Access Denied");
		}
		
	}

	@Override
	public Route updateRoute(Route route, String key) throws UserException, RouteException
	{
		CurrentUserSession vaUserSession = sessionRepo.findByUserUniqueId(key);
		if(vaUserSession==null)
		{
			throw new UserException("Please provide a valid Admin key to add Route");
			
		}
		if(vaUserSession.getType().equalsIgnoreCase("Admin"))
		{
			Optional<Route> updateroute = routeRepo.findById(route.getRouteid());
			if(updateroute.isPresent())
			{
				Route existingRoute = updateroute.get();
//				---------------------------------------------
				if (!existingRoute.getBusList().isEmpty())
				{
					throw new RouteException("Cannot update Route ! Already buses are Scheduled for this route");
				}
					 
//				 ----------------------------------------------
				if(route.getDistance() !=null)
				{
					existingRoute.setDistance(route.getDistance());
				}
				if(route.getRouteFrom() !=null)
				{
					existingRoute.setRouteFrom(route.getRouteFrom());;
				}
				if(route.getRouteTo() !=null)
				{
					existingRoute.setRouteTo(route.getRouteTo());;
				}
				Route saved = routeRepo.save(existingRoute);
				return saved;
			}
			else {
				throw new RouteException("No route exist to update please save the Route first");
			}
		}
		else {
			throw new UserException("Access Denied");
		}
		
	}

	@Override
	public Route deleteRoute(Integer routeid, String key) throws UserException, RouteException
	{
		CurrentUserSession validUserSession = sessionRepo.findByUserUniqueId(key);
		if(validUserSession==null)
		{
			throw new UserException("Please provide a valid Admin key to add Route");
			
		}
		if(validUserSession.getType().equalsIgnoreCase("Admin"))
		{
			Optional<Route> del = routeRepo.findById(routeid);
			if(del.isPresent())
			{
				Route rot = del.get();
				
//				--------------------------------------------
				if (!rot.getBusList().isEmpty())
					 throw new RouteException("Cannot delete Route ! Already buses are Scheduled for this route");
//				-------------------------------------------------
				
				
				routeRepo.delete(rot);
				return rot;
			}
			else {
				throw new RouteException("No route found on this "+routeid+ " id");
			}
//			return null;
		}
		else {
			throw new UserException("Access denied");
		}
	}

	@Override
	public Route viewRouteById(Integer routeid, String key) throws UserException, RouteException
	{
		CurrentUserSession validUserSession = sessionRepo.findByUserUniqueId(key);
		if(validUserSession==null)
		{
			throw new UserException("Please provide a valid Admin key to add Route");
			
		}
		Optional<Route> viewrou = routeRepo.findById(routeid);
		if(viewrou.isPresent())
		{
			return viewrou.get();
		}
		else {
			throw new RouteException("No route found on this "+routeid+ " id");
		}
	}

	@Override
	public List<Route> viewAllRoutes(String key) throws UserException, RouteException
	{
		CurrentUserSession validUserSession = sessionRepo.findByUserUniqueId(key);
		if(validUserSession==null)
		{
			throw new UserException("Please provide a valid Admin key to add Route");
			
		}
		List<Route> rouList = routeRepo.findAll();
		if(rouList.size()!=0)
		{
			return rouList;
		}
		else {
			throw new RouteException("Route List is Empty...");
		}
	}

	


	

}
