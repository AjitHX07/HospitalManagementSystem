package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.HospitalService;
import com.HospitalManagementSystem.dto.Hospital;

public class TestGetHospitalById {
	public static void main(String[] args) {
		HospitalService hospitalService = new HospitalService();
		Hospital hospital = hospitalService.getHospitalById(1);
		if (hospital != null) {
			System.out.println("Hospital id is : " + hospital.getHid());
			System.out.println("Hospital name is : " + hospital.getName());
			System.out.println("Hospital website is : " + hospital.getWebsite());
		} else {
			System.out.println("Not Found!");
		}
	}
}
