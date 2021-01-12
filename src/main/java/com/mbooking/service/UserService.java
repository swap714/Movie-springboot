package com.mbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
//    void add(User user);
    
    
}
