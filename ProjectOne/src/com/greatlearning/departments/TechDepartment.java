package com.greatlearning.departments;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		String departmentName ="Tech Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		String todaysWork ="Complete coding of Module 1";
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		String workDeadline ="Complete by EOD";
		return workDeadline;
	}
	
	public String getTechStackInformation() {
		String techStackInformation ="Core Java";
		return techStackInformation;
	}
	
}
