package org.ramesh9705.model;

import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bus
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer busId;
	
	private String busName;
	
	private String driverName;
	
	private String busType;
	
	private String routeForm;
	
	private String routeTo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
	private LocalTime arrivalTime;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
	private LocalTime depatureTime;

	private Integer seats;
	
	private Integer availabeSeats;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Route route;
	
	

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Bus() {
		super();
	}
	
	public Bus(Integer busId, String busName, String driverName, String busType, String routeForm, String routeTo,
			LocalTime arrivalTime, LocalTime depatureTime, Integer seats, Integer availabeSeats) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.driverName = driverName;
		this.busType = busType;
		this.routeForm = routeForm;
		this.routeTo = routeTo;
		this.arrivalTime = arrivalTime;
		this.depatureTime = depatureTime;
		this.seats = seats;
		this.availabeSeats = availabeSeats;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getRouteForm() {
		return routeForm;
	}

	public void setRouteForm(String routeForm) {
		this.routeForm = routeForm;
	}

	public String getRouteTo() {
		return routeTo;
	}

	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalTime getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(LocalTime depatureTime) {
		this.depatureTime = depatureTime;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Integer getAvailabeSeats() {
		return availabeSeats;
	}

	public void setAvailabeSeats(Integer availabeSeats) {
		this.availabeSeats = availabeSeats;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", driverName=" + driverName + ", busType=" + busType
				+ ", routeForm=" + routeForm + ", routeTo=" + routeTo + ", arrivalTime=" + arrivalTime
				+ ", depatureTime=" + depatureTime + ", seats=" + seats + ", availabeSeats=" + availabeSeats + "]";
	}
	



	
	
	
	
}
