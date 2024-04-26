package com.HospitalManagementSystem.Control;

import java.util.List;

import com.HospitalManagementSystem.Services.BranchService;
import com.HospitalManagementSystem.dto.Branch;

public class TestGetAllBranch {
	public static void main(String[] args) {
		BranchService branchService = new BranchService();
		List<Branch> branchs = branchService.getAllBranch();
		if (branchs != null) {
			for (Branch branch : branchs) {
				System.out.println("Branch id is : " + branch.getBid());
				System.out.println("Branch name is : " + branch.getName());
				System.out.println("Branch email is : " + branch.getEmail());
				System.out.println("Branch phone number is : " + branch.getPhno());
			}
		} else {
			System.out.println("Not Found!");
		}
	}
}
