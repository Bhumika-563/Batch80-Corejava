package com.logicalstatement;
//Find the greatest among three numbers.
import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n1 = sc.nextInt();
		System.out.println("Enter The Number:");
		int n2 = sc.nextInt();
		System.out.println("Enter The Number:");
		int n3 = sc.nextInt();
		if (n1 > n2 && n1 > n3) {
			System.out.println("Greast Nnmber Amoung Three is :"+n1);

		} else if (n2 > n1 && n2 > n3) {
			System.out.println("Greast Nnmber Amoung Three is :"+n2);
		} else if (n3 > n1 && n3> n2) {
			System.out.println("Greast Nnmber Amoung Three is :"+n3);
		}else {
			System.out.println("Two or more numbers are equal");
		}

	}

}
