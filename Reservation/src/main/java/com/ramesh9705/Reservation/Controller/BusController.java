package com.ramesh9705.Reservation.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ramesh9705.Reservation.Dto.Bus;
import com.ramesh9705.Reservation.Dto.ResponseStructure;
import com.ramesh9705.Reservation.Service.BusService;

@RestController
@CrossOrigin
public class BusController
{
	@Autowired
	public BusService busService;
	@PostMapping("/bus/{id}")
	public ResponseEntity<ResponseStructure<Bus>> saveBus(@RequestBody Bus bus, @PathVariable int id)
	{
		return busService.saveBus(bus, id);
		
	}
	@GetMapping("/bus/filter")
	public ResponseEntity<ResponseStructure<List<Bus>>> filterBus(@RequestParam String from, @RequestParam String to, @RequestParam LocalDate dop)
	{
		return busService.filterBus(from, to, dop);
		
	}
	@GetMapping("/bus/findBusDetailsUsingId")
	public ResponseEntity<ResponseStructure<Bus>> findBusId(@RequestParam int id)
	{
		return busService.findBusId(id);
		
	}
	@GetMapping("/bus/{name}")
	public ResponseEntity<ResponseStructure<Bus>> findBusName(@PathVariable String name)
	{
		return busService.findBusName(name);
		
	}
	@GetMapping("/bus")
	public ResponseEntity<ResponseStructure<List<Bus>>> findAllBuses()
	{
		return busService.findAllBuses();
		
	}
	
}
