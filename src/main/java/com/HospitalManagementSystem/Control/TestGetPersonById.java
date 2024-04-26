package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.PersonService;
import com.HospitalManagementSystem.dto.Person;

public class TestGetPersonById {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		Person person = personService.getPersonById(1);
		if(person!=null)
		{
			System.out.println("Person id is : " +person.getPid());
			System.out.println("Person name is : " +person.getName());
			System.out.println("Person Address is : " +person.getAddress());
			System.out.println("Person phone number is : " +person.getPhno());
			System.out.println("Person email is : " +person.getEmail());
			System.out.println("Person age is : " +person.getAge());
			System.out.println("Person gender is : " +person.getGender());
			System.out.println("Person dob  is : " +person.getDob());
		}
		else
		{
			System.out.println("Person details not found!");
		}
	}
}
