package com.myjavaintroduction;

public class Demo2 {

	public static void main(String[] args) {
		method1();
	}

	static void method1() {
		method2();
		System.out.println("Method1 Called");
	}

	static void method2() {
		Demo2 d = new Demo2();
		d.method3();
		System.out.println("Method2 Called");
	}

	void method3() {
		method4();
		System.out.println("Method3 Called");
	}

	void method4() {
		System.out.println("Method4 Called");
	}
}
