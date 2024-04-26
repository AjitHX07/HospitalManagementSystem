package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.ObservationService;

public class TestDeleteObservationById {
	public static void main(String[] args) {
		ObservationService observationService = new ObservationService();
		observationService.deleteObservationById(1);
	}
}
