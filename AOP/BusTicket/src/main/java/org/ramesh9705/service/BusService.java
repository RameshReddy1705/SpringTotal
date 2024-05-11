package org.ramesh9705.service;

import java.util.List;

import org.ramesh9705.exception.BusException;
import org.ramesh9705.exception.UserException;
import org.ramesh9705.model.Bus;

public interface BusService {

	Bus addBus(Bus bus, String key) throws UserException, BusException;

	Bus updateBus(Bus bus, String key) throws UserException, BusException;

	Bus deleteBus(Integer busId, String key) throws UserException, BusException;

	Bus viewBus(Integer busId, String key) throws UserException, BusException;

	List<Bus> viewAllBus(String key) throws UserException, BusException;

	List<Bus> viewBusType(String busType, String key) throws UserException, BusException;


}
