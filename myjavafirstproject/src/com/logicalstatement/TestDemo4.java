package com.logicalstatement;

import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a= sc.nextInt();
		if(a<=10) {
			System.out.println("TRUE if codition 1");
			if(a>=0) {
				System.out.println("Enter a value");
				int a1= sc.nextInt();
				a=a1;
				System.out.println("TRUE if codition 2");
				if(a>=20){
				System.out.println("Enter a value");
				int a2= sc.nextInt();
				a=a2;
				System.out.println("TRUE if codition 3");
				}else {
					System.out.println("false");
				}
			}else {
				System.out.println("not");
			}
		}else {
			System.out.println("not matched");
		}
		System.out.println(a);
	}

}
