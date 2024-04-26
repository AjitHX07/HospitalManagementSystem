package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.UserService;
import com.HospitalManagementSystem.dto.User;

public class TestSaveUser {
public static void main(String[] args) {
	User user = new User();
	user.setName("joyal");	
	user.setEmail("joyal@gmail.com");	
	user.setPhno(8974562220l);
	user.setPassword("chandru");
	user.setRole("SE");	
	UserService userService = new UserService();
	userService.saveUser(user);
}
}
