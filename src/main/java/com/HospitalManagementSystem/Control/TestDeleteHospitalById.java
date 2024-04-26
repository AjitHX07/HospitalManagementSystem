package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.HospitalService;

public class TestDeleteHospitalById {
public static void main(String[] args) {
	HospitalService hospitalService = new HospitalService();
	hospitalService.deleteHospitalById(1);
}
}
