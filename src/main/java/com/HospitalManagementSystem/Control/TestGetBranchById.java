package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.BranchService;
import com.HospitalManagementSystem.dto.Branch;

public class TestGetBranchById {
	public static void main(String[] args) {
		BranchService branchService = new BranchService();
		Branch branch = branchService.getBranchById(1);
		if (branch != null) {
			System.out.println("Branch id is : " + branch.getBid());
			System.out.println("Branch name is : " + branch.getName());
			System.out.println("Branch email is : " + branch.getEmail());
			System.out.println("Branch phone number is : " + branch.getPhno());
		} else {
			System.out.println("No branch found!");
		}
	}
}
