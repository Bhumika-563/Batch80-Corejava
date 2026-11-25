package com.logicalstatement.loops;

import java.util.Scanner;

public class Fibonacci {
	static void fib(int n) {
		int n1=0;
		int n2=1;
		for(int i=1;i<=n;i++) {
			int n3=n1+n2;
			System.out.println("Fibonacci Series:"+n1);
			n1=n2;
			n2=n3;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
        int n=sc.nextInt();
        fib(n);
	}

}
