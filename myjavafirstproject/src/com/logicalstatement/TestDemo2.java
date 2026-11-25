package com.logicalstatement;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		if(age>60){
			System.out.println("Your to old Age ");
		}else if (age >=36 && age<=60) {
			System.out.println("You are in Middle Age ");
		}else if (age >=20 && age<=35) {
			System.out.println("You are Young");
		}else if (age >=13 && age<=19) {
			System.out.println("You are Teen Age");
		}else if (age >=5 && age<=12) {
			System.out.println("You are Children");
		}else if (age > 0 && age<=5) {
			System.out.println("You are Kid");
		}else {
			System.out.println("Your not Born");
		}
	}
}
