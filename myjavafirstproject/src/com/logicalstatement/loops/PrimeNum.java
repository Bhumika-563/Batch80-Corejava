package com.logicalstatement.loops;

import java.util.Scanner;

public class PrimeNum {
	static boolean isPrime(int n) {
		boolean status = true;
		if(n==0||n==1) {
			status = false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status = false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		if(isPrime(n)) {
			System.out.println("Given Number is Prime Number");
		}else {
			System.out.println("Givem Number is Not Prime Number");
		}
		
	}

}
