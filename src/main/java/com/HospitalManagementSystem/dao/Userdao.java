package com.HospitalManagementSystem.dao;

import java.util.List;

import com.HospitalManagementSystem.dto.User;

public interface Userdao {
	public User saveUser(User user);

	public User getUserById(int uid);

	public boolean deleteUserById(int uid);

	public User updateUserById(int uid, User user);

	public List<User> getAllUsers();

	public User getUserBYName(String name);

	public User getUserByRole(String role);
}
