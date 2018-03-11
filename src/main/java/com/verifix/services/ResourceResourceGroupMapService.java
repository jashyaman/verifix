package com.verifix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifix.models.ResRgMap;
import com.verifix.repository.ResrgMapRepository;

@Service
public class ResourceResourceGroupMapService {
	
	
	@Autowired
	private ResrgMapRepository resrgRepository;

	public List<ResRgMap> findResourceOfResourceGroup(int resourceGroupId) {
		// TODO Auto-generated method stub
		return resrgRepository.findAllById(resourceGroupId);
	}
	
	

}
