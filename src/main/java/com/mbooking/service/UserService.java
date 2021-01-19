package com.mbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mbooking.Entities.User;
import com.mbooking.Repositories.UserRepo;

@Service
public class UserService {

	@Autowired
	public UserRepo userRepo;
	
	public List<User> getAllUsers() 
	{
		return userRepo.findAll();
	}
	
	
	public User addUser(@RequestBody User user)
 	{

	if(userRepo.existsById(user.getUserId()))
  		
		user.setUserId(0);
		
		else		
			userRepo.save(user);
	 return user;
 	}
	
	public String removeUser(User userId) {
		
		userRepo.delete(userId);
		return userId+" deleted";
	}
	
	
	
	
	
	
	
	
	
	
	
//	public User addUser(@RequestBody User user)
//     	{
//
//		if(userRepo.existsById(user.getUserId()))
//	  		
//  			user.setUserId(0);
//  		
//  		else
//  			 userRepo.save(user);
//		 return user;
//     	}
//	


//    User findByEmail(String email);
//
//    User findByPhone(String phone);
//
//    User findByUserId(Integer userid);
//
//    void delete(Integer userid);
//
//    void update(User user);
//
//      void add(User user);
      
      
  	
}
