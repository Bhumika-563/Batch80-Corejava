package com.languageFundamentalsConstructors;

public class Employee {
	int eid;
	String ename;
	int age;

	Employee() {
		System.out.println("No-arg Constructor Called");
	}

	Employee(int id, String name, int a) {
		System.out.println("Parameterized Constructor called");
		eid = id;
		ename = name;
		age = a;

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.eid = 6;
		e.ename = "Deepika";
		e.age = 20;
		e.empInfo();
		Employee e1 = new Employee( 7,"Anusha", 21);
		e1.empInfo();
		Employee e2 = new Employee(8, "Bhumika", 21);
		e2.empInfo();

	}

	void empInfo() {
		System.out.println("Employee Id is:" + eid);
		System.out.println("Employee Name is:" + ename);
		System.out.println("Employee Age is:" + age);
		System.out.println("****************************************");
	}

}
