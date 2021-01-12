package com.mbooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbooking.Entities.Seat;
public interface SeatRepo extends JpaRepository<Seat, Integer > {

}
