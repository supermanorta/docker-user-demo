package com.tefnick.userservice.controller;


import com.tefnick.userservice.model.UserDTO;
import com.tefnick.userservice.service.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Getter
@Setter
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;



    @GetMapping("/user")
    public UserDTO getAllUsers() {
        return userRepository.getAllUsers();
    }

    @GetMapping("/users")
    public UserDTO getAllUser() {
        return userRepository.getAllUsers();
    }
}
