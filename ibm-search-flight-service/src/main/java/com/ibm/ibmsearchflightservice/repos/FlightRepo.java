package com.ibm.ibmsearchflightservice.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.ibmsearchflightservice.entities.Flight;

public interface FlightRepo extends JpaRepository<Flight, Integer> {
	
	public List<Flight> findBySourceAndDestination(String source, String destination);

}
