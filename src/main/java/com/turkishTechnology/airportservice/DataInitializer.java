//package com.turkishTechnology.airportservice;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.google.gson.Gson;
//import com.turkishTechnology.airportservice.model.Airport;
//import com.turkishTechnology.airportservice.repository.AirportRepository;
//
//@Component
//public class DataInitializer implements CommandLineRunner {
//
//    //private final AirportRepository airportRepository;
//	
//	Gson gson = new Gson();
//	
//	@Autowired
//	AirportRepository airportRepository;
//
//    public DataInitializer(AirportRepository airportRepository) {
//        this.airportRepository = airportRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Airport airport1 = new Airport("Airport 1", "Country 1", "City 1", "CODE1");
//        Airport airport2 = new Airport("Airport 2", "Country 2", "City 2", "CODE2");
//        Airport airport3 = new Airport("Airport 3", "Country 3", "City 3", "CODE3");
//        Airport airport4 = new Airport("Airport 4", "Country 4", "City 4", "CODE4");
//
//        airportRepository.saveAll(List.of(airport1, airport2, airport3, airport4));
//        
//        ArrayList<Airport> enes = (ArrayList<Airport>) airportRepository.findAll();
//        System.out.println("enes : " + gson.toJson(enes));
//       
//    }
//}





package com.turkishTechnology.airportservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.turkishTechnology.airportservice.model.Airport;
import com.turkishTechnology.airportservice.model.City;
import com.turkishTechnology.airportservice.model.Country;
import com.turkishTechnology.airportservice.repository.AirportRepository;
import com.turkishTechnology.airportservice.repository.CityRepository;
import com.turkishTechnology.airportservice.repository.CountryRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    //private final AirportRepository airportRepository;
	
	Gson gson = new Gson();
	
	@Autowired
	AirportRepository airportRepository;
	
	@Autowired
    CityRepository cityRepository; 
    @Autowired
    CountryRepository countryRepository;

    public DataInitializer(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public void run(String... args) throws Exception {
    	City city1 = new City("Istanbul","IST");
    	City city2 = new City("Antalya","AYT");
//    	City city3 = new City("namecity3","codecity3");
//    	City city4 = new City("namecity4","codecity4");
    	
    	cityRepository.saveAll(List.of(city1, city2));
    	
    	Country country1 = new Country("Turkey","TR");
    	Country country2 = new Country("Turkey","TR");
//    	Country country3 = new Country("namecountry3","codecountry3");
//    	Country country4 = new Country("namecountry4","codecountry4");
    	countryRepository.saveAll(List.of(country1, country2));
    	
        Airport airport1 = new Airport("Istanbul Airport", "IST", city1, country1);
        Airport airport2 = new Airport("Antalya Airport", "AYT", city2,country2);
//        Airport airport3 = new Airport("Airport 3", "Country 3", city3, country3);
//        Airport airport4 = new Airport("Airport 4", "Country 4", city4, country4);

        airportRepository.saveAll(List.of(airport1, airport2));
        
        ArrayList<Airport> enes = (ArrayList<Airport>) airportRepository.findAll();
        //System.out.println("enes : " + gson.toJson(enes));
       
    }
}

