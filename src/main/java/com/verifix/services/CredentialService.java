package com.verifix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifix.exceptions.UserNotFoundException;
import com.verifix.models.Credentials;
import com.verifix.repository.CredentialRepository;

@Service
public class CredentialService {

	@Autowired
	CredentialRepository credentialRepository;
	
	public boolean mapCredentials(Credentials credentials) throws UserNotFoundException {
		
		Credentials creds = credentialRepository.findOne(credentials.getUsername());
		
		if(creds == null) {
			throw new UserNotFoundException("user does not exist");
		}
		
		if(credentials.getPassword().equals(creds.getPassword())) {
			return true;
		} else {
			return false;
		}
	}
}
