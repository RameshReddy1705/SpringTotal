package com.ramesh9705.Reservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramesh9705.Reservation.Dto.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>
{
	
}
