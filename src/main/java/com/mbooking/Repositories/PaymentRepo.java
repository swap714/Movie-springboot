package com.mbooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbooking.Entities.payment;
public interface PaymentRepo extends JpaRepository<payment, Integer > {

}
