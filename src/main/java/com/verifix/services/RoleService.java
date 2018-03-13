package com.verifix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifix.dao.RoleRoleGroupUserDao;
import com.verifix.models.Role;
import com.verifix.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	RoleRoleGroupUserDao roleDao;
	
	public List<Role> findAllRoles() {
		return roleRepository.findAll();
	}

	/*
	 * find role groups under which user id is present
	 * return list of roles present within rolegroup 
	 */
	public List<Role> findUserRoles(String userid) {
		return roleDao.findUserRoles(userid);
	}
}
