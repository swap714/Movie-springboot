package com.mbooking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String home()
	{
		return "Home.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout.jsp";
	}
	
//	@RequestMapping("/error")
//	public String error()
//	{
//		return "error.jsp";
//	}
	
}
