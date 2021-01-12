package com.mbooking.Entities;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class payment {
	
	@Id
	Integer paymentId;
	
	@Column(name = "amount")
	Integer amount;
	
	@Column(name = "timeStamp", insertable = false, updatable = false)
	LocalDateTime timeStamp;
	
	enum paymentStatus{paid,unpaid};
	
	@Column(name = "bookingId")
	Integer bookingId;

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public payment(Integer paymentId, Integer amount, LocalDateTime timeStamp, Integer bookingId) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.timeStamp = timeStamp;
		this.bookingId = bookingId;
	}

	public payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
