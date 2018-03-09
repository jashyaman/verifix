package com.verifix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifix.models.Resource;
import com.verifix.repository.ResourceRepository;

@Service
public class ResourceService {
	
	
	
	@Autowired
	ResourceRepository resourceRepository;
	
	public ResourceService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Resource> findAllResources() {
		return resourceRepository.findAll();
	}

}
