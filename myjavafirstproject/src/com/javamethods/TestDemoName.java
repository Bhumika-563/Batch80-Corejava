// Write a method to print your name.
package com.javamethods;
import java.util.Scanner;
public class TestDemoName {
	
	void name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String yourName = sc.nextLine();
		System.out.println("My Name is:" + yourName);
	}

	public static void main(String[] args) {
		TestDemoName t = new TestDemoName();
		t.name();
	}

}
