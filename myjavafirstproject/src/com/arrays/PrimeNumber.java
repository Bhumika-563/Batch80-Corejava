package com.arrays;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int[] n = new int[size];
		System.out.println("Enter the Values");

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < n.length; i++) {

			boolean status = true;

			if (n[i] == 0 || n[i] == 1) {
				status = false;
			} else {
				for (int j = 2; j <= Math.sqrt(n[i]); j++) {

					if (n[i] % j == 0) {
						status = false;
						break;
					}
				}
			}

			if (status) {
				System.out.println(n[i]);
			}
		}

	}

}
