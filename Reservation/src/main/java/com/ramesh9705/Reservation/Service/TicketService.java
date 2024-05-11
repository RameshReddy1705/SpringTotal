package com.ramesh9705.Reservation.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ramesh9705.Reservation.Dao.BusDao;
import com.ramesh9705.Reservation.Dao.TicketDao;
import com.ramesh9705.Reservation.Dao.UserDao;
import com.ramesh9705.Reservation.Dto.Bus;
import com.ramesh9705.Reservation.Dto.ResponseStructure;
import com.ramesh9705.Reservation.Dto.Ticket;
import com.ramesh9705.Reservation.Dto.User;
import com.ramesh9705.Reservation.Exception.IdNotFoundException;
import com.ramesh9705.Reservation.Exception.InvaildCredentialException;
@Service
public class TicketService
{
	@Autowired
	public TicketDao ticketDao;
	@Autowired
	public BusDao busDao;
	@Autowired
	public UserDao userDao;
	public ResponseEntity<ResponseStructure<Ticket>> saveTicket(Ticket ticket, int bus_id, int user_id)
	{
		ResponseStructure<Ticket> str= new ResponseStructure<Ticket>();
		Optional<User> userData = userDao.findById(user_id);
		Optional<Bus> busData = busDao.findById(bus_id);
		
		if(busData.isPresent() && userData.isPresent())
		{
			Bus b= busData.get();
			User u=userData.get();
			b.getTickets().add(ticket);
			u.getTickets().add(ticket);
			ticket.setCost(ticket.getNo_of_seats()*busData.get().getCost_per_seat());
			ticket.setBus(busData.get());
			ticket.setUser(userData.get());
			//Email
			busDao.updateBus(busData.get());
			userDao.updateUser(userData.get());
			
			 str.setBody(ticketDao.saveTicket(ticket));
			 str.setMessage("Successfully Done Ticket");
			 str.setCode(HttpStatus.CREATED.value());
			 return new ResponseEntity<ResponseStructure<Ticket>>(str,HttpStatus.CREATED);

			
		}
		throw new InvaildCredentialException();
	}

	public ResponseEntity<ResponseStructure<Ticket>> updateTicket(Ticket ticket, int bus_id, int user_id)
	{
		ResponseStructure<Ticket> str= new ResponseStructure<Ticket>();
		Optional<Bus> busData = busDao.findById(bus_id);
		Optional<User> userData = userDao.findById(user_id);
		if(busData.isPresent() && userData.isPresent())
		{
			Bus b= busData.get();
			User u=userData.get();
			b.getTickets().add(ticket);
			u.getTickets().add(ticket);
			ticket.setCost(ticket.getNo_of_seats()*busData.get().getCost_per_seat());
			ticket.setBus(busData.get());
			ticket.setUser(userData.get());
			//Email
			busDao.updateBus(busData.get());
			userDao.updateUser(userData.get());
			
			 str.setBody(ticketDao.saveTicket(ticket));
			 str.setMessage("Successfully Done Ticket");
			 str.setCode(HttpStatus.CREATED.value());
			 return new ResponseEntity<ResponseStructure<Ticket>>(str,HttpStatus.CREATED);

			
		}
		throw new InvaildCredentialException();
	}

	public ResponseEntity<ResponseStructure<String>> deleteTicketById(int id)
	{
		ResponseStructure<String> str= new ResponseStructure<String>();
		Optional<Ticket> recordTicket= ticketDao.findById(id);
		if(recordTicket.isEmpty())
		{
			throw new InvaildCredentialException();
		}
		User u= recordTicket.get().getUser();
		Bus b=recordTicket.get().getBus();
		Ticket ticket=recordTicket.get();
		//Email
		ticketDao.deleteTicketById(recordTicket.get());
		str.setBody("Booking has been cancelled");
		str.setMessage("Send");
		str.setCode(HttpStatus.OK.value());

		return new ResponseEntity<ResponseStructure<String>>(str,HttpStatus.OK);
	}

}
