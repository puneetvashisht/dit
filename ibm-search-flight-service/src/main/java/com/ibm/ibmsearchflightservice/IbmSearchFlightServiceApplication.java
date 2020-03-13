package com.ibm.ibmsearchflightservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class IbmSearchFlightServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(IbmSearchFlightServiceApplication.class, args);
	}

}
