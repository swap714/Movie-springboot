package com.mbooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbooking.Entities.Movie;

public interface Movierepo extends JpaRepository<Movie, Integer>{

	
}
