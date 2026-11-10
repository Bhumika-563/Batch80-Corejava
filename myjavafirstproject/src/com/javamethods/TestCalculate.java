package com.javamethods;

import java.util.Scanner;

public class TestCalculate {
	Scanner sc1 = new Scanner(System.in);

	int add(int a, int b) {
		return a + b;

	}

	int sub(int a1, int b1) {
		System.out.println("Enter a value:");
		int a = sc1.nextInt();
		System.out.println("Enter a value:");
		int b = sc1.nextInt();
		int add = add (a, b);
		System.out.println("Addition of Two Numbers:"+add);
		return a1 - b1;
	}

	void multi(int a2, int b2) {
		System.out.println("Enter a value:");
		int a1 = sc1.nextInt();
		System.out.println("Enter a value:");
		int b1 = sc1.nextInt();
		int sub = sub(a1, b1);
		System.out.println("Subraction of Two Numbers:"+sub);
		System.out.println("Multiplication of Two Numbers:" + (a2 * b2));
	}

	void div(int a3, int b3) {
		System.out.println("Enter a value:");
		int a2 = sc1.nextInt();
		System.out.println("Enter a value:");
		int b2 = sc1.nextInt();
		multi(a2, b2);
		System.out.println("Divition of Two Numbers:" + (a3 / b3));
	}

	void modulus(int a4, int b4) {
		System.out.println("Enter a value:");
		int a3 = sc1.nextInt();
		System.out.println("Enter a value:");
		int b3 = sc1.nextInt();
	    div(a3, b3);
		System.out.println("Modulus of Two Numbers:" + (a4 % b4));

	}

	public static void main(String[] args) {
		TestCalculate tc = new TestCalculate();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a4 = sc.nextInt();
		System.out.println("Enter a value:");
		int b4 = sc.nextInt();
		tc.modulus(a4, b4);
		

	}

}
