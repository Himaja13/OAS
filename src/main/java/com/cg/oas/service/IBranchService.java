package com.cg.oas.service;

import java.util.ArrayList;

import com.cg.oas.entities.Application;
import com.cg.oas.entities.Branch;

public interface IBranchService
{
	public boolean addBranch( Branch branch);
	public ArrayList<Branch> viewAllBranchDetails();
	//public  ArrayList<Branch> getBranchDetailsByName(String branchName);
	public int deleteBranchById(int branchId);
	public Branch getBranchById(int branchId);
	//public int deleteBranchByName(String branchName);
	public int  updateBranch(Branch branch);

}
