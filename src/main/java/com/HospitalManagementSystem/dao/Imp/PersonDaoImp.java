package com.HospitalManagementSystem.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.HospitalManagementSystem.dao.Persondao;
import com.HospitalManagementSystem.dto.Branch;
import com.HospitalManagementSystem.dto.Encounter;
import com.HospitalManagementSystem.dto.Person;

public class PersonDaoImp implements Persondao {

	public Person savePerson(int eid, Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Encounter encounter = entityManager.find(Encounter.class, eid);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		} else {
			return null;
		}
	}

	public Person getPersonById(int pid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, pid);
		return person;
	}

	public boolean deletePersonById(int pid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, pid);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public List<Person> getPersonByGender(String gender) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from Person s where gender = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, gender);
		List<Person> persons = query.getResultList();
		if (persons.size() > 0) {
			return persons;
		} else {
			System.out.println("No data found");
			return null;
		}
	}

	public List<Person> getPersonByAge(int age) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from Person s where age = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, age);
		List<Person> persons = query.getResultList();
		if (persons.size() > 0) {
			return persons;
		} else {
			System.out.println("No data found");
			return null;
		}
	}

	public Person getPersonByPhone(long phno) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select s from Person s where phno = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, phno);
		List<Person> persons = query.getResultList();
		if (persons.size() > 0) {
			Person person = persons.get(0);
			return person;
		} else {
			return null;
		}
	}

}
