package com.example.UserManagementSpringWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserManagementSpringWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementSpringWebAppApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "sangeevan") String name){
		return String.format("Hello %s", name);
	}

}
