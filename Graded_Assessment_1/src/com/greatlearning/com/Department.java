package com.greatlearning.com;

public class Department {
	public static void main(String args[]) {
		String s1 = departmentName();
		String s2 = getTodayWork();
		String s3 = getWorkDeadline();
		String s4 = isTodayAHoliday();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}
	
	public static String departmentName() {
		return "Welcome to Super Department ";
	}
	public static String getTodayWork() {
		return "No Work as of now";
	}
	public static String getWorkDeadline() {
		return "Nil";
	}
	public static String isTodayAHoliday() {
		return "Today is not a holiday";	
	}
}


	



