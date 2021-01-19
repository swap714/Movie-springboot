package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class City {

	@Id
	Integer zipcode;
	String cityname;
	String state;
		
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getCityname() {
		return cityname;
	}
	
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public City() {
		
	}
	
	
}
