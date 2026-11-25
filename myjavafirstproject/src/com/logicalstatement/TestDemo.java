package com.logicalstatement;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks Percentage");
		double marksP = sc.nextDouble();
		if(marksP>100 || marksP<0) {
			System.out.println("Invalid Marks");
		}else if (marksP>=90) {
			System.out.println("Grade A");
		}
		else if (marksP>=80) {
			System.out.println("Grade B");
		}else if (marksP>=70) {
			System.out.println("Grade c");
		}
		else if (marksP>=60) {
			System.out.println("Grade d");
		}else if (marksP>=35) {
			System.out.println("Just Passed");
		}else {
			System.out.println("Failed");
		}
	}
}
