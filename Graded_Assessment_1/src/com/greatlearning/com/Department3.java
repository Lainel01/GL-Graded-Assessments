package com.greatlearning.com;

public class Department3 extends Department {
	public Department3() {
		String c1 = departmentName();
		String c2 = getTodaysWork();
		String c3 = getWorkDeadline();
		String c4 = getTechStackInformation();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
	}
	
	public static String departmentName() {
		return "Welcome to Tech Department";
	}
	public static String getTodaysWork() {
		return "Complete coding of module 1";
	}
	public static String getWorkDeadline() {
		return "Complete by EOD";
	}
	public static String getTechStackInformation() {
		return "Core Java";
	}
}
