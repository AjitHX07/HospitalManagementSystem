package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.ObservationService;
import com.HospitalManagementSystem.dto.Observation;

public class TestGetObservationById {
	public static void main(String[] args) {
		ObservationService observationService = new ObservationService();
		Observation observation = observationService.getObservationById(1);
		if(observation!=null)
		{
			System.out.println("Observation id is : " +observation.getOid());
			System.out.println("Observation dname is : " +observation.getDname());
			System.out.println("Observation reason is : " +observation.getrObservation());
		}
		else
		{
			System.out.println("Observation not found!");
		}
	}
}
