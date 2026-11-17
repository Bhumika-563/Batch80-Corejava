package com.logicalstatement;

import java.util.Scanner;

public class EligibleForVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter Your Age:");
			int age = sc.nextInt();
			if (age > 18) {
				System.out.println("Your Eligible For Vote");
			} else {
				System.out.println("Your Not Eligible For Vote");
			}
			System.out.println("click do you want repeat the code Y for Yes N for No:");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
	}

}
