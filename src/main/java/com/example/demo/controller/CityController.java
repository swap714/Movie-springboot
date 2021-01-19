package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.City;
import com.example.demo.service.CityService;

@RestController
public class CityController {

	@Autowired
	CityService service;
	
	@GetMapping("/city")
	public List<City> fetchByCityName(String city)
	{
		return this.service.fetchByCityName(city);
		
	}
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/city")
//	public User fetchByCity(@RequestParam String city)
//	{
//		this.service.fetchByCity(city);
//	}
}
