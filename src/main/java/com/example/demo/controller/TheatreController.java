package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Theatre;
import com.example.demo.service.TheatreService;

@RestController
public class TheatreController {
	
	@Autowired
	TheatreService service;

	@GetMapping("/theatre")
	public List<Theatre> fetchByZipcode(Integer y)
	{
		return this.service.fetchByZipcode(y);
		
	}
}
