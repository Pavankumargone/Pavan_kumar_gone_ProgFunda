package com.gradedproject.q1;



public class SuperDepartment {
	
	String departmentName;
	String getTodaysWork;
	String getWorkDeadlin;
	
public SuperDepartment(String departmentName, String getTodaysWork, String getWorkDeadlin) {
	super();
	this.departmentName = departmentName;
	this.getTodaysWork = getTodaysWork;
	this.getWorkDeadlin = getWorkDeadlin;
}
String departmentName (){
	return departmentName;
}
String getTodaysWork(){
 return getTodaysWork;
}

String getWorkDeadline() {
 return getWorkDeadlin;
}

String TodayAHoliday () {
 return"Today is not a Holiday";
}
 
}
 
 