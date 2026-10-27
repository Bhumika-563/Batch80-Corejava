package com.myjavaintroduction;

public class College {
	static String clgName;
	String branch;
	String semester;

	void display() {
		int studentId= 123;
		String studentName = "xyz";
		System.out.println(studentId);
		System.out.println(studentName);
	}

	public static void main(String[] args) {
		
		clgName = "ABC";
		System.out.println(clgName);
		College c = new College();
		c.display();
		c.branch = "CSE";
		c.semester = "1st Year";
		System.out.println(c.branch);
		System.out.println(c.semester);
	}
}
