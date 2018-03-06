package com.verifix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verifix.models.RoleGroup;

@Repository
public interface RoleGroupRepository extends JpaRepository<RoleGroup, String> {

}
