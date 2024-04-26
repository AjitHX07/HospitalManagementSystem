package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.BranchService;
import com.HospitalManagementSystem.dto.Branch;

public class TestSaveBranch {
	public static void main(String[] args) {
		Branch branch = new Branch();
		BranchService branchService = new BranchService();
		branch.setName("tvm");
		branch.setEmail("tvm@gmail.com");
		branch.setPhno(8943772220l);
		branchService.saveBranch(2, branch);
	}
}
