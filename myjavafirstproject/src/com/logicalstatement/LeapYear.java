package com.logicalstatement;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter Year:");
			int year = sc.nextInt();
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				System.out.println("The Year is leap Year");
			} else {
				System.out.println("The Year is Not leap Year");
			}
			System.out.println("click do you want repeat the code Y for Yes N for No:");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
	}

}
