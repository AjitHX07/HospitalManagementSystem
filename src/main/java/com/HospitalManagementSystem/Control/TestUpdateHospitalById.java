package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.HospitalService;
import com.HospitalManagementSystem.dto.Hospital;

public class TestUpdateHospitalById {
public static void main(String[] args) {
	Hospital hospital = new Hospital();
	hospital.setName("MCT");
	hospital.setWebsite("www.mct.com");
	HospitalService hospitalService = new HospitalService();
	hospitalService.updateHospitalById(2, hospital);
}
}
