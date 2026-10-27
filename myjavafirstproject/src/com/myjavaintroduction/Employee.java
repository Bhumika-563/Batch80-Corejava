package com.myjavaintroduction;

public class Employee {
	
	static String companyName;
	int eId;
	String eName;
	String department;
	int salary;

	public static void main(String[] args) {
		String companyName = "Infosys";
		System.out.println(companyName);
		Employee.companyName = "TCS";
		System.out.println("companyName:" + Employee.companyName);
		

		Employee emp = new Employee();
		emp.eId = 101; 
		emp.eName = "Deepika";
		emp.department = "Java Developer";
		emp.salary = 30000;
		System.out.println("Employee Id:" + emp.eId);
		System.out.println("Employee Name:" + emp.eName);
		System.out.println("Employee Department:" + emp.department);
		System.out.println("Employee Salary:" + emp.salary);

		Employee emp1 = new Employee();
		emp1.eId = 102;
		emp1.eName = "Bhumika";
		emp1.department = "Back End Developer";
		emp1.salary = 35000;
		System.out.println("Employee Id:" + emp1.eId);
		System.out.println("Employee Name:" + emp1.eName);
		System.out.println("Employee Department:" + emp1.department);
		System.out.println("Employee Salary:" + emp1.salary);

		Employee emp2 = new Employee();
		emp2.eId = 103;
		emp2.eName = "Anusha";
		emp2.department = "Java Developer";
		emp2.salary = 40000;
		System.out.println("Employee Id:" + emp2.eId);
		System.out.println("Employee Name:" + emp2.eName);
		System.out.println("Employee Department:" + emp2.department);
		System.out.println("Employee Salary:" + emp2.salary);
		
		Employee emp3 = new Employee();
		System.out.println("Employee Id:" + emp3.eId);
		System.out.println("Employee Name:" + emp3.eName);
		System.out.println("Employee Department:" + emp3.department);
		System.out.println("Employee Salary:" + emp3.salary);
	}

}
