package com.turkishTechnology.airportservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkishTechnology.airportservice.model.Airport;
import com.turkishTechnology.airportservice.service.AirportService;

@RestController
@RequestMapping("/api")
public class AirportController {
	
	@Autowired
	AirportService airportService;
	
	@GetMapping("/allAirport")
	public ResponseEntity<List<Airport>> allAirport() {
        List<Airport> airports = airportService.allAirport();

        if (airports.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(airports, HttpStatus.OK);
    }


}
