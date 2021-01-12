package com.mbooking.Entities;

import javax.persistence.*;

@Entity
public class ShowSeat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer showSeatId;
	
	enum status{notAvailable,available};
	
	@Column(name="price")
	Integer price;
	
	@Column(name="showId")
	Integer showId;
	
	@Column(name="bookingId")
	Integer bookingId;
	
	@Column(name="seatId")
	Integer seatId;

	public Integer getShowSeatId() {
		return showSeatId;
	}

	public void setShowSeatId(Integer showSeatId) {
		this.showSeatId = showSeatId;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Integer getSeatId() {
		return seatId;
	}

	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}

	public ShowSeat(Integer showSeatId, Integer price, Integer showId, Integer bookingId, Integer seatId) {
		super();
		this.showSeatId = showSeatId;
		this.price = price;
		this.showId = showId;
		this.bookingId = bookingId;
		this.seatId = seatId;
	}

	public ShowSeat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
