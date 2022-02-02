package com.greatlearning.com;

public class Main{
	public static void main(String args[]) {
		Department1 d1 = new Department1();
		d1.departmentName();
		d1.getTodaysWork();
		d1.getWorkDeadline();
		
		Department2 d2 = new Department2();
		d2.departmentName();
		d2.getTodaysWork();
		d2.getWorkDeadline();
		d2.doActivity();
		
		Department3 d3 = new Department3();
		d3.departmentName();
		d3.getTodaysWork();
		d3.getWorkDeadline();
		d3.getTechStackInformation();
	}
}
