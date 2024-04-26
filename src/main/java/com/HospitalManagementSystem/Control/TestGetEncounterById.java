package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.EncounterService;
import com.HospitalManagementSystem.dto.Encounter;

public class TestGetEncounterById {
	public static void main(String[] args) {
		EncounterService encounterService = new EncounterService();
		Encounter encounter = encounterService.getEncounterById(2);
		if(encounter!=null)
		{
			System.out.println("Encounter id is : " +encounter.getEid());
			System.out.println("Encounter dateofjoining is : " +encounter.getDateofjoin());
			System.out.println("Encounter dateofdischarge is : " +encounter.getDateofdischarge());
		}
		else
		{
			System.out.println("No data found!");
		}
	}
}
