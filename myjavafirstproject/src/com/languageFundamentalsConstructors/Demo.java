package com.languageFundamentalsConstructors;

public class Demo {

	Demo() {
		System.out.println("A");
	}

	Demo(int a) {
		System.out.println("B");
	}

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo(10);
	}

}
