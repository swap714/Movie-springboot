package com.mbooking.Entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer userId;
	
	String userName;
	
	String userPassword;
	
	String email;
	
	String phone;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User(Integer userId, String userName, String userPassword, String email, String phone) {
		
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
		this.phone = phone;
	}

	public User() {
		
		// TODO Auto-generated constructor stub
	}

	
	
}
