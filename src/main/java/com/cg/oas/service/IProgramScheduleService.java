package com.cg.oas.service;

import java.util.ArrayList;

import com.cg.oas.entities.Application;
import com.cg.oas.entities.Program;
import com.cg.oas.entities.ProgramScheduled;

public interface IProgramScheduleService {
	public boolean addProgramSchedule(ProgramScheduled programSchedule);
	public ArrayList<ProgramScheduled> viewAllProgramScheduleDetails();
	//public  ArrayList<ProgramScheduled> getProgramScheduleByCollegeName(String collegeName);
	//public  ArrayList<ProgramScheduled> getProgramScheduleByDate(String date);
	public int deleteProgramScheduleById(int scheduleId);
//	public int deleteProgramScheduleByDate(String startDate);
	public ProgramScheduled getProgramScheduleById(int scheduleId);
	public int  updateProgramSchedule(ProgramScheduled programSchedule);
	//as per requirment can be added more function
}
