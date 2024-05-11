package org.ramesh9705.controller;

import java.util.List;

import org.ramesh9705.exception.BusException;
import org.ramesh9705.exception.UserException;
import org.ramesh9705.model.Bus;
import org.ramesh9705.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus")
public class BusController
{
	@Autowired
	private BusService busService;
	@PostMapping("/add")
	public ResponseEntity<Bus> addBusHandle(@RequestBody Bus bus, @RequestParam String key) throws UserException, BusException
	{
		Bus b = busService.addBus(bus,key);
		return new ResponseEntity<Bus>(b,HttpStatus.ACCEPTED);
		
	}
	@PutMapping("/update")
	public ResponseEntity<Bus> updateBusHandle(@RequestBody Bus bus, @RequestParam String key) throws UserException, BusException
	{
		Bus b = busService.updateBus(bus,key);
		return new ResponseEntity<Bus>(b,HttpStatus.ACCEPTED);
		
	}
	@DeleteMapping("/delete/{busId}")
	public ResponseEntity<Bus> deleteBusHandler(@PathVariable("busId") Integer busId,@RequestParam String key)throws BusException, UserException{
		
		Bus b = busService.deleteBus(busId,key);
		
		return new ResponseEntity<Bus>(b,HttpStatus.OK);
	}
	@GetMapping("/view/{busId}")
	public ResponseEntity<Bus> viewBusHandler(@PathVariable("busId") Integer busId,@RequestParam String key) throws BusException, UserException{
		
		Bus busById = busService.viewBus(busId,key);
		
		return new ResponseEntity<Bus>(busById,HttpStatus.FOUND);
		
	}
	@GetMapping("/viewBusType/{busType}")
	public ResponseEntity<List<Bus>> viewByBusType(@PathVariable("busType") String busType,@RequestParam String key) throws BusException, UserException{
		
		List<Bus> busById = busService.viewBusType(busType,key);
		
		return new ResponseEntity<List<Bus>>(busById,HttpStatus.FOUND);
		
	}
	@GetMapping("/viewAll")
	public ResponseEntity<List<Bus>> viewAllBusHandler(@RequestParam String key) throws BusException, UserException{
		
		List<Bus> busById = busService.viewAllBus(key);
		
		return new ResponseEntity<List<Bus>>(busById,HttpStatus.FOUND);
		
	}
}
