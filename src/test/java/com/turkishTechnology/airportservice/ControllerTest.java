package com.turkishTechnology.airportservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;


import com.turkishTechnology.airportservice.controller.AirportController;
import com.turkishTechnology.airportservice.model.Airport;
import com.turkishTechnology.airportservice.model.City;
import com.turkishTechnology.airportservice.model.Country;
import com.turkishTechnology.airportservice.service.AirportService;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration
@AutoConfigureMockMvc
class ControllerTests  {

    @Spy
    @InjectMocks
    private AirportController controller;
 
    @Mock
    private AirportService service;

    
    @Test
    public void givenId_Credit_thenReturnJson()
    throws Exception {
        
        Airport airport = new Airport("Istanbul Airport", "IST",new City("Istanbul","IST"), new Country("Turkey","TR"));

        doReturn(airport).when(service).allAirport();
        ResponseEntity<List<Airport>> result = controller.allAirport();
        verify(service, times(1)).allAirport();
        assertEquals("OK", result);
    }

    



}
