package com.javamethods;

import java.util.Scanner;

public class EvenorOdd {
	
	void evenOrOdd(int num) {
	   if (num%2==0) {
		   System.out.println("The Number is Even Number");
	   }else {
		   System.out.println("The Number is Odd Number");
	   }
	}

	public static void main(String[] args) {
		EvenorOdd eo = new EvenorOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		eo.evenOrOdd(num);
	}

}
