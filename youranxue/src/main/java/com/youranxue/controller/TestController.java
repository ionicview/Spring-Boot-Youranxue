package com.youranxue.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youranxue.db.User;

@RestController
public class TestController {

	@GetMapping("/public")
	@CrossOrigin
	public String publicService() {
		return "This message is public";
	}

	@GetMapping("/secret")
	@CrossOrigin
	public User secretService() {

		User user = new User();
		user.setLastName("admin.last");
		user.setUsername("admin");
		user.setFirstName("admin.first");
		return user;
	}

}
