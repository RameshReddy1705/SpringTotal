package com.ramesh9705.Reservation.Dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ramesh9705.Reservation.Dto.Bus;
import com.ramesh9705.Reservation.Repository.BusRepository;

@Repository
public class BusDao
{
	@Autowired
	public BusRepository busRepository;

	public Bus saveBus(Bus bus)
	{
		return busRepository.save(bus);
	}
	public Bus updateBus(Bus bus)
	{
		return busRepository.save(bus);
	}
	public Optional<Bus> findById(int id) 
	{
		return busRepository.findById(id);
	}
	public List<Bus> filter(String from, String to, LocalDate dop)
	{
		return busRepository.filter(from, to, dop);
	}
	public Optional<Bus> findBusId(int id)
	{
		return busRepository.findById(id);
	}
	public Bus findBusName(String name)
	{
		return busRepository.findBusName(name);
	}
	public List<Bus> findAllBuses()
	{
		return busRepository.findAll();
	}


	
}
