package com.logicalstatement.loops;

import java.util.Scanner;

public class MathTable {
	static void table(int n1,int n2) {
		for(int i=1;i<=n1;i++) {
			System.out.println(n2+" x "+i+" = "+n2*i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number For Calculation");
		int n1=sc.nextInt();
		
		System.out.println("Enter A Number Which Table You Want");
		int n2=sc.nextInt();
		
		table(n1,n2);
	}

}
