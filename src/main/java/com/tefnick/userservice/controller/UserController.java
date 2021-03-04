package com.tefnick.userservice.controller;

import com.tefnick.userservice.model.User;
import com.tefnick.userservice.model.UserDTO;
import com.tefnick.userservice.service.UserRepository;
import com.tefnick.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public UserDTO getAllUsers() {
        return userRepository.getAllUsers();
    }
}
