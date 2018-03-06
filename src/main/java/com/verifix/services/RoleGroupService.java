package com.verifix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifix.models.RoleGroup;
import com.verifix.repository.RoleGroupRepository;

@Service
public class RoleGroupService {

	@Autowired
	RoleGroupRepository roleGroupRepository;
	
	public List<RoleGroup> findAllRoleGroups() {
		return roleGroupRepository.findAll();
	}
}
