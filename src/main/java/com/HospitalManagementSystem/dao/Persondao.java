package com.HospitalManagementSystem.dao;

import java.util.List;

import com.HospitalManagementSystem.dto.Person;

public interface Persondao {
	public Person savePerson(int eid, Person person);

	public Person getPersonById(int pid);

	public boolean deletePersonById(int pid);

	public List<Person> getPersonByGender(String gender);

	public List<Person> getPersonByAge(int age);

	public Person getPersonByPhone(long phno);

	// public Person updatePersonById(int pid);
}
