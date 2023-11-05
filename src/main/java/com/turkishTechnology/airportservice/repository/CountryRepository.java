package com.turkishTechnology.airportservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.turkishTechnology.airportservice.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
