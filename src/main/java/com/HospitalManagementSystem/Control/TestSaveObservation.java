package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.ObservationService;
import com.HospitalManagementSystem.dto.Observation;

public class TestSaveObservation {
public static void main(String[] args) {
	Observation observation = new Observation();
	observation.setDname("lolan");
	observation.setrObservation("Fever");
	ObservationService observationService = new ObservationService();
	observationService.saveObservation(1, observation);
}
}
