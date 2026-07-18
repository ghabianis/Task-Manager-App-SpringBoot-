package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.UserModel;
import com.example.demo.Services.UserService;

import lombok.RequiredArgsConstructor;



@RestController()
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping()
    public List<UserModel> getAllUsersList() {
        return userService.getAllUsers();
    }

    @PostMapping()
    public String saveUser(@RequestBody UserModel user) {
        
        return userService.saveUser(user);
    }
    
    

}
