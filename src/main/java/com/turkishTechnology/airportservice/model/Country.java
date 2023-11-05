package com.turkishTechnology.airportservice.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Country implements Serializable {
    private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;

    @OneToMany(mappedBy = "country",fetch = FetchType.LAZY)
    //@JsonManagedReference
    @JsonBackReference
    private List<Airport> airport;
    
    
	 public Country() {
			
}


public Country(String name, String code) {

this.code = code;
this.name = name;

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


public List<Airport> getAirport() {
	return airport;
}


public void setAirport(List<Airport> airport) {
	this.airport = airport;
}

}
