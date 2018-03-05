package com.verifix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifix.models.Project;
import com.verifix.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	public ProjectService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Project> findAllProjects() {
		return projectRepository.findAll();
	}

}
