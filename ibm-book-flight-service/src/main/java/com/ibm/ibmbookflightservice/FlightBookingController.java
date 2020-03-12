package com.ibm.ibmbookflightservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class FlightBookingController {
	
	@Autowired
	FlightSearchServiceProxy proxy;

	@RequestMapping(path="/flight/{src}/to/{dest}/flyers/{flyers}", method=RequestMethod.GET)
	public ResponseEntity<Flight> bookFlight(@PathVariable("src") String source, @PathVariable("dest") String destination, @PathVariable("flyers") Integer flyers ){
		
//		Map<String, String> uriVariables = new HashMap<>();
//		uriVariables.put("src", source);
//		uriVariables.put("dest", destination);
//		
//		ResponseEntity<Flight> responseEntity = new RestTemplate().getForEntity(
//				"http://localhost:8000/api/flight/lowest/{src}/to/{dest}", 
//				Flight.class, 
//				uriVariables );
//		http://localhost:8000/api/flight/{src}/to/{dest}
//		Flight flight = responseEntity.getBody();
		
		Flight flight = proxy.fetchFlightWithLowestRates(source, destination);
		

		System.out.println("In flight booking service: " + flight);
		
		flight.setTotalPrice(flight.getPrice() * flyers);
		
		ResponseEntity<Flight> re = new ResponseEntity<Flight>(flight, HttpStatus.OK); // Flight search service with source & destination
				
		
//			flight.setTotalPrice(flight.getPrice() * flyers);
		
				
		return re;
	}
	
}
