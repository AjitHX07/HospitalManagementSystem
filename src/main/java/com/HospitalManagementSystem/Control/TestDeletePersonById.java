package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.PersonService;

public class TestDeletePersonById {
public static void main(String[] args) {
	PersonService personService = new PersonService();
	personService.deletePersonById(1);
}
}
