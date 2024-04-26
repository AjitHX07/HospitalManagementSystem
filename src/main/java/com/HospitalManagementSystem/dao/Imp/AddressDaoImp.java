package com.HospitalManagementSystem.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.HospitalManagementSystem.dao.Addressdao;
import com.HospitalManagementSystem.dto.Address;
import com.HospitalManagementSystem.dto.Branch;

public class AddressDaoImp implements Addressdao {

	public Address saveAddress(int bid, Address address) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Branch branch = entityManager.find(Branch.class, bid);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.persist(address);
			entityTransaction.commit();
			return address;
		} else {
			return null;
		}
	}

	public Address getAddressById(int aid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Address address = entityManager.find(Address.class, aid);
		return address;
	}

	public boolean deleteAddressById(int aid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Address address = entityManager.find(Address.class, aid);
		if (address != null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public List<Address> getAllAddress() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from Address s";
		Query query = entityManager.createQuery(sql);
		List<Address> addresses = query.getResultList();
		return addresses;
	}

}
