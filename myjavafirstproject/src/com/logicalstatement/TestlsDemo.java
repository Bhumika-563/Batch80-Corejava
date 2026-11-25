
package com.logicalstatement;

import java.util.Scanner;

public class TestlsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n = sc.nextInt();
		if (n==0) {
			System.out.println("The Number is prime Number");
		} else {
			System.out.println("The Number is not prime Number");
		}
	}
}