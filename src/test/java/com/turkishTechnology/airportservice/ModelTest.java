package com.turkishTechnology.airportservice;

import static org.junit.jupiter.api.Assertions.assertTrue;




import org.junit.jupiter.api.Test;

import com.turkishTechnology.airportservice.model.Airport;
import com.turkishTechnology.airportservice.model.City;
import com.turkishTechnology.airportservice.model.Country;

public class ModelTest {
	
	@Test
	public void testCreateAirport() {
		Airport airport = new Airport("Istanbul Airport", "IST",new City("Istanbul","IST"), new Country("Turkey","TR"));
		assertTrue(airport.getName().equals("Istanbul Airport"));
		assertTrue(airport.getCode().equals("IST"));
		assertTrue(airport.getCity().getName().equals("Istanbul"));
		assertTrue(airport.getCity().getCode().equals("IST"));
		assertTrue(airport.getCountry().getName().equals("Turkey"));
		assertTrue(airport.getCountry().getCode().equals("TR"));
		
	}

	
}

