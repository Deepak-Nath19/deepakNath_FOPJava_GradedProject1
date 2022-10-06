package com.greatlearning.departments;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		String departmentName ="Admin Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		String todaysWork ="Complete your documents Submission";
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		String workDeadline ="Complete by EOD";
		return workDeadline;
	}
	
}
