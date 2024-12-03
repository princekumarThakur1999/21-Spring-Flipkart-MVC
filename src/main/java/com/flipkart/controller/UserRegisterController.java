package com.flipkart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.request.UserRegisterRequest;
import com.flipkart.request.UserRegisterResponse;

@RestController
@RequestMapping("/user")
public class UserRegisterController {
	
	@PostMapping("/register")
	public String addUserRegisteration(@RequestBody UserRegisterRequest register) {
		
		return "successfully user created.";
	}
	
	@GetMapping("/get/detail")
	public UserRegisterResponse getUserDetail() {
		
		//Repository to service to Controller
		//just to dummy purpose i have create the userdetails here
		UserRegisterResponse response = new UserRegisterResponse();
		response.setId(2);
		response.setName("Prince kumar Charie");
		response.setMarks(87);
		
		//java object should be convert to Json format --> automatically
		return response;
	}
	
	@GetMapping("/get/alldetail")
	public List<UserRegisterResponse> getAllUserDetail() {
		
		List<UserRegisterResponse> allusers = new ArrayList<>();
		
		//Repository to service to Controller
		//just to dummy purpose i have create the userdetails here
		UserRegisterResponse user1 = new UserRegisterResponse();
		user1.setId(2);
		user1.setName("Prince kumar Charie");
		user1.setMarks(87);
		
		UserRegisterResponse user2 = new UserRegisterResponse();
		user2.setId(3);
		user2.setName("Priyanshi Thakur");
		user2.setMarks(97);
		
		UserRegisterResponse user3 = new UserRegisterResponse();
		user3.setId(4);
		user3.setName("Sudeshna Singh");
		user3.setMarks(77);
		
		allusers.add(user1);
		allusers.add(user2);
		allusers.add(user3);
		
		//java object should be convert to Json format --> automatically
		return allusers;
	}
}
