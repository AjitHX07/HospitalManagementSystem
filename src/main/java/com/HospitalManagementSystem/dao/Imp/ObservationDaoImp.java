package com.HospitalManagementSystem.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.HospitalManagementSystem.dao.Observationdao;
import com.HospitalManagementSystem.dto.Branch;
import com.HospitalManagementSystem.dto.Encounter;
import com.HospitalManagementSystem.dto.MedOrder;
import com.HospitalManagementSystem.dto.Observation;

public class ObservationDaoImp implements Observationdao {

	public Observation saveObservation(int eid, Observation observation) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Encounter encounter = entityManager.find(Encounter.class, eid);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.persist(observation);
			entityTransaction.commit();
			return observation;
		} else {
			return null;
		}
	}

	public Observation getObservationById(int oid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Observation observation = entityManager.find(Observation.class, oid);
		return observation;
	}

	public List<Observation> getAllObservations() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from Observation s";
		Query query = entityManager.createQuery(sql);
		List<Observation> observations = query.getResultList();
		return observations;
	}

	public boolean deleteObservationById(int oid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Observation observation = entityManager.find(Observation.class, oid);
		if (observation != null) {
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public Observation getObservationByDoctorName(String name) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from Observation s where dname = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		List<Observation> observations = query.getResultList();
		if (observations.size() > 0) {
			Observation observation = observations.get(0);
			return observation;
		} else {
			System.out.println("no data found");
			return null;
		}
	}

}
