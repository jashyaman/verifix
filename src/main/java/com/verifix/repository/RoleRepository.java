package com.verifix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verifix.models.Role;

public interface RoleRepository extends JpaRepository<Role, String>{
	

}
