package com.mbooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbooking.Entities.Booking;
public interface BookingRepo extends JpaRepository<Booking, Integer > {

	
}
