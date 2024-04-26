package com.HospitalManagementSystem.dao;

import com.HospitalManagementSystem.dto.Hospital;

public interface Hospitaldao {
	public Hospital saveHospital(Hospital hospital);

	public Hospital getHospitalById(int hid);

	public boolean deleteHospitalById(int hid);

	public Hospital updateHospitalById(int hid,Hospital hospital);
}
