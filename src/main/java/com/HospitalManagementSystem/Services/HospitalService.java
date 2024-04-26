package com.HospitalManagementSystem.Services;

import com.HospitalManagementSystem.dao.Imp.HospitalDaoImp;
import com.HospitalManagementSystem.dto.Hospital;

public class HospitalService {
	public void saveHospital(Hospital hospital) {
		HospitalDaoImp hospitalDaoImp = new HospitalDaoImp();
		Hospital hospital1 = hospitalDaoImp.saveHospital(hospital);
		if (hospital1 != null) {
			System.out.println("Data Saved!");
		} else {
			System.out.println("Data not saved!");
		}
	}

	public Hospital getHospitalById(int hid) {
		HospitalDaoImp hospitalDaoImp = new HospitalDaoImp();
		Hospital hospital = hospitalDaoImp.getHospitalById(hid);
		if (hospital != null) {
			return hospital;
		} else {
			return null;
		}
	}

	public void deleteHospitalById(int hid) {
		HospitalDaoImp hospitalDaoImp = new HospitalDaoImp();
		boolean flag = hospitalDaoImp.deleteHospitalById(hid);
		if (flag) {
			System.out.println("data deleted!");
		} else {
			System.out.println("data not deleted!");
		}
	}

	public Hospital updateHospitalById(int hid, Hospital hospital) {
		HospitalDaoImp hospitalDaoImp = new HospitalDaoImp();
		Hospital hospital1 = hospitalDaoImp.updateHospitalById(hid, hospital);
		if (hospital1 != null) {
			return hospital1;
		} else {
			return null;
		}
	}

}
