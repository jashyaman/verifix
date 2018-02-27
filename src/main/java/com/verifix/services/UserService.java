package com.verifix.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.verifix.model.User;

@Service
public class UserService {
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	public List<User> getAllUsers() {

		return userRepository.getAllUsers();
	}
	
	
	

}
