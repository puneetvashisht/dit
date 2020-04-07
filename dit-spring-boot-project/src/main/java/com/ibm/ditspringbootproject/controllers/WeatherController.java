package com.ibm.ditspringbootproject.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class WeatherInfo{
	int currentTemp;

	public WeatherInfo(){
		
	}
	public WeatherInfo(int currentTemp) {
		super();
		this.currentTemp = currentTemp;
	}
	
	

	public int getCurrentTemp() {
		return currentTemp;
	}
	public void setCurrentTemp(int currentTemp) {
		this.currentTemp = currentTemp;
	}
	@Override
	public String toString() {
		return "WeatherInfo [currentTemp=" + currentTemp + "]";
	}
	
	
}

@RestController
@CrossOrigin
@RequestMapping(path="/api")
public class WeatherController {
	
	@GetMapping(path="/weather")
	public WeatherInfo fetchCurrentTempreture(){
		return new WeatherInfo(36);
	}
	

}
