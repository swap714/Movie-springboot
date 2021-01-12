package com.mbooking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbooking.Entities.User;
import com.mbooking.service.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService userService ;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return this.userService.getAllUsers();
	}
	
}
