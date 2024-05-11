package org.ramesh9705.serviceImp;

import java.util.List;
import java.util.Optional;

import org.ramesh9705.exception.BusException;
import org.ramesh9705.exception.RouteException;
import org.ramesh9705.exception.UserException;
import org.ramesh9705.model.Bus;
import org.ramesh9705.model.CurrentUserSession;
import org.ramesh9705.model.Route;
import org.ramesh9705.repository.BusRepo;
import org.ramesh9705.repository.RouteRepo;
import org.ramesh9705.repository.SessionRepo;
import org.ramesh9705.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService
{
	@Autowired
	private BusRepo busRepo;
	
	@Autowired
	private SessionRepo sessionRepo;
	
	@Autowired
	private RouteRepo routeRepo;
	@Override
	public Bus addBus(Bus bus, String key) throws UserException, BusException
	{
		CurrentUserSession validUserSession = sessionRepo.findByUserUniqueId(key);
		if(validUserSession==null)
		{
			throw new UserException("Please provide a valid key to add Bus");
		}
		if(validUserSession.getType().equalsIgnoreCase("Admin"))
		{
//			find route is present or not
			Route route = routeRepo.findByRouteFromAndRouteTo(bus.getRouteForm(), bus.getRouteTo());
			if(route !=null)
			{
//				-------------------------------------------
				if (route.getBusList().contains(bus)) {
					throw new BusException("Bus already exists");
				}
//				if not present then add bus to buslist
				route.getBusList().add(bus);
				bus.setRoute(route);
//				--------------------------------------------
				return busRepo.save(bus);
			}
			else {
				throw new BusException("Cannot find route for adding Bus");
			}
		}
//		return null;
		else {
			throw new UserException("Unauthorized Access! Only Admin can add bus");
		}
	}
	@Override
	public Bus updateBus(Bus bus, String key) throws UserException, BusException
	{
		CurrentUserSession validUserSession = sessionRepo.findByUserUniqueId(key);
		if(validUserSession==null)
		{
			throw new UserException("Please provide a valid key to add Bus");
		}
		if(validUserSession.getType().equalsIgnoreCase("Admin"))
		{
			Optional<Bus> busopt = busRepo.findById(bus.getBusId());
			if(busopt.isPresent())
			{
				Bus current = busopt.get();
				if(current.getAvailabeSeats() == current.getSeats())
				{
					throw new BusException("Cannot update Bus already scheduled");
				}
				Route route = routeRepo.findByRouteFromAndRouteTo(current.getRouteForm(), current.getRouteTo());
				if(bus.getRouteForm() != null && bus.getRouteTo() != null)
				{
					route = routeRepo.findByRouteFromAndRouteTo(bus.getRouteForm(), bus.getRouteTo());
				}

//				if route not found it will throw bus exception
				if(route == null)
				{
					throw new BusException("Invalid route details");
				}
//				setting details
				if(bus.getArrivalTime() != null)
				{
					current.setArrivalTime(bus.getArrivalTime());
				}
				if(bus.getAvailabeSeats() != null)
				{
					current.setAvailabeSeats(bus.getAvailabeSeats());
				}
				if (bus.getBusName() != null)
				{
					current.setBusName(bus.getBusName());
				}
				if (bus.getBusType() != null)
				{
					current.setBusType(bus.getBusType());
				}
					
				if (bus.getDepatureTime() != null)
				{
					current.setDepatureTime(bus.getDepatureTime());
				}
				if (bus.getDriverName() != null)
				{
					current.setDriverName(bus.getDriverName());
				}
				
				if (bus.getRouteForm() != null)
				{
					current.setRouteForm(bus.getRouteForm());
				}
					
				if (bus.getRouteTo() != null)
				{
					current.setRouteTo(bus.getRouteTo());
				}
					
				if (bus.getSeats() != null)
				{
					current.setSeats(bus.getSeats());
				}
				Bus updated = busRepo.save(current);
				return updated;
					
			}
			else {
				throw new BusException("Bus with id " + bus.getBusId() + "does not exist");
			}
		}
		else {
			throw new UserException("Unauthorized Access! Only Admin can add bus");
		}
	}
	@Override
	public Bus deleteBus(Integer busId, String key) throws UserException, BusException
	{
		CurrentUserSession validUserSession = sessionRepo.findByUserUniqueId(key);
		if(validUserSession==null)
		{
			throw new UserException("Please provide a valid key to add Bus");
		}
		if(validUserSession.getType().equalsIgnoreCase("Admin"))
		{
			Optional<Bus> busopt = busRepo.findById(busId);
			if(busopt.isPresent())
			{
				Bus exbus = busopt.get();
				if(exbus.getAvailabeSeats() == exbus.getSeats())
				{
					throw new BusException("Cannot delete Bus already scheduled");
				}
				busRepo.delete(exbus);
				return exbus;
			}
			else {
				throw new BusException("Bus doesn't exists with this " + busId + " id");
			}
		}
		else {
			throw new UserException("Unauthorized Access! Only Admin can delete Bus");
		}
		
	}
	@Override
	public Bus viewBus(Integer busId, String key) throws UserException, BusException
	{
		CurrentUserSession validUserSession = sessionRepo.findByUserUniqueId(key);
		if(validUserSession==null)
		{
			throw new UserException("Please provide a valid key to add Bus");
		}
		if(validUserSession.getType().equalsIgnoreCase("Admin"))
		{
			Optional<Bus> busopt = busRepo.findById(busId);
			if(busopt.isPresent())
			{
				Bus exbus = busopt.get();
				return exbus;
			}
			else {
				throw new BusException("Bus doesn't exists with this " + busId + " id");
			}
		}
		else {
			throw new UserException("Unauthorized Access! Only Admin can delete Bus");
		}
	}

	@Override
	public List<Bus> viewBusType(String busType, String key) throws UserException, BusException
	{
		CurrentUserSession validUserSession = sessionRepo.findByUserUniqueId(key);
		if(validUserSession==null)
		{
			throw new UserException("Please provide a valid key to add Bus");
		}
		List<Bus> busesList = busRepo.findByBusType(busType);
		if(busesList.size() == 0)
		{
			throw new BusException("bus list is empty");
		}
		return busesList;
		
		
	}
	
	
	@Override
	public List<Bus> viewAllBus(String key) throws UserException, BusException
	{
		CurrentUserSession validUserSession = sessionRepo.findByUserUniqueId(key);
		if(validUserSession==null)
		{
			throw new UserException("Please provide a valid key to add Bus");
		}
		List<Bus> busesList = busRepo.findAll();
		if(busesList.size() == 0)
		{
			throw new BusException("bus list is empty");
		}
		return busesList;
	}
	

}
