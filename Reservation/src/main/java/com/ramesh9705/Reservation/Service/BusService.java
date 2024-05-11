package com.ramesh9705.Reservation.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ramesh9705.Reservation.Dao.AdminDao;
import com.ramesh9705.Reservation.Dao.BusDao;
import com.ramesh9705.Reservation.Dto.Admin;
import com.ramesh9705.Reservation.Dto.Bus;
import com.ramesh9705.Reservation.Dto.ResponseStructure;
import com.ramesh9705.Reservation.Exception.IdNotFoundException;
@Service
public class BusService
{
	@Autowired
	public BusDao busDao;
	
	@Autowired
	public AdminDao adminDao;
	
	public ResponseEntity<ResponseStructure<Bus>> saveBus(Bus bus, int id)
	{
		ResponseStructure<Bus> str= new ResponseStructure<Bus>();
		Optional<Admin> recorddata=adminDao.finddById(id);
		if(recorddata.isPresent())
		{
			Admin a=recorddata.get();
//			a.getBuses().add(bus);
			a.getBuses().add(bus);
			recorddata.get().getBuses().add(bus);
			bus.setAdmin(a);
//			adminDao.updateAdmin(a);
			adminDao.updateAdmin(a);
			busDao.saveBus(bus);
			
			str.setBody(bus);
			str.setMessage("Bus Added");
			str.setCode(HttpStatus.OK.value());
			
			return new ResponseEntity<ResponseStructure<Bus>>(str, HttpStatus.ACCEPTED);
		}
		throw new IdNotFoundException();
	}

	public ResponseEntity<ResponseStructure<List<Bus>>> filterBus(String from, String to, LocalDate dop)
	{
		ResponseStructure<List<Bus>> str= new ResponseStructure<List<Bus>>();
		str.setMessage("List Of Buses-->");
		str.setBody(busDao.filter(from, to, dop));
		str.setCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<List<Bus>>>(str, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<Bus>> findBusId(int id)
	{
		ResponseStructure<Bus> str= new ResponseStructure<Bus>();
		Optional<Bus> recordData=busDao.findBusId(id);
		if(recordData.isPresent())
		{
			str.setMessage("Buses--> Details");
			str.setBody(recordData.get());
			str.setCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Bus>>(str, HttpStatus.OK);
		}
		throw new IdNotFoundException();
		
	}

	public ResponseEntity<ResponseStructure<Bus>> findBusName(String name)
	{
		ResponseStructure<Bus> str= new ResponseStructure<Bus>();
		Bus recordData=busDao.findBusName(name);
		if(recordData != null)
		{
			str.setMessage("Buses--> Details");
			str.setBody(busDao.findBusName(name));
			str.setCode(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Bus>>(str, HttpStatus.OK);
		}
		throw new IdNotFoundException();
	}

	public ResponseEntity<ResponseStructure<List<Bus>>> findAllBuses()
	{
		ResponseStructure<List<Bus>> str= new ResponseStructure<List<Bus>>();
		str.setMessage("Buses--> Details");
		str.setBody(busDao.findAllBuses());
		str.setCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<List<Bus>>>(str, HttpStatus.OK);
	}

}
