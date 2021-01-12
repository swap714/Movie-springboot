package com.mbooking.Entities;

import javax.persistence.*;

@Entity
public class Screen {
	
	@Id
	String screenId;
	
	@Column(name="totalNoOfSeats")
	Integer totalNoOfSeats;
	
	@Column(name="theatreId")
	String theatreId;

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public Integer getTotalNoOfSeats() {
		return totalNoOfSeats;
	}

	public void setTotalNoOfSeats(Integer totalNoOfSeats) {
		this.totalNoOfSeats = totalNoOfSeats;
	}

	public String getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(String theatreId) {
		this.theatreId = theatreId;
	}

	public Screen(String screenId, Integer totalNoOfSeats, String theatreId) {
		super();
		this.screenId = screenId;
		this.totalNoOfSeats = totalNoOfSeats;
		this.theatreId = theatreId;
	}

	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
