package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.PersonService;
import com.HospitalManagementSystem.dto.Person;

public class TestSavePerson {
public static void main(String[] args) {
	Person person = new Person();
	person.setName("Akon");
	person.setAddress("tvm");
	person.setPhno(8563256948l);
	person.setEmail("akon@gmail.com");
	person.setAge(23);
	person.setGender("Male");
	person.setDob("15-07-2000");
	
	PersonService personService =new PersonService();
	personService.savePerson(1, person);
}
}
