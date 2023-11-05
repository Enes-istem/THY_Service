//package com.turkishTechnology.airportservice.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Airport {
//	
//	 @Id
//	 @GeneratedValue(strategy = GenerationType.IDENTITY)
//	 private Long id;
//	 private String code;
//	 private String name;
//	 private String city;
//	 private String country;
//	 
//	 
//	 public Airport() {
//			
//		}
//	 
//	 
//	 public Airport(String code, String name, String city, String country) {
//		super();
//		this.code = code;
//		this.name = name;
//		this.city = city;
//		this.country = country;
//	}
//	 public Long getId() {
//			return id;
//		}
//	 
//	 
//	public String getCode() {
//		return code;
//	}
//	public void setCode(String code) {
//		this.code = code;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getCountry() {
//		return country;
//	}
//	public void setCountry(String country) {
//		this.country = country;
//	}
//	
//
//}





package com.turkishTechnology.airportservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Airport implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "city_id")
    //@JsonBackReference
    @JsonManagedReference
    private City city;

    
    @ManyToOne
    @JoinColumn(name = "country_id")
    //@JsonBackReference
    @JsonManagedReference
    private Country country;

    private String name;
    private String code;
    
	 public Airport() {
	
}


public Airport(String code, String name, City city, Country country) {

this.code = code;
this.name = name;
this.city = city;
this.country = country;
}


public City getCity() {
	return city;
}


public void setCity(City city) {
	this.city = city;
}


public Country getCountry() {
	return country;
}


public void setCountry(Country country) {
	this.country = country;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCode() {
	return code;
}


public void setCode(String code) {
	this.code = code;
}

  
}

