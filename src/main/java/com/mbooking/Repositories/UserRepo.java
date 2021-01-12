package com.mbooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbooking.Entities.User;
public interface UserRepo extends JpaRepository<User, Integer > {

	
}
