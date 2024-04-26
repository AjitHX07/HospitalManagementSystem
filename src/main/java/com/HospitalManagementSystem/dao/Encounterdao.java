package com.HospitalManagementSystem.dao;

import java.util.List;

import com.HospitalManagementSystem.dto.Encounter;

public interface Encounterdao {
	public Encounter saveEncounter(int bid, Encounter encounter);

	public Encounter getEncounterById(int eid);

	public List<Encounter> getAllEncounter();

	public boolean deleteEncounterById(int eid);

	//public Encounter updateEncounterById(int eid);
}
