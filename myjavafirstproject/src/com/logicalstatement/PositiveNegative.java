//1.write a java program to Check whether a number is positive or negative.
package com.logicalstatement;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("The Number is Positive");
		} else {
			System.out.println("The Number is Negative");
		}

	}

}
