package com.cg.oas.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.oas.entities.Payment;
import com.cg.oas.entities.Program;
@Repository
public interface IProgramRepository extends JpaRepository<Program,Integer> {
//	public Program addProgram(Program program);
//	public ArrayList<Program> viewAllProgramDetails();
//	public  ArrayList<Program> getApplicationDetailsByCollegeName(String collegeName);
//	public  ArrayList<Program> getProgramDetailsByName(String programName);
//	public  ArrayList<Program> getProgramDetailsByEligibility(String eligibility);
//	public int deleteProgramById(int programId);
//	public int deleteProgramByName(String programName);
//	public Program getProgramById(int programId);
//	public int  updateProgramStatus(Program program);
}
