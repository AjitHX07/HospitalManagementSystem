package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.HospitalService;
import com.HospitalManagementSystem.dto.Hospital;

public class TestSaveHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		HospitalService hospitalService = new HospitalService();
		hospital.setName("MCT");
		hospital.setWebsite("www.mct.com");
		hospitalService.saveHospital(hospital);
	}
}
