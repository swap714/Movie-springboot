package com.mbooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;

import com.mbooking.Entities.User;
public interface UserRepo extends JpaRepository<User, Integer > {
 
	User findByUserName(String userName);
	
  	
}
