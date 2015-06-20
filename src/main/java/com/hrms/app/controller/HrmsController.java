package com.hrms.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hrms.app.core.domain.User;
import com.hrms.app.persistence.service.UserService;

@Controller
public class HrmsController
{
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/")
	public String index()
	{
		User user=new User();
		user.setUserName("tom");
		user.setPassword("pass");
		user.setEnabled(true);
		//userService.create(user);
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String login()
	{
		return "login";
	}
	
	@PreAuthorize("hasAuthority('USER')")
	@RequestMapping(value="/home")
	public String home()
	{
		return "home";
	}
	
	//@RequestMapping(value="/logout", method=RequestMethod.POST)
	public String logout()
	{
		return "login";//"redirect:/?logout";
	}
	@RequestMapping(value="/403")
	public String accessDenied(){
		return "403";
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping(value="/add-user")
	public String addUser(){
		return "admin/add_user";
	}
}
