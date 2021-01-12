package com.mbooking.Entities;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
public class Booking {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	Integer bookingId;
	Integer noOfSeats;
	Integer userId;
	Integer showId;
	enum status{confirm, notconfirm};
	
    @Column
    LocalDateTime timestamp;
	
	
	public Integer getBookingId() {
		return bookingId;
	}
	
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", noOfSeats=" + noOfSeats + ", userId=" + userId + ", showId="
				+ showId + ", timestamp=" + timestamp + "]";
	}
	
	

}
