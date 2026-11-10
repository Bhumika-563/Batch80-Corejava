/*1.Write a Java program to create a Student class with fields studentId, studentName, and course. 
Initialize the data using a parameterized constructor and create another object by 
copying the values of the first object using a copy constructor. Display the details of both objects.
*/package com.languageFundamentalsConstructors;

public class Student1 {
     int studentId;
     String studentName;
     String course;
     Student1( int studentId,String studentName,String course){
    	 this.studentId = studentId;
    	 this.studentName = studentName;
    	 this.course = course;
     }
     Student1(Student1 s){
    	 this.studentId = s.studentId;
    	 this.studentName = s.studentName;
    	 this.course = s.course;
     }
	public static void main(String[] args) {
		Student1 s = new Student1(101,"Deepika","Java");
		s.display();
		Student1 s1 = new Student1(s);
		s1.display();
	}
	void display() {
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Course:"+course);
		System.out.println("***************************");
	}

}
