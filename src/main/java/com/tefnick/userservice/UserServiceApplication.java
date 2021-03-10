package com.tefnick.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
		//app.run();
	}
//	public void run(String... args) throws Exception {
//		System.out.println("using environment: " + myConfig.getEnvironment());
//		System.out.println("name: " + myConfig.getName());
//		System.out.println("enabled:" + myConfig.isEnabled());
//		System.out.println("servers: " + myConfig.getServers());
//	}

}
