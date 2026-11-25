package com.logicalstatement.loops;
import java.util.Scanner;
public class PerfectNumber {
	
	static boolean isPerfect(int n) {
		boolean status = false;
		int sum=0;
		
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum=sum+i;
				
			}
		}
		
		if(sum==n) {
			status=true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean flag = isPerfect(n);
		if(flag) {
			System.out.println("The Given Number is Perfect");
		}else {
			System.out.println("The Given Number is not Perfect Number");
		}

	}

}
