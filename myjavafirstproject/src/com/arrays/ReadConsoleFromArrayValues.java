package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadConsoleFromArrayValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size=sc.nextInt();
		int[] number = new int[size];
		System.out.println("Enter the Values");
		for(int i=0;i<number.length;i++) {
			number[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(number));

	}

}
