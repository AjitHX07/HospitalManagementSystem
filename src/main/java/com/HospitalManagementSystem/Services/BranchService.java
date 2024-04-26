package com.HospitalManagementSystem.Services;

import java.util.List;

import com.HospitalManagementSystem.dao.Imp.BranchDaoImp;
import com.HospitalManagementSystem.dto.Branch;

public class BranchService {
	public void saveBranch(int hid, Branch branch) {
		BranchDaoImp branchDaoImp = new BranchDaoImp();
		Branch branch1 = branchDaoImp.saveBranch(hid, branch);
		if (branch1 != null) {
			System.out.println("Branch Saved!");
		} else {
			System.out.println("Branch 	Not Saved!");
		}
	}

	public Branch getBranchById(int bid) {
		BranchDaoImp branchDaoImp = new BranchDaoImp();
		Branch branch = branchDaoImp.getBranchById(bid);
		if (branch != null) {
			return branch;
		} else {
			return null;
		}
	}

	public List<Branch> getAllBranch() {
		BranchDaoImp branchDaoImp = new BranchDaoImp();
		List<Branch> branchs = branchDaoImp.getAllBranch();
		if (branchs.size()>0) {
			return branchs;
		} else {
			return null;
		}
	}

	public void deletetBranchById(int bid) {
		BranchDaoImp branchDaoImp = new BranchDaoImp();
		boolean flag = branchDaoImp.deletetBranchById(bid);
		if (flag) {
			System.out.println("Branch Deleted!");
		} else {
			System.out.println("Branch Deleted!");
		}
	}
}
