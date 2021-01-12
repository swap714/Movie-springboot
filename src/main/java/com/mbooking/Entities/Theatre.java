package com.mbooking.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Theatre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String theatreId;
	
	@Column(name="theatreName")
	String theatreName;
	
	@Column(name="totalScreens")
	Integer totalScreens;
	
	@Column(name="zipCode")
	Integer zipCode;

	public String getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(String theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public Integer getTotalScreens() {
		return totalScreens;
	}

	public void setTotalScreens(Integer totalScreens) {
		this.totalScreens = totalScreens;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Theatre(String theatreId, String theatreName, Integer totalScreens, Integer zipCode) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.totalScreens = totalScreens;
		this.zipCode = zipCode;
	}

	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
