//Check whether a number is even or odd.
package com.logicalstatement;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n = sc.nextInt();
		if ((n & 1)==0) {
			System.out.println("The Number is Even Number"+n);
		} else {
			System.out.println("The Number is Odd Number");
		}

	}

}
