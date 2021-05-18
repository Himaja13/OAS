package com.cg.oas.service;

import java.util.ArrayList;

import com.cg.oas.entities.Application;
import com.cg.oas.entities.College;
import com.cg.oas.entities.Course;

public interface ICollegeService
{
	public College addCollege(College college);
	public ArrayList<College> viewAllCollegeDetails();
	public  ArrayList<College> getCollegeDetailsByProgram(String programName);
	public  ArrayList<College> getCollegeDetailsByCourse(String courceName);
	public  ArrayList<College> getCollegeDetailsByBranch(String branchName);
	//public  ArrayList<College> getCollegeDetailsByName(String collgeName);
	public int deleteCollegeById(int collegeId);
	//public int deleteCollegeByName(String collgeName);
	public int  updateCollegeDetails(College college);
	public  College getCollegeDetailsById(int collegeId);
}
