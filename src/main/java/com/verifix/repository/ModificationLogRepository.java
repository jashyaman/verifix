package com.verifix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verifix.models.ModificationLogs;

@Repository
public interface ModificationLogRepository extends JpaRepository<ModificationLogs, String> {

}
