package com.mbooking.Entities;

import javax.persistence.*;

@Entity
public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer seatId;
	
	@Column(name="seatNumber")
	String seatNumber;
	
	enum type{NotAvailable,Available};
	
	@Column(name="screenId")
	String screenId;

	public Integer getSeatId() {
		return seatId;
	}

	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public Seat(Integer seatId, String seatNumber, String screenId) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.screenId = screenId;
	}

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
