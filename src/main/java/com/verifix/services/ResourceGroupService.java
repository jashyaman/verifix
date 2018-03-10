package com.verifix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifix.models.ResourceGroup;
import com.verifix.repository.ResourceGroupRepository;

@Service
public class ResourceGroupService {
	
	
	@Autowired
	ResourceGroupRepository resourceGroupRepository;
	
	public ResourceGroupService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<ResourceGroup> findAllResourceGroups() {
		return resourceGroupRepository.findAll();
	}

}
