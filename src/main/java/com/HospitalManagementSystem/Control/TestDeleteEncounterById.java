package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.EncounterService;

public class TestDeleteEncounterById {
public static void main(String[] args) {
	EncounterService encounterService = new EncounterService();
	encounterService.deleteEncounterById(1);
}
}
