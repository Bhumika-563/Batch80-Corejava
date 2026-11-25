package com.languageFundamentalsConstructors;

import java.util.Scanner;

class PermanentEmployee extends GenericEmployee {
	PermanentEmployee(long employeeId, String employeeName, String department, double salary) {
		super(employeeId, employeeName, department, salary);

	}
}

class ContractEmployee extends GenericEmployee {
	ContractEmployee(long employeeId, String employeeName, String department, double salary, String contractDuration) {
		super(employeeId, employeeName, department, salary, contractDuration);

	}
}

public class GenericEmployee {
	long employeeId;
	String employeeName;
	String department;
	double salary;
	String contractDuration;

	GenericEmployee(long employeeId, String employeeName, String department, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}

	GenericEmployee(long employeeId, String employeeName, String department, double salary, String contractDuration) {

		this(employeeId, employeeName, department, salary);
		this.contractDuration = contractDuration;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		long eId = sc.nextLong();
		System.out.println("Enter Employee Name:");
		sc.nextLine();
		String eName = sc.nextLine();
		System.out.println("Enter Employee Department:");
		String dept = sc.nextLine();
		System.out.println("Enter Employee Salary:");
		double sal = sc.nextDouble();

		PermanentEmployee pe = new PermanentEmployee(eId, eName, dept, sal);
		pe.displayPermanentEmployeeDetails();

		System.out.println("Enter Employee Id:");
		long empId = sc.nextLong();
		System.out.println("Enter Employee Name:");
    	sc.nextLine();
		String empName = sc.nextLine();
		System.out.println("Enter Employee Department:");
		String empdept = sc.nextLine();
		System.out.println("Enter Employee Salary:");
		double empsal = sc.nextDouble();
		System.out.println("Enter Employee Contract Duration:");
		String dur = sc.next();

		ContractEmployee ce = new ContractEmployee(empId, empName, empdept, empsal, dur);
		ce.displayContractEmployeeDetails();

	}

	void displayPermanentEmployeeDetails() {
		System.out.println("Employee ID is:" + employeeId);
		System.out.println("Employee Name is:" + employeeName);
		System.out.println("Employee Department is:" + department);
		System.out.println("Employee Salary is:" + salary);
		System.out.println("*****************************************************");
	}

	void displayContractEmployeeDetails() {
		System.out.println("Employee ID is:" + employeeId);
		System.out.println("Employee Name is:" + employeeName);
		System.out.println("Employee Department is:" + department);
		System.out.println("Employee Salary is:" + salary);
		System.out.println("Employee Contract Duration:" + contractDuration);
		System.out.println("*****************************************************");
	}

}
