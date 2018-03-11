package com.verifix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifix.models.ModificationLogs;
import com.verifix.repository.ModificationLogRepository;

@Service
public class ModificationLogsService {
	
	@Autowired
	ModificationLogRepository modificationLogRepository;
	
	public List<ModificationLogs> findAllModificationLogs() {
		return modificationLogRepository.findAll();
	}

}
