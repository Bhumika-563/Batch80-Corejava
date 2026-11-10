package com.javamethods;

public class TestCalculation {

	void add(int a , int b) {
		System.out.println("sub numbers:"+(a+b));
	}
	void sub(int a1,int b1) {
		
		 add(10,5);
		 System.out.println("sub numbers:"+(a1-b1));
	}
	void multi(int a2,int b2) {
	
		 sub(20,15);
		 System.out.println("multi numbers:"+(a2*b2));
	}
	void div(int a3,int b3) {
	
		 multi(30,20);
		 System.out.println("div numbers:"+(a3/b3));
	}
	void modulus(int a4,int b4) {
		 div(3,15); 
		 System.out.println("modulus numbers:"+(a4%b4));
		
	}
	public static void main(String[] args) {
		TestCalculation tc = new TestCalculation();
		tc.modulus(3,15);
	}

}
