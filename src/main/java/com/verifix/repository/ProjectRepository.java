package com.verifix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verifix.models.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> { // what exactly does string represent? 

}
