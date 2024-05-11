package com.ramesh9705.Reservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ramesh9705.Reservation.Dto.ResponseStructure;
import com.ramesh9705.Reservation.Dto.Ticket;
import com.ramesh9705.Reservation.Service.TicketService;

@RestController
@CrossOrigin
public class TicketController
{
	@Autowired
	public TicketService ticketService;
	@PostMapping("/ticket/{bus_id}/{user_id}")
	public ResponseEntity<ResponseStructure<Ticket>> saveTicket(@RequestBody Ticket ticket, @PathVariable int bus_id, @PathVariable int user_id)
	{
		return ticketService.saveTicket(ticket, bus_id, user_id);
	}
	@PutMapping(value = "/ticket/{bus_id}/{user_id}")
	public ResponseEntity<ResponseStructure<Ticket>> updateTicket(@RequestBody Ticket ticket,@PathVariable int bus_id ,@PathVariable int user_id)
	{
		return ticketService.updateTicket(ticket,bus_id,user_id);
	}
	@DeleteMapping("/ticket/{id}")
	public ResponseEntity<ResponseStructure<String>> deleteTicketById(@PathVariable int id)
	{
		return ticketService.deleteTicketById(id);
		
	}

}
