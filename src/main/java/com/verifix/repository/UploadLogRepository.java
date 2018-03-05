package com.verifix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verifix.models.UploadLog;

@Repository
public interface UploadLogRepository extends JpaRepository<UploadLog, String> {

}
