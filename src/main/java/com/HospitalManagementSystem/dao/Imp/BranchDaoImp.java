package com.HospitalManagementSystem.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.HospitalManagementSystem.dao.Branchdao;
import com.HospitalManagementSystem.dto.Branch;
import com.HospitalManagementSystem.dto.Hospital;

public class BranchDaoImp implements Branchdao {

	public Branch saveBranch(int hid, Branch branch) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Hospital hospital = entityManager.find(Hospital.class, hid);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
			return branch;
		} else {
			return null;
		}
	}

	public Branch getBranchById(int bid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Branch branch = entityManager.find(Branch.class, bid);
		return branch;
	}

	public List<Branch> getAllBranch() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from Branch s";
		Query query = entityManager.createQuery(sql);
		List<Branch> branchs = query.getResultList();
		return branchs;
	}

	public boolean deletetBranchById(int bid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Branch branch = entityManager.find(Branch.class, bid);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
