package com.turkishTechnology.airportservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AirportserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportserviceApplication.class, args);
		System.out.println("çalıştı");
	}

}
