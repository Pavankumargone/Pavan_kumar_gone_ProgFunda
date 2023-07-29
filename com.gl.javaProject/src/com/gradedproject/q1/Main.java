package com.gradedproject.q1;

public class Main {

	public static void main(String[] args) {
		Admindepartment Admin=new Admindepartment("Welcome to Admin Department","Complete your documents submission","Complete by EOD");
		 Hrdepartment Hr=new  Hrdepartment("Welcome to HR Department","Fill today's timesheet and mark your attendance","Complete by EOD");
			Techdepartment Tech=new Techdepartment("Welcome to Tech Department","Complete coding of module 1","Complete by EOD");
			
			System.out.println(Admin.departmentName ());
			System.out.println(Admin.getTodaysWork ());
			System.out.println(Admin.getWorkDeadline ());
			System.out.println(Admin.TodayAHoliday ());
			
			System.out.println();
			
			System.out.println(Hr.departmentName ());
			System.out.println(Hr.doActivity ());
			System.out.println(Hr.getTodaysWork ());
			System.out.println(Hr.getWorkDeadline ());
			System.out.println(Hr.TodayAHoliday ());
			
			System.out.println();
			
			System.out.println(Tech.departmentName ());
			System.out.println(Tech.getTodaysWork ());
			System.out.println(Tech.getWorkDeadline ());
			System.out.println(Tech.getTechStackInformation ());
			System.out.println(Tech.TodayAHoliday ());
			
			
			
			
		
			
	}
	}


