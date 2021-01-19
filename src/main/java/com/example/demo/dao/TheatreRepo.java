package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.modal.Theatre;

public interface TheatreRepo extends JpaRepository<Theatre,String> {

	@Query("from Theatre where city_zipcode = :x")
	List<Theatre> oncat(@Param("x") Integer y);

	
}
