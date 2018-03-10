package com.verifix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verifix.models.ResourceGroup;

@Repository
public interface ResourceGroupRepository extends JpaRepository<ResourceGroup, String> {

}
