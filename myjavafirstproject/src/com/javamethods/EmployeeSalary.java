package com.javamethods;

import java.util.Scanner;

public class EmployeeSalary {
	Scanner sc = new Scanner(System.in);
	
	double basicSalary() {
		System.out.println("Enter Your Basic Salary:");
		double bs = sc.nextDouble();
		return bs;
	}
	
	double houseRentAllowenec() {
		System.out.println("Enter Your HRA :");
		double hra = sc.nextDouble();
		return hra;
	}
    
	double specialAllowenec() {
		System.out.println("Enter Your Special Allowenec:");
		double sa = sc.nextDouble();
		return sa;
	}
	
	double mealCoupons() {
		System.out.println("Enter Your Meal Coupons:");
		double mc = sc.nextDouble();
		return mc;
	}
	
	double leaveTravelAssistents() {
		System.out.println("Enter Your Leave Travel Assistents:");
		double lta = sc.nextDouble();
		return lta;
	}
	double providentFunds() {
		System.out.println("Enter Your Provident Funds:");
		double pf = sc.nextDouble();
		return pf;
	}
	
	double gratuity() {
		System.out.println("Enter Your gratuity:");
		double g = sc.nextDouble();
		return g;
	}

	public static void main(String[] args) {
		EmployeeSalary es = new EmployeeSalary();
		double bs = es.basicSalary();
		double hra = es.houseRentAllowenec();
		double sa = es.specialAllowenec();
		double mc = es.mealCoupons();
		double lta = es.leaveTravelAssistents();
		double pf = es.providentFunds();
		double g = es.gratuity();
		double totalSalary = bs+hra+sa+mc+lta+pf+g;
		System.out.println("Total Salary:"+totalSalary);

	}

}
