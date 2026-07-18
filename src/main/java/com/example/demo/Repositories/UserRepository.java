package com.example.demo.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long> {
    
   Optional<UserModel> findById(Long id); 
}
