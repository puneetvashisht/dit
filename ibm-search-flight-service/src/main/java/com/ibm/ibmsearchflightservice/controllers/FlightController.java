package com.ibm.ibmsearchflightservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ibmsearchflightservice.entities.Flight;
import com.ibm.ibmsearchflightservice.repos.FlightRepo;

@RestController
@RequestMapping("/api")
public class FlightController {
	
	@Autowired
	FlightRepo flightRepo;
	
	@RequestMapping(path="/flight", method=RequestMethod.POST)
	public ResponseEntity<Void> addFlight(@RequestBody Flight flight){
		ResponseEntity<Void> re = null;
		System.out.println(flight);
		flightRepo.save(flight);
		re = new ResponseEntity<>(HttpStatus.CREATED);
		return re;
	}
	
	@RequestMapping(path="/flight/{src}/to/{dest}", method=RequestMethod.GET)
	public ResponseEntity<List<Flight>> findFlight(@PathVariable("src") String source, @PathVariable("dest") String destination){
		ResponseEntity<List<Flight>> re = null;
		System.out.println(source + destination);
		List<Flight> flights = flightRepo.findBySourceAndDestination(source, destination);
		re = new ResponseEntity<>(flights, HttpStatus.OK);
		return re;
	}

}
