package com.turkishTechnology.airportservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkishTechnology.airportservice.model.Airport;

public interface AirportRepository extends JpaRepository<Airport, Long> {

}
