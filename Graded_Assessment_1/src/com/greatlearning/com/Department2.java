package com.greatlearning.com;

public class Department2 extends Department {
	public Department2() {
		String b1 = departmentName();
		String b2 = getTodaysWork();
		String b3 = getWorkDeadline();
		String b4 = doActivity();
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
	}
	
	public static String departmentName() {
		return "Welcome to Hr Departmment";
	}
	public static String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	public static String getWorkDeadline() {
		return "Complete by EOD";
	}
	public static String doActivity() {
		return "Team Lunch";
	}
}
