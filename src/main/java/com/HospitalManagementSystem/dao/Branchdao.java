package com.HospitalManagementSystem.dao;

import java.util.List;

import com.HospitalManagementSystem.dto.Branch;
import com.HospitalManagementSystem.dto.Encounter;

public interface Branchdao {
	public Branch saveBranch(int hid, Branch branch);

	public Branch getBranchById(int bid);
	
	public List<Branch> getAllBranch();

	public boolean deletetBranchById(int bid);

}
