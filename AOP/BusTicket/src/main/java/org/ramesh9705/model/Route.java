package org.ramesh9705.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Route
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer routeid;
	private String routeFrom;
	private String routeTo;
	private Integer distance;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Bus> busList;
	
	
	
	
	
	
	public Route(Integer routeid, String routeFrom, String routeTo, Integer distance, List<Bus> busList) {
		super();
		this.routeid = routeid;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.distance = distance;
		this.busList = busList;
	}
	public List<Bus> getBusList() {
		return busList;
	}
	public void setBusList(List<Bus> busList) {
		this.busList = busList;
	}
	public Route() {
		super();
	}
	public Route(Integer routeid, String routeFrom, String routeTo, Integer distance) {
		super();
		this.routeid = routeid;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.distance = distance;
	}
	public Integer getRouteid() {
		return routeid;
	}
	public void setRouteid(Integer routeid) {
		this.routeid = routeid;
	}
	public String getRouteFrom() {
		return routeFrom;
	}
	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}
	public String getRouteTo() {
		return routeTo;
	}
	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Route [routeid=" + routeid + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", distance="
				+ distance + "]";
	}
	
	
	
	
}
