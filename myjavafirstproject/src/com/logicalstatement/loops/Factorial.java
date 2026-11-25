package com.logicalstatement.loops;

import java.util.Scanner;

public class Factorial {
	
	static void fact(int n) {
		int fact = 1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of a Given Number is:"+fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		fact(n);

	}

}
