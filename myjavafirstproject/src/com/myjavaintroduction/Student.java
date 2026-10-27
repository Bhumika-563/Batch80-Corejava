// 13-10-2026
package com.myjavaintroduction;

public class Student {
	static String collegeName;
	static String principalName;
	int studentId;
	String studentName;
	String courseName;
	int marks;
	
	static void displayCollegeDetails() {
		System.out.println("College Name:" + collegeName);
		System.out.println("Principal Name:" + principalName);
	}
	void displayStudentDetails()
	{
		System.out.println("Student ID:" + studentId);
		System.out.println("Student Name:" + studentName);
		System.out.println("Student Course Name:" + courseName);
		System.out.println("Student Marks:" + marks);
		
	}
	
	static void changePrincipal() {
		principalName = "XYZ";
		System.out.println("Principal Name:" + principalName);
	       
	}

	public static void main(String[] args) {
	    collegeName = "VKR";
	    principalName = "ABC";
	    displayCollegeDetails();
	    changePrincipal();
	    System.out.println("Principal Name:" + principalName);
		Student s = new Student();
		s.studentId= 101;
		s.studentName= "Anusha";
		s.courseName = "CSE";	
		s.marks = 96;
		s.displayStudentDetails();
		
		Student s1 = new Student();
		s1.studentId= 102;
		s1.studentName= "Usha Sri";
		s1.courseName = "AI & DS";	
		s1.marks = 95;
		s1.displayStudentDetails();
	}

}
