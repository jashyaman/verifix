package com.verifix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verifix.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
