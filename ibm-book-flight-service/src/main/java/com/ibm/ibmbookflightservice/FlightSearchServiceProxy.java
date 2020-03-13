package com.ibm.ibmbookflightservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ibm-search-flight-service")
@RibbonClient(name="ibm-search-flight-service")
public interface FlightSearchServiceProxy {
	
	@GetMapping(path = "/api/flight/lowest/{src}/to/{dest}")
	public Flight fetchFlightWithLowestRates(@PathVariable("src") String source, @PathVariable("dest") String destination); 

}
