package com.infy.jwt_basic_auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.jwt_basic_auth.model.User;
import com.infy.jwt_basic_auth.service.UserService;

//import com.mohit.jwtsecurity.models.User;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userService;
	

	@GetMapping("/users")
	public List<User> getAllUsers(){
		return this.userService.getAllusers();

	
	}

}
