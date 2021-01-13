package com.mbooking.Entities;

import javax.persistence.*;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer userid;
	String username;
	String userpassword;
	String email;
	String phone;

	public Integer getUserId() {
		return userid;
	}

	public void setUserId(Integer userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userpassword;
	}

	public void setUserPassword(String userpassword) {
		this.userpassword = userpassword;
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

	public User(Integer userid, String username, String userpassword, String email, String phone) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.email = email;
		this.phone = phone;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
