package com.HospitalManagementSystem.Services;

import java.util.List;

import com.HospitalManagementSystem.dao.Imp.PersonDaoImp;
import com.HospitalManagementSystem.dto.Person;

public class PersonService {
	public void savePerson(int eid, Person person) {
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person1 = personDaoImp.savePerson(eid, person);
		if (person1 != null) {
			System.out.println("Person Saved!");
		} else {
			System.out.println("Person Saved!");
		}
	}

	public Person getPersonById(int pid) {
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person1 = personDaoImp.getPersonById(pid);
		if (person1 != null) {
			return person1;
		} else {
			return null;
		}
	}

	public void deletePersonById(int pid) {
		PersonDaoImp personDaoImp = new PersonDaoImp();
		boolean flag = personDaoImp.deletePersonById(pid);
		if (flag) {
			System.out.println("Person Deleted!");
		} else {
			System.out.println("Person Not Deleted!");
		}
	}

	public List<Person> getPersonByGender(String gender) {
		PersonDaoImp personDaoImp = new PersonDaoImp();
		List<Person> persons = personDaoImp.getPersonByGender(gender);
		if (persons.size() > 0) {
			return persons;
		} else {
			return null;
		}
	}

	public List<Person> getPersonByAge(int age) {
		PersonDaoImp personDaoImp = new PersonDaoImp();
		List<Person> persons = personDaoImp.getPersonByAge(age);
		if (persons.size() > 0) {
			return persons;
		} else {
			return null;
		}
	}

	public Person getPersonByPhone(long phno) {
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person1 = personDaoImp.getPersonByPhone(phno);
		if (person1 != null) {
			return person1;
		} else {
			return null;
		}
	}
}
