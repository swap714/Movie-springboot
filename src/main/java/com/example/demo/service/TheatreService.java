package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TheatreRepo;
import com.example.demo.modal.Theatre;

@Service
public class TheatreService {
	
	@Autowired
	TheatreRepo repo;

	public List<Theatre> fetchByZipcode(Integer y)
	{
		return repo.oncat(y);
		
	}
}
