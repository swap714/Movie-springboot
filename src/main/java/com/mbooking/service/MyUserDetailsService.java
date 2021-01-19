package com.mbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mbooking.Entities.User;
import com.mbooking.Repositories.UserRepo;
import com.mbooking.secuity.UserPrincipal;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		User user = repo.findByUserName(userName);
		if(user==null)
			throw new UsernameNotFoundException("User not found");
		
		return new UserPrincipal(user);
	}

}
