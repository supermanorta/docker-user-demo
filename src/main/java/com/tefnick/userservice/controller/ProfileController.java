package com.tefnick.userservice.controller;

import com.tefnick.userservice.model.ProfileDTO;
import com.tefnick.userservice.service.ProfileRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@RestController
public class ProfileController {
    @Autowired
    private ProfileRepo profileRepo;


    /***
     *
     * @return value of currently selected spring profile
     */
    @GetMapping("/profiles")
    public ProfileRepo getProfile(){ return profileRepo;    }

    @GetMapping("/test")
    public String getString(){
        System.out.println("Hola");
        return "Hey, Sup";
    }
}
