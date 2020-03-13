package com.ibm.ibmsearchflightservice.controllers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
	 Logger logger = LoggerFactory.getLogger(FlightController.class);
	
	@Autowired
	FlightRepo flightRepo;
	
	@Autowired
	Environment environment;

	
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
		String port = environment.getProperty("local.server.port");
		logger.info("*********** At port : " + source + destination+ " ----- " + port);
		List<Flight> flights = flightRepo.findBySourceAndDestination(source, destination);
		re = new ResponseEntity<>(flights, HttpStatus.OK);
		return re;
	}
	
	@RequestMapping(path="/flight/lowest/{src}/to/{dest}", method=RequestMethod.GET)
	public ResponseEntity<Flight> findLowestPriceFlight(@PathVariable("src") String source, @PathVariable("dest") String destination){
		ResponseEntity<Flight> re = null;
//		System.out.println(source + destination);
		List<Flight> flights = flightRepo.findBySourceAndDestination(source, destination);
		Collections.sort(flights, new Comparator<Flight>(){

			@Override
			public int compare(Flight o1, Flight o2) {
				return (int)(o1.getPrice() - o2.getPrice());
			}
	
		});
		
		re = new ResponseEntity<>(flights.get(0), HttpStatus.OK);
		return re;
	}

}
