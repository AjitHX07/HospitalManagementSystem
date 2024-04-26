package com.HospitalManagementSystem.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.HospitalManagementSystem.dao.Itemdao;
import com.HospitalManagementSystem.dto.Branch;
import com.HospitalManagementSystem.dto.Item;
import com.HospitalManagementSystem.dto.MedOrder;

public class ItemDaoImp implements Itemdao {

	public Item saveItem(int mid, Item item) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		MedOrder medOrder = entityManager.find(MedOrder.class, mid);
		if (medOrder != null) {
			entityTransaction.begin();
			entityManager.persist(item);
			entityTransaction.commit();
			return item;
		} else {
			return null;
		}
	}

	public Item getItemById(int iid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Item item = entityManager.find(Item.class, iid);
		return item;
	}

	public List<Item> getAllItems() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from Item s";
		Query query = entityManager.createQuery(sql);
		List<Item> items = query.getResultList();
		return items;
	}

	public boolean deleteItemById(int iid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Item item = entityManager.find(Item.class, iid);
		if (item != null) {
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
