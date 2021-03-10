package com.tefnick.userservice.controller;

import com.tefnick.profileService.model.ProfileDTO;
import com.tefnick.profileService.model.service.ProfileRepo;
import com.tefnick.userservice.model.User;
import com.tefnick.userservice.model.UserDTO;
import com.tefnick.userservice.service.UserRepository;
import com.tefnick.userservice.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.datatransfer.Clipboard;
import java.util.List;
@Getter
@Setter
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfileRepo profileRepo;

    @GetMapping("/user")
    public UserDTO getAllUsers() {
        return userRepository.getAllUsers();
    }
    @GetMapping("profiles")
    public ProfileDTO getProfile(){ return profileRepo.getProfile();    }
}
