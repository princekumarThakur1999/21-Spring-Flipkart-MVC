package com.flipkart.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRegisterController {
	
	@PostMapping("/register")
	public String addUserRegisteration(@RequestBody UserRegister register) {
		
		return "successfully user created.";
	}
}
