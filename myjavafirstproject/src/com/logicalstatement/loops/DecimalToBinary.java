package com.logicalstatement.loops;

import java.util.Scanner;

public class DecimalToBinary {
	
	static void decToBin(int n) {
		                
		int r=0;
		String binary="";
		
		while(n>0) {
			r=n%2;
			n=n/2;
			binary=r+binary;
			
		}	
		System.out.println("Decimal to Binary:"+binary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		decToBin(n);

	}

}
