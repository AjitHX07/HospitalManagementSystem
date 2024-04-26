package com.HospitalManagementSystem.Services;

import java.util.List;

import com.HospitalManagementSystem.dao.Imp.EncounterDaoImp;
import com.HospitalManagementSystem.dto.Encounter;

public class EncounterService {
	public void saveEncounter(int bid, Encounter encounter) {
		EncounterDaoImp encounterDaoImp = new EncounterDaoImp();
		Encounter encounter1 = encounterDaoImp.saveEncounter(bid, encounter);
		if (encounter1 != null) {
			System.out.println("Encounter Saved!");
		} else {
			System.out.println("Encounter Not Saved!");
		}
	}

	public Encounter getEncounterById(int eid) {
		EncounterDaoImp encounterDaoImp = new EncounterDaoImp();
		Encounter encounter = encounterDaoImp.getEncounterById(eid);
		if (encounter != null) {
			return encounter;
		} else {
			return null;
		}
	}

	public List<Encounter> getAllEncounter() {
		EncounterDaoImp encounterDaoImp = new EncounterDaoImp();
		List<Encounter> encounter = encounterDaoImp.getAllEncounter();
		if (encounter.size()>0) {
			return encounter;
		} else {
			return null;
		}
	}

	public void deleteEncounterById(int eid) {
		EncounterDaoImp encounterDaoImp = new EncounterDaoImp();
		boolean flag = encounterDaoImp.deleteEncounterById(eid);
		if (flag) {
			System.out.println("Encounter Deleted!");
		} else {
			System.out.println("Encounter Not Deleted!");
		}
	}
}
