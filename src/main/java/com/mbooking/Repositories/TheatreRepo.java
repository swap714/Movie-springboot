package com.mbooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbooking.Entities.Theatre;
public interface TheatreRepo extends JpaRepository<Theatre, String > {

}
