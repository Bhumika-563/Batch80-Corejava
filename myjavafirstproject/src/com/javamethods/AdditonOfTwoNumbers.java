package com.javamethods;

import java.util.Scanner;

public class AdditonOfTwoNumbers {
	Scanner sc = new Scanner(System.in);
	void addition(){
		System.out.println("Enter a Number1:");
	    int num1=sc.nextInt();
	    System.out.println("Enter a Number2:");
	    int num2=sc.nextInt();
	    int add = num1+num2;
		System.out.println("Addition of Two Numbers:"+add);
		
	}

	public static void main(String[] args) {
		AdditonOfTwoNumbers add = new AdditonOfTwoNumbers();
		add.addition();
      
	}

}
