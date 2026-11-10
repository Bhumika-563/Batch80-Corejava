package com.javamethods;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	String sname;
	int sId;
	int total;
	float avg;
	int marks;

	void readMarks() {
		System.out.println("Enter Math Marks:");
		marks = sc.nextInt();
		System.out.println("Enter English Marks:");
		marks = sc.nextInt();
		System.out.println("Enter Telugu Marks:");
		marks = sc.nextInt();
		System.out.println("Enter ScienceMarks:");
		marks = sc.nextInt();
	}

	int calculateTotal() {
		total = marks + marks + marks + marks;
		return total;
	
	}
	float average() {
		avg = total/4;
		return avg;
	}

	void displayResult() {
		
		System.out.println("Enter Student Name:");
		String sname = sc.next();
		System.out.println("Enter Student ID:");
		String sId= sc.next();
		System.out.println("Student Name :is:"+sname);
		System.out.println("Student Name is:"+sId);
		System.out.println("TotalMarks:" + total);
		System.out.println("Average Marks:" + avg);
	}

	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		s.readMarks();
		s.calculateTotal();
		s.average();
		s.displayResult();
	}

}
