package com.javamethods;

import java.util.Scanner;

public class SquareandCube {
	
	void square1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		System.out.println("Square of a number:" + (a*a));
	}
	
	void cube() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int b = sc.nextInt();
		System.out.println("Cube of a number:" + (b*b*b));
	}
	
	public static void main(String[] args) {
		SquareandCube s = new SquareandCube();
		s.square1();
		s.cube();
	}

}
