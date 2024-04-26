package com.HospitalManagementSystem.Services;

import java.util.List;

import com.HospitalManagementSystem.dao.Imp.UserDaoImp;
import com.HospitalManagementSystem.dto.User;

public class UserService {
	public void saveUser(User user) {
		UserDaoImp userDaoImp = new UserDaoImp();
		User user1 = userDaoImp.saveUser(user);
		if (user1 != null) {
			System.out.println("User Saved!");
		} else {
			System.out.println("User Not Saved!");

		}
	}

	public User getUserById(int uid) {
		UserDaoImp userDaoImp = new UserDaoImp();
		User user1 = userDaoImp.getUserById(uid);
		if (user1 != null) {
			return user1;
		} else {
			return null;
		}
	}

	public void deleteUserById(int uid) {
		UserDaoImp userDaoImp = new UserDaoImp();
		boolean flag = userDaoImp.deleteUserById(uid);
		if (flag) {
			System.out.println("User Deleted!");
		} else {
			System.out.println("User Not Deleted!");
		}
	}

	public User updateUserById(int uid, User user) {
		UserDaoImp userDaoImp = new UserDaoImp();
		User user1 = userDaoImp.updateUserById(uid, user);
		if (user1 != null) {
			return user1;
		} else {
			return null;
		}
	}

	public List<User> getAllUsers() {
		UserDaoImp userDaoImp = new UserDaoImp();
		List<User> user1 = userDaoImp.getAllUsers();
		if (user1.size() > 0) {
			return user1;
		} else {
			return null;
		}
	}

	public User getUserBYName(String name) {
		UserDaoImp userDaoImp = new UserDaoImp();
		User user1 = userDaoImp.getUserBYName(name);
		if (user1 != null) {
			return user1;
		} else {
			return null;
		}
	}

	public User getUserByRole(String role) {
		UserDaoImp userDaoImp = new UserDaoImp();
		User user1 = userDaoImp.getUserByRole(role);
		if (user1 != null) {
			return user1;
		} else {
			return null;
		}
	}
}
