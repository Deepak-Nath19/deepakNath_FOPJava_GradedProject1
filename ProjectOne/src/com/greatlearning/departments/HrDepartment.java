package com.greatlearning.departments;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		String departmentName ="HR Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		String todaysWork ="Fill today's timesheet and mark your attendance";
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		String workDeadline ="Complete by EOD";
		return workDeadline;
	}
	
	public String doActivity() {
		String activity ="team Lunch";
		return activity;
	}

}
