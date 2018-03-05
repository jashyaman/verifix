package com.verifix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifix.models.UploadLog;
import com.verifix.repository.UploadLogRepository;

@Service
public class UploadLogService {

	@Autowired
	UploadLogRepository uploadLogRepository;
	
	public UploadLogService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<UploadLog> findAllUploadLogs() {
		return uploadLogRepository.findAll();
	}
}
