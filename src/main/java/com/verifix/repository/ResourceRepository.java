package com.verifix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verifix.models.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, String> {

}
