package com.ramesh9705.Reservation.Dto;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Bus
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false, name="from_location")
	private String from;
	@Column(nullable = false, name="to_location")
	private String to;
	@Column(nullable = false)
	private String bus_no;
	@Column(nullable = false, name="date_of_departure")
	private LocalDate dop;
	@Column(nullable = false)
	private int no_s;
	
	private String dep_time;
	private String arr_time;
	private String img_url;
	private double cost_per_seat;
	
	
	@ManyToOne
	@JoinColumn(name="admin_id")
	@JsonIgnore
	private Admin admin;
	
	@OneToMany(mappedBy = "bus")
	private List<Ticket> tickets;
	
	
	
	
	
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
	
	
	
	
	
	
	
	public Bus() {
		super();
	}
	public Bus(int id, String name, String from, String to, String bus_no, LocalDate dop, int no_s, String dep_time,
			String arr_time, String img_url, double cost_per_seat) {
		super();
		this.id = id;
		this.name = name;
		this.from = from;
		this.to = to;
		this.bus_no = bus_no;
		this.dop = dop;
		this.no_s = no_s;
		this.dep_time = dep_time;
		this.arr_time = arr_time;
		this.img_url = img_url;
		this.cost_per_seat = cost_per_seat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getBus_no() {
		return bus_no;
	}
	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}
	public LocalDate getDop() {
		return dop;
	}
	public void setDop(LocalDate dop) {
		this.dop = dop;
	}
	public int getNo_s() {
		return no_s;
	}
	public void setNo_s(int no_s) {
		this.no_s = no_s;
	}
	public String getDep_time() {
		return dep_time;
	}
	public void setDep_time(String dep_time) {
		this.dep_time = dep_time;
	}
	public String getArr_time() {
		return arr_time;
	}
	public void setArr_time(String arr_time) {
		this.arr_time = arr_time;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public double getCost_per_seat() {
		return cost_per_seat;
	}
	public void setCost_per_seat(double cost_per_seat) {
		this.cost_per_seat = cost_per_seat;
	}
	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", from=" + from + ", to=" + to + ", bus_no=" + bus_no + ", dop="
				+ dop + ", no_s=" + no_s + ", dep_time=" + dep_time + ", arr_time=" + arr_time + ", img_url=" + img_url
				+ ", cost_per_seat=" + cost_per_seat + "]";
	}
	
	
	
	

	
	
	

	

	
	
	
	
	
	
	

	

}
