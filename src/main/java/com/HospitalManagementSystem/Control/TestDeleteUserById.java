package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.UserService;

public class TestDeleteUserById {
	public static void main(String[] args) {
	UserService userService = new UserService();
	userService.deleteUserById(1);
	}
}
