package com.verifix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verifix.models.Credentials;

@Repository
public interface CredentialRepository extends JpaRepository<Credentials, String> {

}
