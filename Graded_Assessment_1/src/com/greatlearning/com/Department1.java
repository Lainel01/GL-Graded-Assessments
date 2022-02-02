package com.greatlearning.com;

public class Department1 extends Department {
	public Department1(){
		String a1 = departmentName();
		String a2 = getTodaysWork();
		String a3 = getWorkDeadline();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}
	public static String departmentName() {
		return "Welcome to Admin department";	
	}
	public static String getTodaysWork() {
		return "Complete your documents Submission";
	}
	public static String getWorkDeadline() {
		return "Complete by EOD";
		
	}
}
