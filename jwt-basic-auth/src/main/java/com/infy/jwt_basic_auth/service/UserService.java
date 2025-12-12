package com.infy.jwt_basic_auth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infy.jwt_basic_auth.model.User;

@Service
public class UserService {
	List<User> list = new ArrayList<>();

	public UserService() {
		//super();
		//this.list = list;
		list.add(new User("abc","abc", "abc@gmail.com"));
		list.add(new User("xyz","abcxyz", "xyz@gmail.com"));
		
	}
	// get all users
	 public List<User> getAllusers() {
		return this.list;
		 
	 }
	

}

