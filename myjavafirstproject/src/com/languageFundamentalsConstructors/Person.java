package com.languageFundamentalsConstructors;
import java.util.Scanner;
class Trainer {
	Scanner sc = new Scanner(System.in);
	String name;
	int age;

	void display() {
		System.out.println("Enter Name:");
		String name=sc.next();
		this.name=name;
		System.out.println("Trainer Name is :" + name);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		this.age=age;
		System.out.println("Trainer Age is:"+age);
	}
	void displayResult(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("Enter Name:");
		String n =sc.next();
		System.out.println("Trainer Name is:"+n);
		System.out.println("Enter Age:");
		int a=sc.nextInt();
		System.out.println("Trainer Name is:"+a);		
	}

}

public class Person extends Trainer {
	Person() {
		System.out.println("Enter Name:");
		String name =sc.next();
		this.name=name;
		System.out.println("Person Name is:" + super.name);
	}

	void show() {

		super.display();
		super.displayResult("Vishwa",45);
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.show();

	}

}
