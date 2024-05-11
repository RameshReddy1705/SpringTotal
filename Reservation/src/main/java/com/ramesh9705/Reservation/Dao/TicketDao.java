package com.ramesh9705.Reservation.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ramesh9705.Reservation.Dto.Ticket;
import com.ramesh9705.Reservation.Repository.TicketRepository;
@Repository
public class TicketDao
{
	@Autowired
	public TicketRepository ticketRepository;
	public Ticket saveTicket(Ticket ticket)
	{
		return ticketRepository.save(ticket);
	}

	public Optional<Ticket> findById(int id)
	{
		return ticketRepository.findById(id);
	}

	public void deleteTicketById(Ticket ticket)
	{
		ticketRepository.delete(ticket);;
	}

}
