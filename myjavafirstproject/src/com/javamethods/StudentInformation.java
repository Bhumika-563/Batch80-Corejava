package com.javamethods;

import java.util.Scanner;

public class StudentInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Full name:");
		String fn = sc.nextLine();
		System.out.println("Enter Student Last name:");
		String ln = sc.next();
		System.out.println("Enter Student age:");
		int age = sc.nextInt();
		System.out.println("Enter Student Mobile Number:");
		long mn = sc.nextLong();
		System.out.println("Enter Student Genger:");
		char g = sc.next().charAt(0);
		System.out.println("Enter Student Address:");
		String a = sc.next();
		System.out.println("Enter Student Height:");
		float h = sc.nextFloat();
		System.out.println("Enter Student Weight:");
		double w = sc.nextDouble();
		System.out.println("Enter Student Branch:");
		String b = sc.next();
		System.out.println("Enter Student Marks:");
		int m = sc.nextInt();
		studentInfo(fn, ln, age,mn,g,a,h,w,b,m);
	}

	static void studentInfo(String fullName, String lastName, int age, long mobileno, char gender, String address,
			float studentHeight, double studentWeight, String studentBranch, int studentMarks) {
		System.out.println("Studnet Information");
		System.out.println("Student Full Name:" + fullName );
		System.out.println("Student Last Name:" + lastName);
		System.out.println("Student Age:" + age);
		System.out.println("Student Mobile Number:" + mobileno);
		System.out.println("Student Gender:" + gender);
		System.out.println("Student Address:" + address);
		System.out.println("Student Height:" + studentHeight);
		System.out.println("Student Weight:" + studentWeight);
		System.out.println("Student Brach:" + studentBranch);
		System.out.println("Student Marks:" + studentMarks);
	}
}








