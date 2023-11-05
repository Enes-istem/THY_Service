package com.turkishTechnology.airportservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.turkishTechnology.airportservice.model.Airport;
import com.turkishTechnology.airportservice.repository.AirportRepository;



@Service
public class AirportService {
	@Autowired
	AirportRepository airportRepository;
	
	Gson gson = new Gson();
	
	
	public List<Airport> allAirport(){
		return airportRepository.findAll(); 
	}
	
}
