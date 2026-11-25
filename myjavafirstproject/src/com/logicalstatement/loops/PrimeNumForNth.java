package com.logicalstatement.loops;

import java.util.Scanner;

public class PrimeNumForNth {
	
	static boolean isPrime(int num) {
		boolean status = true;
		if(num<=1) {
			status=false;
		}
		for(int i=2;i*i<num;i++) {
			if(num%i==0) {
				status=false;
				break;
		  }
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int count =0;
		int num=1;
		while(count<n) {
			num++;
		
		if(isPrime(num)) {
			count++;
		}
	}
		System.out.println(n+"th Prime Number is:"+num);
		
		
	}

}
