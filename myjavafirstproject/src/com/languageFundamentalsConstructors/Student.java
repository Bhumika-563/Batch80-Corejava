package com.languageFundamentalsConstructors;

public class Student {

	int sid;
	String sname;
	int age;

	Student() {
		System.out.println("No-arg Constructor Called");
	}

	Student(int sid, String sname, int age) {
		System.out.println("Parameterized Constructor called");
		this.sid = sid;
		this.sname = sname;
		this.age = age;

	}

	public static void main(String[] args) {
		Student s = new Student();
		s.sid = 6;
		s.sname = "Deepika";
		s.age = 20;
		s.stuInfo();
		Student s1 = new Student(7, "Anusha", 21);
		s1.stuInfo();
		Student s2 = new Student(8, "Bhumika", 21);
		s2.stuInfo();

	}

	void stuInfo() {
		System.out.println("Student Id is:" + sid);
		System.out.println("Student Name is:" + sname);
		System.out.println("Studnet Age is:" + age);
		System.out.println("****************************************");
	}

}
