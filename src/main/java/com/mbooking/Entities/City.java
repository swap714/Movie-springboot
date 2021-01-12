package com.mbooking.Entities;

import javax.persistence.*;

@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer zipCode;
	String cityName;
	String state;

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public City(Integer zipCode, String cityName, String state) {
		super();
		this.zipCode = zipCode;
		this.cityName = cityName;
		this.state = state;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "City [zipCode=" + zipCode + ", cityName=" + cityName + ", state=" + state + "]";
	}
	
	
	

}
