package com.tefnick.userservice;

import com.tefnick.userservice.model.DataSrc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//if we wanted to use say other packages for the project that did
//not fall below the main file
//we could add them to @SpringBootApplication(scanBadePackages=defaultPath.where.the.main.lives,path.path.packageNeeded)
@SpringBootApplication
public class UserServiceApplication {
	@Autowired
	DataSrc pModel;



	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);

	}
}
