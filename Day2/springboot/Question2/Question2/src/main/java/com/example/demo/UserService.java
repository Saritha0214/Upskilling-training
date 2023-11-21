package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	public String auth(String userName, String userPass) {
		java.util.Optional<User> user = userRepository.findById(userName);
		String str1 = user.get().getUserName();
		String str2 = user.get().getUserPass();
	
		if((str1.equals(userName))&&(str2.equals(userPass))) {
			return "Valid User";
		}
		else {
			return "Invalid User";
		}
	}
	public void addUser(User user) {
		userRepository.save(user);
	}
}