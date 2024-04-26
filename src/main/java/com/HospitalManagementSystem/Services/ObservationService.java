package com.HospitalManagementSystem.Services;

import java.util.List;

import com.HospitalManagementSystem.dao.Imp.ObservationDaoImp;
import com.HospitalManagementSystem.dto.Observation;

public class ObservationService {
	public void saveObservation(int eid, Observation observation) {
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		Observation observation1 = observationDaoImp.saveObservation(eid, observation);
		if (observation1 != null) {
			System.out.println("Observation Saved!");
		} else {
			System.out.println("Observation Not Saved!");
		}
	}

	public Observation getObservationById(int oid) {
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		Observation observation1 = observationDaoImp.getObservationById(oid);
		if (observation1 != null) {
			return observation1;
		} else {
			return null;
		}
	}

	public List<Observation> getAllObservations() {
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		List<Observation> observation = observationDaoImp.getAllObservations();
		if (observation.size() > 0) {
			return observation;
		} else {
			return null;
		}
	}

	public void deleteObservationById(int oid) {
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		boolean flag = observationDaoImp.deleteObservationById(oid);
		if (flag) {
			System.out.println("Observation Deleted!");
		} else {
			System.out.println("Observation Not Deleted!");
		}
	}

	public Observation getObservationByDoctorName(String name) {
		ObservationDaoImp observationDaoImp = new ObservationDaoImp();
		Observation observation1 = observationDaoImp.getObservationByDoctorName(name);
		if (observation1 != null) {
			return observation1;
		} else {
			return null;
		}
	}
}
