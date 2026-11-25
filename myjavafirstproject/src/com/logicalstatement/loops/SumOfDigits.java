package com.logicalstatement.loops;

import java.util.Scanner;

public class SumOfDigits {
	
	static int sumDigit(int n) {
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		System.out.println("Sum of Digits:"+sumDigit(n));
	}

}
