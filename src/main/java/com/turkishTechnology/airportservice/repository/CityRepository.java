package com.turkishTechnology.airportservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkishTechnology.airportservice.model.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
