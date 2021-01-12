package com.mbooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbooking.Entities.City;
public interface CityRepo extends JpaRepository<City, Integer > {

}
