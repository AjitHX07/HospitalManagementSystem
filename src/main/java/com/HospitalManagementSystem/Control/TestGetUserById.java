package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.UserService;
import com.HospitalManagementSystem.dto.User;

public class TestGetUserById {
	public static void main(String[] args) {
		UserService userService = new UserService();
		User user = userService.getUserById(2);
		if(user!=null)
		{
			System.out.println("User id is : "+user.getUid());
			System.out.println("User name is : "+user.getName());
			System.out.println("User email is : "+user.getEmail());
			System.out.println("User phone number  is : "+user.getPhno());
			System.out.println("User password is : "+user.getPassword());
			System.out.println("User role is : "+user.getRole());
		}
		else
		{
			System.out.println("User Details not found!");
		}
	}
}
