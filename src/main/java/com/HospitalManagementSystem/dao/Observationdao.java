package com.HospitalManagementSystem.dao;

import java.util.List;

import com.HospitalManagementSystem.dto.Observation;

public interface Observationdao {
	public Observation saveObservation(int eid, Observation observation);

	public Observation getObservationById(int oid);

	public List<Observation> getAllObservations();

	public boolean deleteObservationById(int oid);

	public Observation getObservationByDoctorName(String name);

	// public Observation updateObservationById(int oid);
}
