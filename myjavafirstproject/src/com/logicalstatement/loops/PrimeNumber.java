package com.logicalstatement.loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		boolean isprime = true;
		if(n<=1) {
			isprime=false;
			
		}else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					isprime=false;
					break;
					
				}
			}
		}
		if(isprime) {
			System.out.println("Given Number is Prime Number");
		}else {
			System.out.println("Given Number is Not Prime Number ");
		}
	}

}
