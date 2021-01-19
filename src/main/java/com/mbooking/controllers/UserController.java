package com.mbooking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mbooking.Entities.User;
import com.mbooking.Repositories.UserRepo;
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
	
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user)
 	{

	return this.userService.addUser(user);
 	}
	
	@DeleteMapping(value = "/delete")
	public String removeUser(@RequestParam User userId)
	{
		return this.userService.removeUser(userId);
	}
	
	
		
	
	
	

//	@PostMapping("/registration")
//	public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
////		userValidator.validate(userForm, bindingResult);
////
////		if (bindingResult.hasErrors()) {
////         return "registration";
////		}
//
//		userService.addUser(userForm);
//
//		//securityService.autologin(userForm.getUsername(), userForm.getPassword());
//
//		return "welcome";
//	}
	

  		
}
