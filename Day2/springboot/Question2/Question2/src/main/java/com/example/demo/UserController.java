package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/{userName}/{userPass}")
	public String validate(@PathVariable String userName, @PathVariable String userPass) {
		return userService.auth(userName, userPass);
	}
	
	@PostMapping(value="/user")
	public String addTopic(@RequestBody User user) {
		userService.addUser(user);
		return "New user added";
	}
}