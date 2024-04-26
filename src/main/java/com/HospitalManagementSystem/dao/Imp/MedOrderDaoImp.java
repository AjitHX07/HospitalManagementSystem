package com.HospitalManagementSystem.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.HospitalManagementSystem.dao.MedOrderdao;
import com.HospitalManagementSystem.dto.Branch;
import com.HospitalManagementSystem.dto.Encounter;
import com.HospitalManagementSystem.dto.MedOrder;

public class MedOrderDaoImp implements MedOrderdao {

	public MedOrder saveMedOrder(int eid, MedOrder medOrder) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Encounter encounter = entityManager.find(Encounter.class, eid);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.persist(medOrder);
			entityTransaction.commit();
			return medOrder;
		} else {
			return null;
		}
	}

	public MedOrder getMedOrderById(int mid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		MedOrder medOrder = entityManager.find(MedOrder.class, mid);
		return medOrder;
	}

	public List<MedOrder> getAllMedOrders() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from MedOrder s";
		Query query = entityManager.createQuery(sql);
		List<MedOrder> medOrders = query.getResultList();
		return medOrders;
	}

	public boolean deleteMedOrderById(int mid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		MedOrder medOrder = entityManager.find(MedOrder.class, mid);
		if (medOrder != null) {
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public MedOrder getMedOrderByDoctorName(String name) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from MedOrder s where dname = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1,name);
		List<MedOrder> medOrders = query.getResultList();
		if (medOrders.size() > 0) {
			MedOrder medOrder=medOrders.get(0);
			return medOrder;
		} else {
			System.out.println("no data found");
			return null;
		}
	}

	public MedOrder getMedOrderByDate(String date) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from MedOrder s where orderdate = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1,date);
		List<MedOrder> medOrders = query.getResultList();
		if (medOrders.size() > 0) {
			MedOrder medOrder=medOrders.get(0);
			return medOrder;
		} else {
			System.out.println("no data found");
			return null;
		}
	}

}
