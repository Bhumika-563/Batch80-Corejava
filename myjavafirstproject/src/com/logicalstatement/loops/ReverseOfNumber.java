package com.logicalstatement.loops;

import java.util.Scanner;

public class ReverseOfNumber {
	
	static int revNum(int n) {
		int rev=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int rev=revNum(n);
		if(n==rev) {
			System.out.println("The Given Number is Plindrome");
		}else {
			System.out.println("The Given Number is not Plindrome");
		}
	}

}
