package com.ramesh9705.Reservation.Dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ticket
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String seat_no;
	@Column(nullable = false, unique = true)
	private String ticket_no;
	@Column(nullable = false)
	private double cost;
	
	private LocalDate date_of_booking;
	@Column(nullable = false)
	private int no_of_seats;
	
	@ManyToOne
	@JoinColumn
	@JsonIgnore
	private Bus bus;
	@ManyToOne
	@JoinColumn
	@JsonIgnore
	private User user;
	
		
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	
	public Ticket(int id, String seat_no, String ticket_no, double cost, LocalDate date_of_booking, int no_of_seats) {
		super();
		this.id = id;
		this.seat_no = seat_no;
		this.ticket_no = ticket_no;
		this.cost = cost;
		this.date_of_booking = date_of_booking;
		this.no_of_seats = no_of_seats;
	}
	public Ticket() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}
	public String getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(String ticket_no) {
		this.ticket_no = ticket_no;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LocalDate getDate_of_booking() {
		return date_of_booking;
	}
	public void setDate_of_booking(LocalDate date_of_booking) {
		this.date_of_booking = date_of_booking;
	}
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	
	
}
