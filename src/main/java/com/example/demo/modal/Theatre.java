package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Theatre {

	@Id
	public String theatreid;
	public String theatrename;
	public Integer totalscreens;
	

	@ManyToOne
	@JoinColumn(name= "city_zipcode")
	private City city;

	public String getTheatreid() {
		return theatreid;
	}

	public void setTheatreid(String theatreid) {
		this.theatreid = theatreid;
	}

	public String getTheatrename() {
		return theatrename;
	}

	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}

	public Integer getTotalscreens() {
		return totalscreens;
	}
	

	public void setTotalscreens(Integer totalscreens) {
		this.totalscreens = totalscreens;
	}

	public Theatre() {
		 
	}
	
	
	
	
}
