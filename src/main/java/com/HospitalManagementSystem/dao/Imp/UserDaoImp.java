package com.HospitalManagementSystem.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.HospitalManagementSystem.dao.Userdao;
import com.HospitalManagementSystem.dto.MedOrder;
import com.HospitalManagementSystem.dto.Observation;
import com.HospitalManagementSystem.dto.User;

public class UserDaoImp implements Userdao {

	public User saveUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUserById(int uid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User user = entityManager.find(User.class, uid);
		return user;
	}

	public boolean deleteUserById(int uid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = entityManager.find(User.class, uid);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public User updateUserById(int uid, User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user1 = entityManager.find(User.class, uid);
		if (user1 != null) {
			user1.setName(user.getName());
			user1.setEmail(user.getEmail());
			user1.setRole(user.getRole());
			entityTransaction.begin();
			entityManager.merge(user1);
			entityTransaction.commit();
			return user1;
		} else {
			return user;
		}
	}

	public List<User> getAllUsers() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from User s";
		Query query = entityManager.createQuery(sql);
		List<User> users = query.getResultList();
		return users;
	}

	public User getUserBYName(String name) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from User s where name = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1,name);
		List<User> users = query.getResultList();
		if (users.size() > 0) {
			User user=users.get(0);
			return user;
		} else {
			System.out.println("no data found");
			return null;
		}
	}

	public User getUserByRole(String role) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from User s where role = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1,role);
		List<User> users = query.getResultList();
		if (users.size() > 0) {
			User user=users.get(0);
			return user;
		} else {
			System.out.println("no data found");
			return null;
		}

	}

}
