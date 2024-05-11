package org.ramesh9705.controller;

import java.util.List;

import org.ramesh9705.exception.RouteException;
import org.ramesh9705.exception.UserException;
import org.ramesh9705.model.Route;
import org.ramesh9705.service.RouteService;
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
@RequestMapping("/route")
public class RouteController
{
	@Autowired
	private RouteService routeService;
	
	@PostMapping("/add")
	public ResponseEntity<Route> addRoute(@RequestBody Route route, @RequestParam String key) throws UserException, RouteException
	{
		Route route2=routeService.addRoute(route,key);
		return new ResponseEntity<Route>(route2, HttpStatus.ACCEPTED);
		
	}
	@PutMapping("/update")
	public ResponseEntity<Route> updateRoute(@RequestBody Route route, @RequestParam String key) throws UserException, RouteException
	{
		Route routeupdate = routeService.updateRoute(route,key);
		return new ResponseEntity<Route>(routeupdate, HttpStatus.ACCEPTED);
		
	}
	@DeleteMapping("/delete/{routeid}/{key}")
	public ResponseEntity<Route> deleteRoute(@PathVariable("routeid") Integer routeid, @PathVariable String key) throws UserException, RouteException
	{
		Route deleteRou = routeService.deleteRoute(routeid,key);
		return new ResponseEntity<Route>(deleteRou,HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/view/{routeid}")
	public ResponseEntity<Route> viewById(@RequestParam("Route Id") Integer routeid, @RequestParam String key ) throws UserException, RouteException
	{
		Route viewRou = routeService.viewRouteById(routeid, key); 
		return new ResponseEntity<Route>(viewRou, HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/viewAll")
	public ResponseEntity<List<Route>> viewAll(@RequestParam String key ) throws UserException, RouteException
	{
		List<Route> viewRou = routeService.viewAllRoutes(key); 
		return new ResponseEntity<List<Route>>(viewRou, HttpStatus.ACCEPTED);
		
	}
}
