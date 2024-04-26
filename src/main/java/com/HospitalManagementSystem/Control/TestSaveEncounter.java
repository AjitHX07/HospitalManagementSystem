package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.EncounterService;
import com.HospitalManagementSystem.dto.Encounter;

public class TestSaveEncounter {
public static void main(String[] args) {
	Encounter encounter = new Encounter();
	encounter.setDateofjoin("12-JUN-2023");
	encounter.setDateofdischarge("22-JUN-2023");
	EncounterService encounterService = new EncounterService();
	encounterService.saveEncounter(2, encounter);
}
}
