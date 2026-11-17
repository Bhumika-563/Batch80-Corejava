package com.logicalstatement;

import java.util.Scanner;

public class MatrimonialSite {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Matrimonial Site");
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter your Name:");
			String fullName = sc.next();

			System.out.println("oh Nice Meet You mr or mrs" + fullName);

			System.out.println("Enter your Assets Information:");
			double assets = sc.nextDouble();
			if (assets >= 50000000.00) {
				System.out.println("Nice your Profile Is Matched");

				System.out.println("Enter your salary:");
				double salary = sc.nextDouble();

				if (salary >= 250000.00) {
					System.out.println("your Profile Is Matched");

					System.out.println("Enter your age:");
					int age = sc.nextInt();

					if (age >= 25 && age<=29) {
						System.out.println("Your Age is Matched");

						System.out.println("Enter your Height and Weight:");
						float height = sc.nextFloat();
						double weight = sc.nextDouble();

						if ((height >= 5.5 && height >= 6.1) && weight >= 65 && weight <= 72) {
							System.out.println("Nice to hear the details about your !! lets contine with more Questions");

							System.out.println("Do You have Sibilings!!");
							boolean sibStatus = sc.nextBoolean();

							if (!sibStatus ) {
								System.out.println("Happy to Hear");
								System.out.println("We will connect later will take all the information");
							} else {
								System.out.println("OMG");
							}
						} else {
							System.out.println("Your Height and Weight is not matched");
						}

					} else {
						System.out.println("Your Age is not Matched");
					}
				} else {
					System.out.println(" your Profile Is not  Matched");
				}
			} else {
				System.out.println("Not Matched");
			}

			System.out.println("click do you want repeat the code Y for Yes N for No:");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
	}

}
