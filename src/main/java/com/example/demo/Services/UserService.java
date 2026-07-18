package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Models.UserModel;
import com.example.demo.Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    @GetMapping
    public List<UserModel> getAllUsers(){
         List<UserModel> users = userRepository.findAll();
         return  users;
    }

    @GetMapping("{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long userId){
         return userRepository.findById(userId);
    }

    @PostMapping()
    public String saveUser(@RequestBody UserModel user){
          userRepository.save(user);
          return "user created successfully" + user;
    }
}


    
