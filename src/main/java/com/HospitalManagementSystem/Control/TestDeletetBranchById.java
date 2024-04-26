package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.BranchService;

public class TestDeletetBranchById {
	public static void main(String[] args) {
	BranchService branchService = new BranchService();
	branchService.deletetBranchById(1);
	}
}
