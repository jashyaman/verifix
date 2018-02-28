package com.verifix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifix.model.User;
import com.verifix.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	public List<User> getAllUsers() {

		return userRepository.findAll();
	}
	
	

}
